package com.rohankhayech.android.util.ui.theme

import android.annotation.SuppressLint
import android.content.res.Configuration
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
import androidx.compose.ui.tooling.preview.Preview
import com.rohankhayech.android.util.ui.preview.ColorSwatch
import com.rohankhayech.android.util.ui.preview.ThemePreview

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
@SuppressLint("NewApi")
@Composable
fun AdaptableMaterialTheme(
    lightColors: Colors = lightColors(),
    darkColors: Colors = darkColors(),
    trueDarkColors: Colors = trueDarkColors(),
    dynamicLightColors: @Composable (() -> Colors) = {
        dynamicLightColors(LocalContext.current)
    },
    dynamicDarkColors: @Composable (() -> Colors) = {
        dynamicDarkColors(LocalContext.current)
    },
    dynamicTrueDarkColors: @Composable (() -> Colors) = {
        dynamicTrueDarkColors(LocalContext.current)
    },
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
                dynamicTrueDarkColors()
            useDynamicColor && darkTheme ->
                dynamicDarkColors()
            useDynamicColor ->
                dynamicLightColors()
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

@ThemePreview
@Composable
private fun Preview() {
    AdaptableMaterialTheme {
        ColorSwatch()
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun TrueDarkPreview() {
    AdaptableMaterialTheme(trueDark = true) {
        ColorSwatch()
    }
}

@ThemePreview
@Composable
private fun DynamicPreview() {
    AdaptableMaterialTheme(dynamicColor = true) {
        ColorSwatch()
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
private fun DynamicTrueDarkPreview() {
    AdaptableMaterialTheme(trueDark = true, dynamicColor = true) {
        ColorSwatch()
    }
}