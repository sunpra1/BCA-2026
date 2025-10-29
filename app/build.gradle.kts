plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.sunpra.bca_2026"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.sunpra.bca_2026"
        minSdk = 24
        targetSdk = 36
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.material)

    implementation(libs.appcompat)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
//    implementation("androidx.appcompat:appcompat:1.7.1")

    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}