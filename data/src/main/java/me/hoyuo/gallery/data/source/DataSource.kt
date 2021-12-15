package me.hoyuo.gallery.data.source

import io.reactivex.rxjava3.core.Single
import me.hoyuo.gallery.data.model.ImageDataModel

interface DataSource {
    fun getListImages(page: Int, limit: Int): Single<List<ImageDataModel>>

    fun getImageDetails(id: String): Single<ImageDataModel>
}
