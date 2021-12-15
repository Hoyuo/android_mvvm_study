plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-parcelize")
    kotlin("plugin.serialization")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = Versions.compileSdk

    defaultConfig {
        minSdk = Versions.minSdk
        targetSdk = Versions.targetSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro")
        }
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
    implementation(project(":data"))

    implementation(Dependency.Kotlin.stdlib)
    implementation(Dependency.Kotlin.serialization)

    implementation(Dependency.Hilt.hilt)
    kapt(Dependency.Hilt.compiler)

    implementation(Dependency.Rx.java)
    implementation(Dependency.Rx.kotlin)

    implementation(Dependency.timber)

    debugImplementation(Dependency.Flipper.flipper)
    debugImplementation(Dependency.Flipper.network)

    implementation(Dependency.OkHttp3.okhttp)
    implementation(Dependency.OkHttp3.logging)

    implementation(Dependency.Retrofit2.retrofit)
    implementation(Dependency.Retrofit2.rxjava)
    implementation(Dependency.Retrofit2.json)
}
