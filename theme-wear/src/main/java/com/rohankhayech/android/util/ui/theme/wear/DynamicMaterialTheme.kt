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

package com.rohankhayech.android.util.ui.theme.wear

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.platform.LocalContext
import androidx.wear.compose.material3.ColorScheme
import androidx.wear.compose.material3.MaterialTheme
import androidx.wear.compose.material3.Shapes
import androidx.wear.compose.material3.Typography
import androidx.wear.compose.material3.dynamicColorScheme as defaultDynamicColorScheme

/**
 * Material theme with support for dynamic color theme.
 *
 * It also provides composition locals for the dynamic color value.
 * These can be accessed with the property [MaterialTheme.usesDynamicColor].
 * This property defaults to false if not provided.
 *
 * @param colorScheme Colors to use.
 * @param dynamicColorScheme Colors to use when [dynamicColor] is set to true.
 * @param shapes A set of shapes to be used by the components in this hierarchy.
 * @param typography A set of text styles to be used as this hierarchy's typography system.
 * @param dynamicColor Whether to use a dynamic color theme, if available.
 * @param content Content to display with this theme.
 *
 * @see MaterialTheme.usesDynamicColor
 *
 * @author Rohan Khayech
 */
@Suppress("unused")
@Composable
fun DynamicMaterialTheme(
    colorScheme: ColorScheme = ColorScheme(),
    dynamicColorScheme: @Composable (() -> ColorScheme)? = null,
    shapes: Shapes = MaterialTheme.shapes,
    typography: Typography = MaterialTheme.typography,
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        LocalDynamicColor provides dynamicColor,
    ) {
        MaterialTheme(
            colorScheme = when {
                dynamicColor ->
                    dynamicColorScheme?.invoke()
                        ?: defaultDynamicColorScheme(LocalContext.current)
                            ?: colorScheme

                else ->
                    colorScheme
            },
            shapes = shapes,
            typography = typography,
            content = content
        )
    }
}

/** Composition local key representing whether the current theme uses dynamic color theme. */
private val LocalDynamicColor = compositionLocalOf { false }

/**
 * Whether the current theme uses dynamic color theme.
 *
 * Works in conjunction with the [DynamicMaterialTheme] composable, and defaults to `false` otherwise.
 * @see DynamicMaterialTheme
 */
@Suppress("UnusedReceiverParameter")
val MaterialTheme.usesDynamicColor: Boolean
    @Composable get() = LocalDynamicColor.current
