object Dependency {
    object GradlePlugin {
        const val build =
            "com.android.tools.build:gradle:${Versions.buildGradle}"
        const val kotlin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
        const val kotlin_serialization =
            "org.jetbrains.kotlin:kotlin-serialization:${Versions.kotlin}"
        const val detekt =
            "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:${Versions.detekt}"
        const val hilt =
            "com.google.dagger:hilt-android-gradle-plugin:${Versions.hilt}"
    }

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"

        object Coroutines {
            const val core =
                "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
            const val android =
                "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        }

        const val serialization =
            "org.jetbrains.kotlinx:kotlinx-serialization-json:${Versions.serialization}"
    }

    object AndroidX {
        const val core =
            "androidx.core:core-ktx:${Versions.core}"
        const val appcompat =
            "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val material =
            "com.google.android.material:material:${Versions.material}"
        const val annotation =
            "androidx.annotation:annotation:${Versions.annotation}"
        const val recyclerview =
            "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
        const val swiperefreshlayout =
            "androidx.swiperefreshlayout:swiperefreshlayout:${Versions.swipeRefreshLayout}"
        const val constraintlayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
        const val activity =
            "androidx.activity:activity-ktx:${Versions.activity}"
        const val fragment =
            "androidx.fragment:fragment-ktx:${Versions.fragment}"
        const val viewpager2 =
            "androidx.viewpager2:viewpager2:${Versions.viewpager2}"
        const val java8 =
            "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
        const val liveData =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle}"
        const val viewModel =
            "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
        const val lifecycle =
            "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycle}"
        const val process =
            "androidx.lifecycle:lifecycle-process:${Versions.lifecycle}"
    }

    object Hilt {
        const val hilt =
            "com.google.dagger:hilt-android:${Versions.hilt}"
        const val compiler =
            "com.google.dagger:hilt-compiler:${Versions.hilt}"
    }

    object Flipper {
        const val flipper =
            "com.facebook.flipper:flipper:${Versions.flipper}"
        const val network =
            "com.facebook.flipper:flipper-network-plugin:${Versions.flipper}"
        const val canary2 =
            "com.facebook.flipper:flipper-leakcanary2-plugin:${Versions.flipper}"
        const val soloader =
            "com.facebook.soloader:soloader:${Versions.soloader}"
    }

    const val canary2 =
        "com.squareup.leakcanary:leakcanary-android:${Versions.canary}"

    const val timber =
        "com.jakewharton.timber:timber:${Versions.timber}"

    object OkHttp3 {
        const val okhttp =
            "com.squareup.okhttp3:okhttp:${Versions.okhttp3}"
        const val logging =
            "com.squareup.okhttp3:logging-interceptor:${Versions.okhttp3}"
    }

    object Retrofit2 {
        const val retrofit =
            "com.squareup.retrofit2:retrofit:${Versions.retrofit2}"
        const val rxjava =
            "com.squareup.retrofit2:adapter-rxjava3:${Versions.retrofit2}"
        const val json =
            "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0"
    }

    object Glide {
        const val glide =
            "com.github.bumptech.glide:glide:${Versions.glide}"
        const val annotation =
            "com.github.bumptech.glide:compiler:${Versions.glide}"
    }

    object Rx {
        const val android =
            "io.reactivex.rxjava3:rxandroid:${Versions.Rx.android}"
        const val java =
            "io.reactivex.rxjava3:rxjava:${Versions.Rx.java}"
        const val kotlin =
            "io.reactivex.rxjava3:rxkotlin:${Versions.Rx.kotlin}"
    }

    const val multiDex = "androidx.multidex:multidex:${Versions.multidex}"

    object Test {
        const val hilt =
            "com.google.dagger:hilt-android-testing:${Versions.hilt}"

        object AndroidX {
            const val core =
                "androidx.test:core-ktx:${Versions.Test.android}"
            const val runner =
                "androidx.test:runner:${Versions.Test.android}"
            const val rules =
                "androidx.test:rules:${Versions.Test.android}"
            const val truth =
                "androidx.test.ext:truth:${Versions.Test.android}"
            const val junit =
                "androidx.test.ext:junit-ktx:${Versions.Test.junit}"
            const val orchestrator =
                "androidx.test:orchestrator:${Versions.Test.android}"
        }

        object Espresso {
            const val core =
                "androidx.test.espresso:espresso-core:${Versions.Test.espresso}"
            const val contrib =
                "androidx.test.espresso:espresso-contrib:${Versions.Test.espresso}"
            const val intents =
                "androidx.test.espresso:espresso-intents:${Versions.Test.espresso}"
            const val accessibility =
                "androidx.test.espresso:espresso-accessibility:${Versions.Test.espresso}"
            const val web =
                "androidx.test.espresso:espresso-web:${Versions.Test.espresso}"
            const val idlingConcurrent =
                "androidx.test.espresso.idling:idling-concurrent:${Versions.Test.espresso}"
            const val idlingResource =
                "androidx.test.espresso:espresso-idling-resource:${Versions.Test.espresso}"
        }

        object Junit {
            const val api =
                "junit:junit:${Versions.Test.junit4}"
        }

        const val uiAutomator =
            "androidx.test.uiautomator:uiautomator:${Versions.Test.uiAutomator}"
        const val mockito =
            "org.mockito:mockito-core:${Versions.Test.mockito}"
    }
}
