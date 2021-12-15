package me.hoyuo.gallery.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import me.hoyuo.gallery.base.data.model.DataModel
import me.hoyuo.gallery.base.domain.mapper.EntityMapper
import me.hoyuo.gallery.domain.model.ImageEntity

@Parcelize
data class ImageDataModel(
    val id: String,
    val author: String,
    val width: Int,
    val height: Int,
    val url: String,
    val downloadUrl: String,
) : Parcelable, DataModel {
    companion object : EntityMapper<ImageDataModel, ImageEntity> {
        override fun toEntity(dataModel: ImageDataModel): ImageEntity {
            return with(dataModel) {
                ImageEntity(
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
}
