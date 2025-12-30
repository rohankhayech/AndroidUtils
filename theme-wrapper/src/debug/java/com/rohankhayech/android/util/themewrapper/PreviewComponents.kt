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

package com.rohankhayech.android.util.themewrapper

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Checkbox
import androidx.compose.material.Divider
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TextField
import androidx.compose.material.TopAppBar
import androidx.compose.material.darkColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.lightColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rohankhayech.android.util.ui.preview.ColorSwatch
import androidx.compose.material3.Button as M3Button
import androidx.compose.material3.Card as M3Card
import androidx.compose.material3.Checkbox as M3Checkbox
import androidx.compose.material3.FloatingActionButton as M3FloatingActionButton
import androidx.compose.material3.Icon as M3Icon
import androidx.compose.material3.IconButton as M3IconButton
import androidx.compose.material3.ListItem as M3ListItem
import androidx.compose.material3.MaterialTheme as M3Theme
import androidx.compose.material3.OutlinedButton as M3OutlinedButton
import androidx.compose.material3.OutlinedTextField as M3OutlinedTextField
import androidx.compose.material3.Scaffold as M3Scaffold
import androidx.compose.material3.Switch as M3Switch
import androidx.compose.material3.Text as M3Text
import androidx.compose.material3.TextButton as M3TextButton
import androidx.compose.material3.TextField as M3TextField
import androidx.compose.material3.TopAppBar as M3TopAppBar
import com.rohankhayech.android.util.ui.preview.m3.ColorSwatch as M3ColorSwatch

@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
internal fun M2Components() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("App") },
                actions = {
                    IconButton(onClick = {}) {
                        Icon(Icons.Default.MoreVert, contentDescription = null)
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        }
    ) {
        Column(
            modifier = Modifier
                .padding(it)
                .padding(16.dp)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text("H1", style = MaterialTheme.typography.h1)
            Text("Subtitle 1", style = MaterialTheme.typography.subtitle1)
            Text("Body 1")
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Button({}) {
                    Text(text = "Button")
                }
                OutlinedButton({}) {
                    Text(text = "Button")
                }
                TextButton({}) {
                    Text(text = "Button")
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Switch(checked = true, onCheckedChange = {})
                Switch(checked = false, onCheckedChange = {})
            }
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Checkbox(checked = true, onCheckedChange = {})
                Checkbox(checked = false, onCheckedChange = {})
            }
            Divider()
            ListItem(
                text = { Text("Text") },
                secondaryText = { Text("Secondary Text") },
                overlineText = { Text("Overline") },
                trailing = { Text("Trailing") },
            )
            Card(elevation = 4.dp) {
                ListItem(
                    text = { Text("Text") },
                    secondaryText = { Text("Secondary Text") },
                    overlineText = { Text("Overline") },
                    trailing = { Text("Trailing") },
                )
            }
            TextField(label = {Text("Label")}, value = "Text", onValueChange = {})
            OutlinedTextField(label = {Text("Label")}, value = "Text", isError = true, onValueChange = {})
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
internal fun M3Components() {
    M3Scaffold(
        topBar = {
            M3TopAppBar(
                title = { M3Text("App") },
                actions = {
                    M3IconButton(onClick = {}) {
                        M3Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)
                    }
                }
            )
        },
        floatingActionButton = {
            M3FloatingActionButton(onClick = {}) {
                M3Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        }
    ) {
        Column(
            Modifier
                .padding(it)
                .padding(16.dp)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            M3Text("H1", style = M3Theme.typography.displayLarge)
            M3Text("Subtitle 1", style = M3Theme.typography.titleMedium)
            M3Text("Body 1")
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                M3Button({}) {
                    M3Text(text = "Button")
                }
                M3OutlinedButton({}) {
                    M3Text(text = "Button")
                }
                M3TextButton({}) {
                    M3Text(text = "Button")
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                M3Switch(checked = true, onCheckedChange = {})
                M3Switch(checked = false, onCheckedChange = {})
            }
            Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                M3Checkbox(checked = true, onCheckedChange = {})
                M3Checkbox(checked = false, onCheckedChange = {})
            }
            HorizontalDivider()
            M3ListItem(
                headlineContent = { M3Text("Text") },
                supportingContent = { M3Text("Secondary Text") },
                overlineContent = { M3Text("Overline") },
                trailingContent = { M3Text("Trailing") },
            )
            M3Card(elevation = CardDefaults.elevatedCardElevation()) {
                M3ListItem(
                    headlineContent = { M3Text("Text") },
                    supportingContent = { M3Text("Secondary Text") },
                    overlineContent = { M3Text("Overline") },
                    trailingContent = { M3Text("Trailing") },
                )
            }
            M3TextField(label = { M3Text("Label") }, value = "Text", onValueChange = {})
            M3OutlinedTextField(label = { M3Text("Label") }, value = "Text", isError = true, onValueChange = {})
        }
    }
}

@Preview
@Composable
internal fun M2Swatch() {
    ColorSwatch()
}

@Preview
@Composable
internal fun M3Swatch() {
    M3ColorSwatch()
}

@Composable
internal fun M3AdaptiveTheme(content: @Composable () -> Unit) {
    M3Theme(
        colorScheme = if (isSystemInDarkTheme()) darkColorScheme() else lightColorScheme(),
        content = content
    )
}

@Composable
internal fun M2AdaptiveTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colors = if (isSystemInDarkTheme()) darkColors() else lightColors(),
        content = content
    )
}