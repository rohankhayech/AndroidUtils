/*
 * Copyright 2023 Rohan Khayech
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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

            pom {
                name.set("Android Preview Utils")
                description.set("Utilities for Compose previews.")
                url.set("https://github.com/rohankhayech/AndroidUtils")

                licenses {
                    license {
                        name.set("Apache License, Version 2.0")
                        url.set("https://github.com/rohankhayech/AndroidUtils/blob/main/LICENSE")
                    }
                }

                developers {
                    developer {
                        id.set("rohankhayech")
                        name.set("Rohan Khayech")
                    }
                }
            }
        }
    }
}

dependencies {
    // Android
    implementation("com.google.android.material:material:1.9.0")

    // Compose
    //noinspection GradleDependency (Unnecessary recomposition on >1.4.0-alpha03)
    api("androidx.compose.material:material:1.3.1")
    //noinspection GradleDependency (Unnecessary recomposition on >1.4.0-alpha03)
    implementation("androidx.compose.ui:ui-tooling-preview:1.3.3")
    //noinspection GradleDependency (Unnecessary recomposition on >1.4.0-alpha03)
    debugImplementation("androidx.compose.ui:ui-tooling:1.3.3")

    // Testing
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // Dokka
    dokkaPlugin("org.jetbrains.dokka:android-documentation-plugin:1.9.0")
}