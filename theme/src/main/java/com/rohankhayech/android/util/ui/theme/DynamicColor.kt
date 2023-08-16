package com.rohankhayech.android.util.ui.theme

import android.content.Context
import android.os.Build.VERSION_CODES
import androidx.annotation.RequiresApi
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.google.android.material.color.MaterialColors

/**
 * Creates a light dynamic color set for Material 2.
 *
 * Use this function to create a color set based off the system wallpaper. If the developer
 * changes the wallpaper this color set will change accordingly. This dynamic color set is a
 * light theme variant.
 *
 * @param context The context required to get system resource data.
 * @author Rohan Khayech
 */
@RequiresApi(VERSION_CODES.S)
fun dynamicLightColors(context: Context): Colors {
    val dynamicColorScheme = dynamicLightColorScheme(context)
    return dynamicColors(dynamicColorScheme, true)
}

/**
 * Creates a dark dynamic color set for Material 2.
 *
 * Use this function to create a color set based off the system wallpaper. If the developer
 * changes the wallpaper this color set will change accordingly. This dynamic color set is a
 * dark theme variant.
 *
 * @param context The context required to get system resource data.
 * @author Rohan Khayech
 */
@RequiresApi(VERSION_CODES.S)
fun dynamicDarkColors(context: Context): Colors {
    val dynamicColorScheme = dynamicDarkColorScheme(context)
    return dynamicColors(dynamicColorScheme, false)
}

/**
 * Creates a dynamic color set from the specified [dynamicColorScheme].
 * @param isLight Whether this Colors is considered as a 'light' or 'dark' set of colors.
 */
private fun dynamicColors(dynamicColorScheme: ColorScheme, isLight: Boolean): Colors {
    return Colors(
        primary = dynamicColorScheme.primary,
        primaryVariant = dynamicColorScheme.secondary,
        secondary = dynamicColorScheme.tertiary,
        secondaryVariant = dynamicColorScheme.tertiary,
        background = dynamicColorScheme.background,
        surface = dynamicColorScheme.surface,
        error = dynamicColorScheme.error,
        onPrimary = dynamicColorScheme.onPrimary,
        onSecondary = dynamicColorScheme.onTertiary,
        onBackground = dynamicColorScheme.onBackground,
        onSurface = dynamicColorScheme.onSurface,
        onError = dynamicColorScheme.onError,
        isLight = isLight
    )
}

/**
 * @return A version of this color harmonised with the current theme.
 * @author Rohan Khayech
 */
@Composable
fun Color.harmonised(): Color {
    return harmonisedWith(MaterialTheme.colors)
}

/**
 * @return A version of this color harmonised withe the specified [themeColors].
 * @author Rohan Khayech
 */
fun Color.harmonisedWith(themeColors: Colors): Color {
    return Color(MaterialColors.harmonize(toArgb(), themeColors.primary.toArgb()))
}