/*
 * Copyright 2025 Rohan Khayech
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

package com.rohankhayech.android.util.ui.theme.m3

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.rohankhayech.android.util.ui.preview.DarkPreview
import com.rohankhayech.android.util.ui.preview.ThemePreview
import com.rohankhayech.android.util.ui.preview.m3.ColorSwatch

/** Preview for [trueDark]. */
@DarkPreview
@Composable
private fun TrueDarkColorsPreview() {
    MaterialTheme(colorScheme = darkColorScheme().trueDark()) {
        ColorSwatch()
        com.rohankhayech.android.util.ui.preview.ColorSwatch()
    }
}

/** Preview for [trueDark]. */
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ThemePreview
@Composable
private fun PrimaryBackgroundPreview() {
    AdaptableMaterialTheme {
        Column {
            Surface(
                Modifier
                    .height(80.dp).fillMaxWidth(),
                color = MaterialTheme.colorScheme.primaryBackground
            ) {
                Text(
                    text = "Primary Background",
                    Modifier.padding(8.dp),
                    style = androidx.compose.material.MaterialTheme.typography.subtitle2
                )
            }
            Surface(
                Modifier
                    .height(80.dp).fillMaxWidth(),
                color = MaterialTheme.colorScheme.background
            ) {}
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ThemePreview
@Composable
private fun PrimaryContainerBackgroundPreview() {
    AdaptableMaterialTheme {
        Column {
            Surface(
                Modifier
                    .height(80.dp).fillMaxWidth(),
                color = MaterialTheme.colorScheme.primaryContainerBackground
            ) {
                Text(
                    text = "Primary Container Background",
                    Modifier.padding(8.dp),
                    style = androidx.compose.material.MaterialTheme.typography.subtitle2
                )
            }
            Surface(
                Modifier
                    .height(80.dp).fillMaxWidth(),
                color = MaterialTheme.colorScheme.background
            ) {}
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@DarkPreview
@Composable
private fun PrimaryContainerBackgroundTrueDarkPreview() {
    AdaptableMaterialTheme(trueDark = true) {
        Column {
            Surface(
                Modifier
                    .height(80.dp),
                color = MaterialTheme.colorScheme.primaryContainerBackground
            ) {
                Text(
                    text = "Primary Container Background",
                    Modifier.padding(8.dp).fillMaxWidth(),
                    style = androidx.compose.material.MaterialTheme.typography.subtitle2
                )
            }
            Surface(
                Modifier
                    .height(80.dp).fillMaxWidth(),
                color = MaterialTheme.colorScheme.background
            ) {}
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@ThemePreview
@Composable
private fun VibrantContainerPreview() {
    AdaptableMaterialTheme {
        Column {
            Surface(
                Modifier
                    .height(80.dp).fillMaxWidth(),
                color = MaterialTheme.colorScheme.vibrantContainer
            ) {
                Text(
                    text = "Vibrant Container",
                    Modifier.padding(8.dp),
                    style = androidx.compose.material.MaterialTheme.typography.subtitle2
                )
            }
            Surface(
                Modifier
                    .height(80.dp).fillMaxWidth(),
                color = MaterialTheme.colorScheme.background
            ) {}
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@DarkPreview
@Composable
private fun VibrantContainerTrueDarkPreview() {
    AdaptableMaterialTheme(trueDark = true) {
        Column {
            Surface(
                Modifier
                    .height(80.dp).fillMaxWidth(),
                color = MaterialTheme.colorScheme.vibrantContainer
            ) {
                Text(
                    text = "Vibrant Container",
                    Modifier.padding(8.dp),
                    style = androidx.compose.material.MaterialTheme.typography.subtitle2
                )
            }
            Surface(
                Modifier
                    .height(80.dp).fillMaxWidth(),
                color = MaterialTheme.colorScheme.background
            ) {}
        }
    }
}
