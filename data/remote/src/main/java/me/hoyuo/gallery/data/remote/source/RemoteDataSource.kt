package me.hoyuo.gallery.data.remote.source

import io.reactivex.rxjava3.core.Single
import me.hoyuo.gallery.base.exception.ResponseExceptionHandler
import me.hoyuo.gallery.data.model.ImageDataModel
import me.hoyuo.gallery.data.remote.api.PicsumApi
import me.hoyuo.gallery.data.remote.model.ImageResponse
import me.hoyuo.gallery.data.source.DataSource

class RemoteDataSource constructor(
    private val picsumApi: PicsumApi,
) : DataSource {
    override fun getListImages(page: Int, limit: Int): Single<List<ImageDataModel>> {
        return picsumApi
            .getListImages(page, limit)
            .map { it.map(ImageResponse::toDataModel) }
            .compose(ResponseExceptionHandler())
    }

    override fun getImageDetails(id: String): Single<ImageDataModel> {
        return picsumApi
            .getImageDetails(id)
            .map(ImageResponse::toDataModel)
            .compose(ResponseExceptionHandler())
    }
}
