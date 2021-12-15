package me.hoyuo.gallery.presentation.feature.detail

import android.os.Bundle
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject
import io.reactivex.rxjava3.kotlin.subscribeBy
import me.hoyuo.gallery.base.presentation.BaseViewModel
import me.hoyuo.gallery.base.presentation.util.ioToMain
import me.hoyuo.gallery.domain.usecase.GetImageDetailsUseCase
import me.hoyuo.gallery.presentation.helper.DetailActivityHelper
import me.hoyuo.gallery.presentation.model.ImageData

class DetailViewModel @AssistedInject constructor(
    imageDetailsUseCase: GetImageDetailsUseCase,
    @Assisted private val bundle: Bundle,
) : BaseViewModel() {

    private val imageId: String by lazy {
        DetailActivityHelper.getImageId(bundle)
    }

    private val _data = MutableLiveData<ImageData>()
    val data: LiveData<ImageData>
        get() = _data

    init {
        imageDetailsUseCase(imageId)
            .map(ImageData::toPresentationModel)
            .ioToMain()
            .subscribeBy {
                _data.value = it
            }
            .addToDisposable()
    }

    @dagger.assisted.AssistedFactory
    interface AssistedFactory {
        fun create(bundle: Bundle?): DetailViewModel
    }

    companion object {
        fun provideFactory(
            assistedFactory: AssistedFactory,
            bundle: Bundle?,
        ): ViewModelProvider.Factory = object : ViewModelProvider.Factory {
            @Suppress("UNCHECKED_CAST")
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                return assistedFactory.create(bundle) as T
            }
        }
    }
}
