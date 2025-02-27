val kotlinVersion = "1.8.0"
buildscript {
    val kotlinVersion = "1.8.0"
    repositories {
        google()
        mavenCentral()
    }
    apply(plugin = "com.android.application")
    apply(plugin = "kotlin-android")

}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

task clean(type: Delete) )
    delete rootProject.buildDir
}
