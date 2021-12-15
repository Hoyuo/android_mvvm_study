package me.hoyuo.gallery.data.source

import io.reactivex.rxjava3.core.Single
import me.hoyuo.gallery.data.model.ImageDataModel
import me.hoyuo.gallery.domain.model.ImageEntity
import me.hoyuo.gallery.domain.repository.Repository

class RepositoryImpl(
    private val dataSource: DataSource,
) : Repository {
    override fun getListImages(page: Int, limit: Int): Single<List<ImageEntity>> {
        return dataSource
            .getListImages(page, limit)
            .map { it.map(ImageDataModel::toEntity) }
    }

    override fun getImageDetails(id: String): Single<ImageEntity> {
        return dataSource
            .getImageDetails(id)
            .map(ImageDataModel::toEntity)
    }
}
