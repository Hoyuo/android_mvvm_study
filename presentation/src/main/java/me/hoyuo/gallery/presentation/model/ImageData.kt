package me.hoyuo.gallery.presentation.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import me.hoyuo.gallery.base.presentation.mapper.PresentationModelMapper
import me.hoyuo.gallery.base.presentation.model.PresentationModel
import me.hoyuo.gallery.domain.model.ImageEntity

@Parcelize
class ImageData(
    val id: String,
    val author: String,
    val width: Int,
    val height: Int,
    val url: String,
    val downloadUrl: String,
) : Parcelable, PresentationModel {
    companion object : PresentationModelMapper<ImageEntity, ImageData> {
        override fun toPresentationModel(entity: ImageEntity) = with(entity) {
            ImageData(
                id = id,
                author = author,
                width = width,
                height = height,
                url = url,
                downloadUrl = downloadUrl
            )
        }
    }
}
