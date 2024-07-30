plugins {
    //Dagger-hilt kapt
    id("kotlin-kapt")

    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    //Dagger-Hilt
    implementation(libs.hilt.core)
    kapt(libs.hilt.compiler)
    //kotlin coroutines
    implementation(libs.coroutines)
}
kapt {
    correctErrorTypes = true
}