package me.hoyuo.gallery.base.presentation.mapper

import me.hoyuo.gallery.base.domain.model.Entity
import me.hoyuo.gallery.base.presentation.model.PresentationModel

interface PresentationModelMapper<in E : Entity, out P : PresentationModel> {
    fun toPresentationModel(entity: E): P
}
