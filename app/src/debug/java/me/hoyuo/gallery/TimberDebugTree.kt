package me.hoyuo.gallery

import timber.log.Timber

class TimberDebugTree(
    private val tag: String,
) : Timber.DebugTree() {

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        super.log(priority, this.tag, "$tag#$message", t)
    }

    override fun createStackElementTag(element: StackTraceElement): String? {
        return "(${element.fileName}:${element.lineNumber})"
    }
}
