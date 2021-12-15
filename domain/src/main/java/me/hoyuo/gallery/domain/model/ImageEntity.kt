package me.hoyuo.gallery.domain.model

import me.hoyuo.gallery.base.domain.model.Entity

data class ImageEntity(
    val id: String,
    val author: String,
    val width: Int,
    val height: Int,
    val url: String,
    val downloadUrl: String,
) : Entity
