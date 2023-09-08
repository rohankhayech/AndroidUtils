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

package com.rohankhayech.android.util.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.ui.graphics.Color

/**
 * Creates a complete color definition for the
 * [Material color specification](https://material.io/design/color/the-color-system.html#color-theme-creation)
 * using dark theme values, with true black (#000000) as the background color,
 * and light gray content color on backgrounds.
 *
 * Optimised for AMOLED displays.
 *
 * Note: [secondaryVariant] is typically the same as [secondary] in dark theme since contrast
 * levels are higher, and hence there is less need for a separate secondary color.
 *
 * @see darkColors
 *
 * @author Rohan Khayech
 */
fun trueDarkColors(
    primary: Color = DarkColors.primary,
    primaryVariant: Color = DarkColors.primaryVariant,
    secondary: Color = DarkColors.secondary,
    secondaryVariant: Color = DarkColors.secondaryVariant,
    background: Color = Color.Black,
    surface: Color = DarkColors.surface,
    error: Color = DarkColors.error,
    onPrimary: Color = DarkColors.onPrimary,
    onSecondary: Color = DarkColors.onSecondary,
    onBackground: Color = Color.LightGray,
    onSurface: Color = DarkColors.onSurface,
    onError: Color = DarkColors.onError,
): Colors {
    return Colors(
        primary,
        primaryVariant,
        secondary,
        secondaryVariant,
        background,
        surface,
        error,
        onPrimary,
        onSecondary,
        onBackground,
        onSurface,
        onError,
        isLight = false
    )
}

/** Static instance of [darkColors]. */
private val DarkColors by lazy { darkColors() }

/**
 * primarySurfaceDark represents the background color of components that are [Colors.primary]
 * in light theme, [Colors.surface] in dark theme, and [Colors.background] in true dark theme,
 * such as [androidx.compose.material.TabRow] and [androidx.compose.material.TopAppBar].
 * This is to reduce brightness of large surfaces in dark theme, aiding contrast and readability.
 * See [Dark Theme](https://material.io/design/color/dark-theme.html#custom-application).
 *
 * @return [Colors.primary] if in light theme, else [Colors.background] if [trueDark] is enabled, otherwise [Colors.surface].
 *
 * @author Rohan Khayech
 */
fun Colors.primarySurfaceBackground(trueDark: Boolean): Color = if (isLight) primary else if (trueDark) background else surface

/**
 * surfaceBackground represents the background color of components that are [Colors.surface]
 * in light and dark theme, and [Colors.background] in true dark theme.
 * This is to reduce brightness of large surfaces in dark theme, aiding contrast and readability.
 * See [Dark Theme](https://material.io/design/color/dark-theme.html#custom-application).
 *
 * @return [Colors.background] if in dark theme and [trueDark] is enabled, else [Colors.surface].
 *
 * @author Rohan Khayech
 */
fun Colors.surfaceBackground(trueDark: Boolean): Color = if (!isLight || trueDark) background else surface