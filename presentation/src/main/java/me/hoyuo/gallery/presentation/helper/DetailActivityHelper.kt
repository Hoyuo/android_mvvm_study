package me.hoyuo.gallery.presentation.helper

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import me.hoyuo.gallery.presentation.feature.detail.DetailActivity

object DetailActivityHelper {
    private const val BUNDLE_KEY = "DetailActivity_BUNDLE"
    private const val IMAGE_ID = "IMAGE_ID"

    fun getNavigationIntent(context: Context, imageId: String): Intent {
        return Intent(context, DetailActivity::class.java)
            .putExtra(BUNDLE_KEY, Bundle().apply {
                putString(IMAGE_ID, imageId)
            })
    }

    fun getArguments(savedStateHandle: SavedStateHandle): Bundle? {
        return savedStateHandle.get(BUNDLE_KEY)
    }

    fun getImageId(savedStateHandle: SavedStateHandle): String {
        return getArguments(savedStateHandle)?.getString(IMAGE_ID, "") ?: ""
    }
}
