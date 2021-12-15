package me.hoyuo.gallery.presentation.feature.main.adatper

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import me.hoyuo.gallery.presentation.databinding.ViewImageHolderBinding
import me.hoyuo.gallery.presentation.model.ImageListData

class ImageViewHolder(
    private val binding: ViewImageHolderBinding,
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ImageListData, itemClickListener: (String) -> Unit) {
        with(binding) {
            imgSrc = item.downloadUrl
            root.setOnClickListener {
                itemClickListener(item.id)
            }
        }
    }

    companion object {
        fun create(parent: ViewGroup) = ImageViewHolder(
            ViewImageHolderBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }
}
