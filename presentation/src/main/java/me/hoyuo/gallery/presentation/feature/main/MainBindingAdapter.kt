package me.hoyuo.gallery.presentation.feature.main

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import me.hoyuo.gallery.presentation.feature.main.adatper.MainAdapter
import me.hoyuo.gallery.presentation.model.ImageListData
import timber.log.Timber

@BindingAdapter("bind:setList")
fun RecyclerView.setList(list: List<ImageListData>?) {
    (adapter as? MainAdapter)?.setList(list ?: emptyList())
}

@BindingAdapter("bind:addList")
fun RecyclerView.addList(addList: List<ImageListData>?) {
    (adapter as? MainAdapter)?.updateList(addList ?: emptyList())
}

@BindingAdapter("bind:imgSrc")
fun ImageView.setImageSrc(imageSrc: String?) {
    Timber.d("setImageSrc: $imageSrc")
    if (!imageSrc.isNullOrEmpty()) {
        Glide.with(this.context)
            .load(imageSrc)
            .thumbnail(0.1f)
            .into(this)
    }
}
