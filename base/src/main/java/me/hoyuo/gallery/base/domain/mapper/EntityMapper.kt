package me.hoyuo.gallery.base.domain.mapper

import me.hoyuo.gallery.base.data.model.DataModel
import me.hoyuo.gallery.base.domain.model.Entity

interface EntityMapper<in D : DataModel, out E : Entity> {
    fun toEntity(dataModel: D): E
}
