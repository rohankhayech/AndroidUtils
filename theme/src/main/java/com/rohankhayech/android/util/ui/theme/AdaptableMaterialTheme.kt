package com.rohankhayech.android.util.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

/**
 * Material theme that adapts to dark mode,
 * with support for true black and dynamic color themes.
 *
 * @param lightColors Colors to use in light mode.
 * @param darkColors Colors to use in dark mode.
 * @param trueDarkColors Colors to use in dark mode when [trueDark] is set to true.
 * @param dynamicLightColors Colors to use when in light mode when [dynamicColor] is set to true.
 * @param dynamicDarkColors Colors to use when in dark mode when [dynamicColor] is set to true.
 * @param dynamicTrueDarkColors Colors to use when in dark mode when [dynamicColor] and [trueDark] are set to true.
 * @param shapes A set of shapes to be used by the components in this hierarchy.
 * @param typography A set of text styles to be used as this hierarchy's typography system.
 * @param darkTheme Whether to use dark theme.
 * @param trueDark Whether to use true dark theme when [darkTheme] is enabled.
 * @param dynamicColor Whether to use a dynamic color theme, if available.
 * @param content Content to display with this theme.
 *
 * @author Rohan Khayech
 */
@Composable
fun AdaptableMaterialTheme(
    lightColors: Colors = lightColors(),
    darkColors: Colors = darkColors(),
    trueDarkColors: Colors = trueDarkColors(),
    dynamicLightColors: @Composable (() -> Colors)? = null,
    dynamicDarkColors: @Composable (() -> Colors)? = null,
    dynamicTrueDarkColors: @Composable (() -> Colors)? = null,
    shapes: Shapes = MaterialTheme.shapes,
    typography: Typography = MaterialTheme.typography,
    darkTheme: Boolean = isSystemInDarkTheme(),
    trueDark: Boolean = false,
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    // Use dynamic color if dynamicColor is true and version requirement is met.
    val useDynamicColor = dynamicColor && Build.VERSION.SDK_INT > Build.VERSION_CODES.S

    MaterialTheme(
        colors = when {
            useDynamicColor && darkTheme && trueDark ->
                dynamicTrueDarkColors?.invoke()
                    ?: dynamicTrueDarkColors(LocalContext.current)
            useDynamicColor && darkTheme ->
                dynamicDarkColors?.invoke()
                    ?: dynamicDarkColors(LocalContext.current)
            useDynamicColor ->
                dynamicLightColors?.invoke()
                    ?: dynamicLightColors(LocalContext.current)
            darkTheme && trueDark ->
                trueDarkColors
            darkTheme ->
                darkColors
            else ->
                lightColors
        },
        shapes = shapes,
        typography = typography,
        content = content
    )
}