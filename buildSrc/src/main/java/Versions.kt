object Versions {
    const val compileSdk = 31
    const val minSdk = 21
    const val targetSdk = 31
    private const val majorVersion = "1"
    private const val minorVersion = "0"
    private const val patchVersion = "0"
    const val versionCode = 1
    const val versionName = "${majorVersion}.${minorVersion}.${patchVersion}"

    // gradle plugin
    const val buildGradle = "7.0.4"

    // kotlin
    const val kotlin = "1.5.31"
    const val coroutines = "1.5.2"
    const val serialization = "1.3.0"

    // hilt
    const val hilt = "2.40"

    // detekt
    const val detekt = "1.18.0"

    // Flipper
    const val flipper = "0.125.0"
    const val soloader = "0.10.1"

    // canary2
    const val canary = "2.7"

    // Timber
    const val timber = "5.0.1"

    // AndroidX
    const val core = "1.7.0"
    const val appcompat = "1.3.1"
    const val activity = "1.4.0"
    const val fragment = "1.3.6"
    const val viewpager2 = "1.1.0-beta01"
    const val material = "1.4.0"
    const val lifecycle = "2.4.0"
    const val recyclerview = "1.2.1"
    const val swipeRefreshLayout = "1.1.0"
    const val constraintLayout = "2.1.1"
    const val annotation = "1.3.0"

    // Retrofit
    const val retrofit2 = "2.9.0"

    // Okhttp3
    const val okhttp3 = "4.9.2"

    // Glide
    const val glide = "4.12.0"

    // Rx
    object Rx {
        const val java = "3.1.2"
        const val kotlin = "3.0.1"
        const val android = "3.0.0"
    }

    const val multidex = "2.0.1"

    object Test {
        const val android = "1.4.0"
        const val junit = "1.1.3"
        const val truth = "1.4.0"
        const val espresso = "3.4.0"
        const val junit4 = "4.13.2"
        const val uiAutomator = "2.2.0"
        const val mockito = "4.0.0"
    }
}
