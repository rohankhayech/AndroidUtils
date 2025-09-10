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

package com.rohankhayech.android.util.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.rohankhayech.android.util.ui.preview.PreviewWrapper
import com.rohankhayech.android.util.ui.preview.ThemePreview

@ThemePreview
@Composable
private fun SecondaryButtonsPreview() {
    PreviewWrapper {
        Column(Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(colors = secondaryButtonColors(), onClick = {}) {
                Text(text = "Secondary Button")
            }
            TextButton(colors = secondaryTextButtonColors(), onClick = {}) {
                Text(text = "Secondary Text Button")
            }
        }
    }
}