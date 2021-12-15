package me.hoyuo.gallery.presentation.helper

import android.content.Context
import android.content.Intent
import android.os.Bundle
import me.hoyuo.gallery.presentation.feature.detail.DetailActivity

object DetailActivityHelper {
    private const val BUNDLE_KEY = "DetailActivityHelper_BUNDLE"
    private const val IMAGE_ID = "IMAGE_ID"

    fun getNavigationIntent(context: Context, imageId: String): Intent {
        return Intent(context, DetailActivity::class.java)
            .putExtra(BUNDLE_KEY, Bundle().apply {
                putString(IMAGE_ID, imageId)
            })
    }

    fun getArguments(intent: Intent?): Bundle? {
        return intent?.getBundleExtra(BUNDLE_KEY)
    }

    fun getImageId(bundle: Bundle): String {
        return bundle.getString(IMAGE_ID, "") ?: ""
    }
}
