package me.hoyuo.gallery.presentation.feature.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.rxjava3.kotlin.subscribeBy
import javax.inject.Inject
import me.hoyuo.gallery.base.presentation.BaseViewModel
import me.hoyuo.gallery.base.presentation.util.ioToMain
import me.hoyuo.gallery.base.presentation.util.livedata.Event
import me.hoyuo.gallery.domain.usecase.GetListImagesUseCase
import me.hoyuo.gallery.presentation.model.ImageListData

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getListImagesUseCase: GetListImagesUseCase,
) : BaseViewModel() {

    private val _event = MutableLiveData<Event<Boolean>>()
    val event: LiveData<Event<Boolean>>
        get() = _event

    private val _list = MutableLiveData<List<ImageListData>>(emptyList())
    val list: LiveData<List<ImageListData>>
        get() = _list

    private val _addList = MutableLiveData<List<ImageListData>>(emptyList())
    val addList: LiveData<List<ImageListData>>
        get() = _addList

    private var page = 1

    init {
        initLoad()
    }

    fun initLoad() {
        page = 1
        pageLoad()
    }

    fun pageLoad() {
        getListImagesUseCase(page = page)
            .map { it.map(ImageListData::toPresentationModel) }
            .ioToMain()
            .doOnSubscribe {
                sendEvent(true)
            }
            .subscribeBy {
                if (it.isEmpty()) return@subscribeBy

                if (page == 1) {
                    _list.value = it
                } else {
                    _addList.value = it
                }
                sendEvent(false)
                page += 1
            }
            .addToDisposable()
    }

    private fun sendEvent(status: Boolean) {
        _event.value = Event(status)
    }
}
