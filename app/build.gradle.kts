plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
    id("io.gitlab.arturbosch.detekt")
}

android {
    compileSdk = Versions.compileSdk

    defaultConfig {
        applicationId = "me.hoyuo.gallery"
        minSdk = Versions.minSdk
        targetSdk = Versions.targetSdk
        versionCode = Versions.versionCode
        versionName = Versions.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    lint {
        isCheckReleaseBuilds = false
        isAbortOnError = false
    }
    buildFeatures {
        dataBinding = true
        viewBinding = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }
}

dependencies {
    implementation(project(":base"))
    implementation(project(":domain"))
    implementation(project(":data"))
    implementation(project(":data:remote"))
    implementation(project(":presentation"))

    implementation(Dependency.Kotlin.stdlib)
    implementation(Dependency.Kotlin.Coroutines.core)
    implementation(Dependency.Kotlin.Coroutines.android)
    implementation(Dependency.Kotlin.serialization)

    implementation(Dependency.AndroidX.core)
    implementation(Dependency.AndroidX.appcompat)
    implementation(Dependency.AndroidX.material)
    implementation(Dependency.AndroidX.annotation)
    implementation(Dependency.AndroidX.recyclerview)
    implementation(Dependency.AndroidX.activity)
    implementation(Dependency.AndroidX.fragment)
    implementation(Dependency.AndroidX.viewpager2)
    implementation(Dependency.AndroidX.java8)
    implementation(Dependency.AndroidX.lifecycle)
    implementation(Dependency.AndroidX.liveData)
    implementation(Dependency.AndroidX.viewModel)
    implementation(Dependency.AndroidX.process)

    implementation(Dependency.Hilt.hilt)
    kapt(Dependency.Hilt.compiler)

    implementation(Dependency.OkHttp3.okhttp)
    implementation(Dependency.OkHttp3.logging)

    implementation(Dependency.Retrofit2.retrofit)
    implementation(Dependency.Retrofit2.rxjava)
    implementation(Dependency.Retrofit2.json)

    implementation(Dependency.Glide.glide)
    kapt(Dependency.Glide.annotation)

    implementation(Dependency.Rx.android)
    implementation(Dependency.Rx.java)
    implementation(Dependency.Rx.kotlin)

    implementation(Dependency.multiDex)

    debugImplementation(Dependency.Flipper.flipper)
    debugImplementation(Dependency.Flipper.network)
    debugImplementation(Dependency.Flipper.canary2)
    debugImplementation(Dependency.Flipper.soloader)

    debugImplementation(Dependency.canary2)

    implementation(Dependency.timber)

    // test
    androidTestImplementation(Dependency.Test.AndroidX.core)

    androidTestImplementation(Dependency.Test.AndroidX.runner)
    androidTestImplementation(Dependency.Test.AndroidX.rules)

    androidTestImplementation(Dependency.Test.AndroidX.junit)
    androidTestImplementation(Dependency.Test.AndroidX.truth)
    androidTestUtil(Dependency.Test.AndroidX.orchestrator)

    androidTestImplementation(Dependency.Test.Espresso.core)
    androidTestImplementation(Dependency.Test.Espresso.contrib)
    androidTestImplementation(Dependency.Test.Espresso.intents)
    androidTestImplementation(Dependency.Test.Espresso.accessibility)
    androidTestImplementation(Dependency.Test.Espresso.web)
    androidTestImplementation(Dependency.Test.Espresso.idlingConcurrent)
    androidTestImplementation(Dependency.Test.Espresso.idlingResource)

    androidTestImplementation(Dependency.Test.uiAutomator)

    androidTestImplementation(Dependency.Test.Junit.api)

    testImplementation(Dependency.Test.Junit.api)
    testImplementation(Dependency.Test.mockito)

    androidTestImplementation(Dependency.Test.hilt)
    kaptAndroidTest(Dependency.Hilt.compiler)

    testImplementation(Dependency.Test.hilt)
    kaptTest(Dependency.Hilt.compiler)
}
