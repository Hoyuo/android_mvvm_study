package me.hoyuo.gallery

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import io.reactivex.rxjava3.plugins.RxJavaPlugins
import timber.log.Timber

@HiltAndroidApp
open class GalleryApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        RxJavaPlugins.setErrorHandler { Timber.w(it) }
    }
}
