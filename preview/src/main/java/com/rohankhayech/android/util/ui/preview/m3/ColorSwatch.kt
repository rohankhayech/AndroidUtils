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

package com.rohankhayech.android.util.ui.preview.m3

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Color swatch displaying all the colors in the current material theme.
 * Useful for previewing themes.
 *
 * @author Rohan Khayech
 */
@Composable
fun ColorSwatch() {
    Surface(color = MaterialTheme.colorScheme.background) {
        Column(Modifier.padding(16.dp)) {
            Text("Colors", Modifier.padding(bottom = 8.dp), style = MaterialTheme.typography.titleSmall)
            Row(Modifier.fillMaxWidth()) {
                ColorSwatch(name = "Primary", color = MaterialTheme.colorScheme.primary)
                ColorSwatch(name = "Secondary", color = MaterialTheme.colorScheme.secondary)
                ColorSwatch(name = "Tertiary", color = MaterialTheme.colorScheme.tertiary)
                ColorSwatch(name = "Error", color = MaterialTheme.colorScheme.error)
            }
            Row(Modifier.fillMaxWidth()) {
                ColorSwatch(name = "Primary Container", color = MaterialTheme.colorScheme.primaryContainer)
                ColorSwatch(name = "Secondary Container", color = MaterialTheme.colorScheme.secondaryContainer)
                ColorSwatch(name = "Tertiary Container", color = MaterialTheme.colorScheme.tertiaryContainer)
                ColorSwatch(name = "Error Container", color = MaterialTheme.colorScheme.errorContainer)
            }
            Row(Modifier.fillMaxWidth()) {
                ColorSwatch(name = "Surface Dim", color = MaterialTheme.colorScheme.surfaceDim)
                ColorSwatch(name = "Secondary Container", color = MaterialTheme.colorScheme.surface)
                ColorSwatch(name = "Tertiary Container", color = MaterialTheme.colorScheme.surfaceBright)
                ColorSwatch(name = "Error Container", color = MaterialTheme.colorScheme.inverseSurface)
            }
        }
    }
}

@Composable
private fun RowScope.ColorSwatch(
    name: String,
    color: Color
) {
    Surface(
        Modifier
            .weight(1f)
            .height(80.dp),
        color = color
    ) {
        Text(text = name, Modifier.padding(8.dp), style = MaterialTheme.typography.titleSmall)
    }
}