package me.hoyuo.gallery.base.presentation.util.livedata

val EventLiveData<Boolean>.valueOrDefault: Boolean
    get() {
        return getValue() ?: false
    }

val EventLiveData<Byte>.valueOrDefault: Byte
    get() {
        return getValue() ?: 0
    }

val EventLiveData<Char>.valueOrDefault: Char
    get() {
        return getValue() ?: '\u0000'
    }

val EventLiveData<Double>.valueOrDefault: Double
    get() {
        return getValue() ?: 0.0
    }

val EventLiveData<Float>.valueOrDefault: Float
    get() {
        return getValue() ?: 0.0f
    }

val EventLiveData<Int>.valueOrDefault: Int
    get() {
        return getValue() ?: 0
    }

val EventLiveData<Long>.valueOrDefault: Long
    get() {
        return getValue() ?: 0L
    }

val EventLiveData<Short>.valueOrDefault: Short
    get() {
        return getValue() ?: 0
    }

val EventLiveData<String>.valueOrDefault: String
    get() {
        return getValue() ?: ""
    }

val EventLiveData<out List<*>>.size: Int
    get() {
        return getValue()?.size ?: 0
    }

val <T> EventLiveData<out List<T>>.list: List<T>
    get() {
        return getValue() ?: emptyList()
    }

operator fun <T> EventLiveData<out List<T>>.get(index: Int): T? {
    return this.getValue()?.get(index)
}
