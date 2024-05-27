plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.navigation_camino_del_guerrero"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.navigation_camino_del_guerrero"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    buildFeatures {
        viewBinding = true
    }

}

dependencies {
    // Libraries
    implementation(libs.appcompat.get())
    implementation(libs.material.get())
    implementation(libs.activity.get())
    implementation(libs.constraintlayout.get())

    // AndroidX
    implementation("androidx.navigation:navigation-fragment:2.3.0")
    implementation("androidx.navigation:navigation-ui:2.3.0")
    implementation("androidx.viewpager2:viewpager2:1.0.0")

    // Material Design
    implementation("com.google.android.material:material:1.3.0-alpha03")

    // Testing
    testImplementation(libs.junit.get())
    androidTestImplementation(libs.ext.junit.get())
    androidTestImplementation(libs.espresso.core.get())
}