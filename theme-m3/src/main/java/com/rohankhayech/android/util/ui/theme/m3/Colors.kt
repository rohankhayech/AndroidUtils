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

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/**
 * Returns a copy of this Material color scheme,
 * with true black (#000000) as the background color,
 * and light gray content color on backgrounds.
 *
 * Optimised for AMOLED displays.
 *
 * @see darkColorScheme
 *
 * @author Rohan Khayech
 */
fun ColorScheme.trueDark(): ColorScheme {
    return this.copy(
        background = Color.Black,
        onBackground = Color.LightGray
    )
}

/**
 * primaryBackground represents the background color of components that are [ColorScheme.primaryContainer]
 * in light theme and [ColorScheme.background] in dark and true dark theme,
 * such as [androidx.compose.material.TabRow] and [androidx.compose.material.TopAppBar].
 * This is to reduce brightness of large surfaces in dark theme, aiding contrast and readability.
 * See [Dark Theme](https://material.io/design/color/dark-theme.html#custom-application).
 *
 * @return [ColorScheme.primaryContainer] if in light theme, else [ColorScheme.background].
 *
 * @author Rohan Khayech
 */
fun ColorScheme.primaryBackground(isLight: Boolean): Color = if (isLight) primaryContainer else background

/**
 * primaryBackground represents the background color of components that are [ColorScheme.primaryContainer]
 * in light theme and [ColorScheme.background] in dark and true dark theme,
 * such as [androidx.compose.material.TabRow] and [androidx.compose.material.TopAppBar].
 * This is to reduce brightness of large surfaces in dark theme, aiding contrast and readability.
 * See [Dark Theme](https://material.io/design/color/dark-theme.html#custom-application).
 *
 * @return [ColorScheme.primaryContainer] if in light theme, else [ColorScheme.background].
 *
 * @author Rohan Khayech
 */
val ColorScheme.primaryBackground
    @Composable get() = primaryBackground(MaterialTheme.isLight)

/**
 * vibrantContainer represents the background color of components that are [ColorScheme.primary]
 * in light theme, [ColorScheme.primaryContainer] in dark theme, and [ColorScheme.background] in true dark theme.
 *
 * @return [ColorScheme.primary] in light mode, [ColorScheme.primaryContainer] if in dark theme, and [ColorScheme.background] in true dark theme.
 *
 * @author Rohan Khayech
 */
fun ColorScheme.vibrantContainer(isLight: Boolean, trueDark: Boolean): Color = if (isLight) primary else if (!trueDark) primaryContainer else background

/**
 * vibrantContainer represents the background color of components that are [ColorScheme.primary]
 * in light theme, [ColorScheme.primaryContainer] in dark theme, and [ColorScheme.background] in true dark theme.
 *
 * @return [ColorScheme.primary] in light mode, [ColorScheme.primaryContainer] if in dark theme, and [ColorScheme.background] in true dark theme.
 *
 * @author Rohan Khayech
 */
val ColorScheme.vibrantContainer
    @Composable get() = vibrantContainer(MaterialTheme.isLight, MaterialTheme.isTrueDark)

/**
 * primaryContainerBackground represents the background color of components that are [ColorScheme.primaryContainer]
 * in light and dark theme and [ColorScheme.background] in true dark theme,
 * such as [androidx.compose.material.TabRow] and [androidx.compose.material.TopAppBar].
 *
 * @return [ColorScheme.background] if in true dark theme, else [ColorScheme.primaryContainer].
 *
 * @author Rohan Khayech
 */
fun ColorScheme.primaryContainerBackground(isLight: Boolean, trueDark: Boolean): Color = if (!isLight && trueDark) background else primaryContainer

/**
 * primaryBackground represents the background color of components that are [ColorScheme.primaryContainer]
 * in light theme and [ColorScheme.background] in dark and true dark theme,
 * such as [androidx.compose.material.TabRow] and [androidx.compose.material.TopAppBar].
 * This is to reduce brightness of large surfaces in dark theme, aiding contrast and readability.
 * See [Dark Theme](https://material.io/design/color/dark-theme.html#custom-application).
 *
 * @return [ColorScheme.primaryContainer] if in light theme, else [ColorScheme.background].
 *
 * @author Rohan Khayech
 */
val ColorScheme.primaryContainerBackground
    @Composable get() = primaryContainerBackground(MaterialTheme.isLight, trueDark = MaterialTheme.isTrueDark)
