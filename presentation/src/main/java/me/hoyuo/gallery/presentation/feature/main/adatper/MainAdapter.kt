package me.hoyuo.gallery.presentation.feature.main.adatper

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import me.hoyuo.gallery.presentation.model.ImageListData
import timber.log.Timber

class MainAdapter(
    private val itemClickListener: (String) -> Unit,
) : RecyclerView.Adapter<ImageViewHolder>() {
    private val list: MutableList<ImageListData> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ImageViewHolder.create(parent)

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(list[position], itemClickListener)
    }

    override fun getItemCount(): Int = list.size

    fun updateList(addList: List<ImageListData>) {
        Timber.d("updateList: ${addList.size}")
        val startPosition = list.size
        list.addAll(addList)

        notifyItemRangeInserted(startPosition, addList.size)
    }

    fun setList(list: List<ImageListData>) {
        Timber.d("setList: ${list.size}")
        this.list.clear()
        this.list.addAll(list)

        notifyDataSetChanged()
    }
}
