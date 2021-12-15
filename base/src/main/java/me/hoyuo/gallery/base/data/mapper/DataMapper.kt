package me.hoyuo.gallery.base.data.mapper

import me.hoyuo.gallery.base.data.model.DataModel
import me.hoyuo.gallery.base.data.model.remote.ResponseModel

interface DataMapper<in R : ResponseModel, out D : DataModel> {
    fun toDataModel(response: R): D
}
