package me.hoyuo.gallery.presentation.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import me.hoyuo.gallery.base.presentation.mapper.PresentationModelMapper
import me.hoyuo.gallery.base.presentation.model.PresentationModel
import me.hoyuo.gallery.domain.model.ImageEntity

@Parcelize
class ImageListData(
    val id: String,
    val downloadUrl: String,
) : Parcelable, PresentationModel {
    companion object : PresentationModelMapper<ImageEntity, ImageListData> {
        override fun toPresentationModel(entity: ImageEntity) = with(entity) {
            val width = width / (height / 300)
            val height = 300
            ImageListData(
                id = id,
                downloadUrl = "https://picsum.photos/id/$id/$width/$height"
            )
        }
    }
}
