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

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

/**
 * Material theme that adapts to dark mode,
 * with support for true black and dynamic color themes.
 *
 * It also provides composition locals for the true dark and dynamic color values.
 * These can be accessed with the properties [MaterialTheme.usesTrueDark] and [MaterialTheme.usesDynamicColor] respectively.
 * These properties both default to false if not provided.
 *
 * @param lightColorScheme Colors to use in light mode.
 * @param darkColorScheme Colors to use in dark mode.
 * @param trueDarkColorScheme Colors to use in dark mode when [trueDark] is set to true.
 * @param dynamicLightColorScheme Colors to use when in light mode when [dynamicColor] is set to true.
 * @param dynamicDarkColorScheme Colors to use when in dark mode when [dynamicColor] is set to true.
 * @param dynamicTrueDarkColorScheme Colors to use when in dark mode when [dynamicColor] and [trueDark] are set to true.
 * @param shapes A set of shapes to be used by the components in this hierarchy.
 * @param typography A set of text styles to be used as this hierarchy's typography system.
 * @param darkTheme Whether to use dark theme.
 * @param trueDark Whether to use true dark theme when [darkTheme] is enabled.
 * @param dynamicColor Whether to use a dynamic color theme, if available.
 * @param content Content to display with this theme.
 *
 * @see MaterialTheme.usesTrueDark
 * @see MaterialTheme.usesDynamicColor
 *
 * @author Rohan Khayech
 */
@Composable
fun AdaptableMaterialTheme(
    lightColorScheme: ColorScheme = lightColorScheme(),
    darkColorScheme: ColorScheme = darkColorScheme(),
    trueDarkColorScheme: ColorScheme = darkColorScheme.copy(
        background = Color.Black,
        onBackground = Color.LightGray,
    ),
    dynamicLightColorScheme: @Composable (() -> ColorScheme)? = null,
    dynamicDarkColorScheme: @Composable (() -> ColorScheme)? = null,
    dynamicTrueDarkColorScheme: @Composable (() -> ColorScheme)? = null,
    shapes: Shapes = MaterialTheme.shapes,
    typography: Typography = MaterialTheme.typography,
    darkTheme: Boolean = isSystemInDarkTheme(),
    trueDark: Boolean = false,
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    // Use dynamic color if dynamicColor is true and version requirement is met.
    val useDynamicColor = dynamicColor && Build.VERSION.SDK_INT > Build.VERSION_CODES.S

    CompositionLocalProvider(
        LocalTrueDarkTheme provides trueDark,
        LocalDynamicColor provides useDynamicColor,
        LocalThemeMode provides !darkTheme,
    ) {
        MaterialTheme(
            colorScheme = when {
                useDynamicColor && darkTheme && trueDark ->
                    dynamicTrueDarkColorScheme?.invoke()
                        ?: dynamicTrueDarkColorScheme(LocalContext.current)

                useDynamicColor && darkTheme ->
                    dynamicDarkColorScheme?.invoke()
                        ?: dynamicDarkColorScheme(LocalContext.current)

                useDynamicColor ->
                    dynamicLightColorScheme?.invoke()
                        ?: androidx.compose.material3.dynamicLightColorScheme(LocalContext.current)

                darkTheme && trueDark ->
                    trueDarkColorScheme

                darkTheme ->
                    darkColorScheme

                else ->
                    lightColorScheme
            },
            shapes = shapes,
            typography = typography,
            content = content
        )
    }
}

/** Composition local key representing whether the current theme uses true dark theme when dark mode is enabled. */
private val LocalTrueDarkTheme = compositionLocalOf { false }

/**
 * Whether the current theme uses true dark theme when dark mode is enabled.
 *
 * Works in conjunction with the [AdaptableMaterialTheme] composable, and defaults to `false` otherwise.
 * @see AdaptableMaterialTheme
 */
@Suppress("UnusedReceiverParameter")
val MaterialTheme.isTrueDark: Boolean
    @Composable get() = LocalTrueDarkTheme.current

/** Composition local key representing whether the current theme uses dynamic color theme. */
private val LocalDynamicColor = compositionLocalOf { false }

/**
 * Whether the current theme uses dynamic color theme.
 *
 * Works in conjunction with the [AdaptableMaterialTheme] composable, and defaults to `false` otherwise.
 * @see AdaptableMaterialTheme
 */
@Suppress("UnusedReceiverParameter")
val MaterialTheme.isDynamicColor: Boolean
    @Composable get() = LocalDynamicColor.current

/** Composition local key representing whether the current theme is light mode. */
private val LocalThemeMode = compositionLocalOf { true }

/**
 * Whether the current theme is a light mode theme.
 *
 * Works in conjunction with the [AdaptableMaterialTheme] composable, and defaults to `true` otherwise.
 * @see AdaptableMaterialTheme
 */
@Suppress("UnusedReceiverParameter")
val MaterialTheme.isLight: Boolean
    @Composable get() = LocalThemeMode.current