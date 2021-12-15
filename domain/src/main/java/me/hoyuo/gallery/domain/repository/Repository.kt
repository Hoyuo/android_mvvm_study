package me.hoyuo.gallery.domain.repository

import io.reactivex.rxjava3.core.Single
import me.hoyuo.gallery.domain.entity.ImageEntity

interface Repository {
    fun getListImages(page: Int, limit: Int): Single<List<ImageEntity>>

    fun getImageDetails(id: String): Single<ImageEntity>
}
