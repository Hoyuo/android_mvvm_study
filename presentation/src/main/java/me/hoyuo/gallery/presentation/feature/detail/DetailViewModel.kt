package me.hoyuo.gallery.presentation.feature.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.kotlin.subscribeBy
import javax.inject.Inject
import me.hoyuo.gallery.base.presentation.BaseViewModel
import me.hoyuo.gallery.base.presentation.util.ioToMain
import me.hoyuo.gallery.domain.usecase.GetImageDetailsUseCase
import me.hoyuo.gallery.presentation.helper.DetailActivityHelper
import me.hoyuo.gallery.presentation.model.ImageData

@HiltViewModel
class DetailViewModel @Inject constructor(
    imageDetailsUseCase: GetImageDetailsUseCase,
    savedStateHandle: SavedStateHandle,
) : BaseViewModel() {

    private val imageId: String by lazy {
        DetailActivityHelper.getImageId(savedStateHandle)
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
}
