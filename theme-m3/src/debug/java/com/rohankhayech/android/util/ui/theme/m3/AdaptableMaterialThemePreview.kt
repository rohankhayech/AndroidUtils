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

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.rohankhayech.android.util.ui.preview.DarkPreview
import com.rohankhayech.android.util.ui.preview.ThemePreview
import com.rohankhayech.android.util.ui.preview.m3.ColorSwatch

@Composable
private fun PreviewContent() {
    Surface(color = MaterialTheme.colorScheme.background) {
        Column {
            ColorSwatch()
            Text("True dark: ${MaterialTheme.isTrueDark}")
            Text("Dynamic color: ${MaterialTheme.isDynamicColor}")
        }
    }
}

@ThemePreview
@Composable
private fun Preview() {
    AdaptableMaterialTheme {
        PreviewContent()
    }
}

@DarkPreview
@Composable
private fun TrueDarkPreview() {
    AdaptableMaterialTheme(trueDark = true) {
        PreviewContent()
    }
}

@ThemePreview
@Composable
private fun DynamicPreview() {
    AdaptableMaterialTheme(dynamicColor = true) {
        PreviewContent()
    }
}

@DarkPreview
@Composable
private fun DynamicTrueDarkPreview() {
    AdaptableMaterialTheme(trueDark = true, dynamicColor = true) {
        PreviewContent()
    }
}

/** Preview of default composition local values. */
@Preview
@Composable
private fun DefaultPreview() {
    MaterialTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            Column {
                Text("True dark: ${MaterialTheme.isTrueDark}")
                Text("Dynamic color: ${MaterialTheme.isDynamicColor}")
            }
        }
    }
}