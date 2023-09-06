plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    namespace = "com.rohankhayech.android.util.ui.preview"
    compileSdk = 33

    defaultConfig {
        minSdk = 24
        aarMetadata {
            minCompileSdk = 24
        }
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
}

publishing {
    publications {
        register<MavenPublication>("release") {
            groupId = rootProject.group.toString()
            artifactId = project.name
            version = rootProject.version.toString()

            afterEvaluate {
                from(components["release"])
            }
        }
    }
}

dependencies {
    // Android
    implementation("androidx.core:core-ktx:1.10.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")

    // Compose
    api("androidx.compose.material:material:1.3.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.3.3")
    debugImplementation("androidx.compose.ui:ui-tooling:1.3.3")

    // Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Dokka
    dokkaPlugin("org.jetbrains.dokka:android-documentation-plugin:1.9.0")
}