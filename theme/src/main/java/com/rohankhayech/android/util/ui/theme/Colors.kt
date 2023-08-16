package com.rohankhayech.android.util.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.ui.graphics.Color

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

private val DarkColors = darkColors()

/**
 * primarySurfaceDark represents the background color of components that are [Colors.primary]
 * in light theme, [Colors.surface] in dark theme, and [Colors.background] in true dark theme,
 * such as [androidx.compose.material.TabRow] and [androidx.compose.material.TopAppBar].
 * This is to reduce brightness of large surfaces in dark theme, aiding contrast and readability.
 * See [Dark Theme](https://material.io/design/color/dark-theme.html#custom-application).
 *
 * @return [Colors.primary] if in light theme, else [Colors.background] if [trueDark] is enabled, otherwise [Colors.surface].
 */
fun Colors.primarySurfaceDark(trueDark: Boolean): Color = if (isLight) primary else if (trueDark) background else surface

/**
 * surfaceBackground represents the background color of components that are [Colors.surface]
 * in light and dark theme, and [Colors.background] in true dark theme.
 * This is to reduce brightness of large surfaces in dark theme, aiding contrast and readability.
 * See [Dark Theme](https://material.io/design/color/dark-theme.html#custom-application).
 *
 * @return [Colors.background] if in dark theme and [trueDark] is enabled, else [Colors.surface].
 */
fun Colors.surfaceBackground(trueDark: Boolean): Color = if (!isLight || trueDark) background else surface