package me.hoyuo.gallery.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import me.hoyuo.gallery.base.domain.model.Entity

@Parcelize
data class ImageEntity(
    val id: String,
    val author: String,
    val width: Int,
    val height: Int,
    val url: String,
    val downloadUrl: String,
) : Parcelable, Entity
