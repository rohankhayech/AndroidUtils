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

package com.rohankhayech.android.util.ui.preview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.MaterialTheme
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Surface
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Text
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
    Surface(color = MaterialTheme.colors.background) {
        Column(Modifier.padding(16.dp)) {
            Text("Colors", Modifier.padding(bottom = 8.dp), style = MaterialTheme.typography.subtitle2)
            Row(Modifier.fillMaxWidth()) {
                ColorSwatch(name = "Primary", color = MaterialTheme.colors.primary)
                ColorSwatch(name = "Primary Variant", color = MaterialTheme.colors.primaryVariant)
                ColorSwatch(name = "Secondary", color = MaterialTheme.colors.secondary)
                ColorSwatch(name = "Secondary Variant", color = MaterialTheme.colors.secondaryVariant)
            }
            Row(Modifier.fillMaxWidth()) {
                ColorSwatch(name = "Background", color = MaterialTheme.colors.background)
                ColorSwatch(name = "Surface", color = MaterialTheme.colors.surface)
                ColorSwatch(name = "Error", color = MaterialTheme.colors.error)
            }
        }
    }
}

@Composable
private fun RowScope.ColorSwatch(
    name: String,
    color: Color,
) {
    Surface(
        Modifier
            .weight(1f)
            .height(80.dp),
        color = color
    ) {
        Text(text = name, Modifier.padding(8.dp), style = MaterialTheme.typography.subtitle2)
    }
}