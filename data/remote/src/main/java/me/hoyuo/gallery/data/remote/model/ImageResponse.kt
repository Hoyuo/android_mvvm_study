package me.hoyuo.gallery.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import me.hoyuo.gallery.base.data.mapper.DataMapper
import me.hoyuo.gallery.base.data.model.remote.ResponseModel
import me.hoyuo.gallery.data.model.ImageDataModel

@Serializable
data class ImageResponse(
    @SerialName("id")
    val id: String, // 1
    @SerialName("author")
    val author: String, // Alejandro Escamilla
    @SerialName("width")
    val width: Int, // 5616
    @SerialName("height")
    val height: Int, // 3744
    @SerialName("url")
    val url: String, // https://unsplash.com/photos/LNRyGwIJr5c
    @SerialName("download_url")
    val downloadUrl: String, // https://picsum.photos/id/1/5616/3744
) : ResponseModel {
    companion object : DataMapper<ImageResponse, ImageDataModel> {
        override fun toDataModel(response: ImageResponse): ImageDataModel {
            return with(response) {
                ImageDataModel(
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
