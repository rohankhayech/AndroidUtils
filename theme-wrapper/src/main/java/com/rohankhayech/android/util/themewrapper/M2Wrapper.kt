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
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.material3.MaterialTheme as M3Theme

/**
 * Wraps Material 2 composable content with a M2 Theme derived from the current M3 theme.
 * 
 * @param colors The colors to use for the M2 theme.
 * @param typography The typography to use for the M2 theme.
 * @param shapes The shapes to use for the M2 theme.
 * @param content The M2 composable content to wrap.
 *
 * @author Rohan Khayech
 */
@Composable
fun M2Wrapper(
    colors: Colors = M2WrapperDefaults.colors(),
    typography: Typography = M2WrapperDefaults.typography(),
    shapes: Shapes = M2WrapperDefaults.shapes(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}

/**
 * The default theme mappings from M3 to M2 for the Material 2 Wrapper.
 */
object M2WrapperDefaults {

    /**
     * The default color mappings from M3 to M2.
     * Optimised to best match the default M3 theme,
     * based on how M2 components use each color.
     */
    @Composable
    fun colors(
        primary: Color = M3Theme.colorScheme.primary,
        primaryVariant: Color = M3Theme.colorScheme.secondary,
        secondary: Color = M3Theme.colorScheme.primary,
        secondaryVariant: Color = M3Theme.colorScheme.primary,
        background: Color = M3Theme.colorScheme.background,
        surface: Color = M3Theme.colorScheme.surface,
        error: Color = M3Theme.colorScheme.error,
        onPrimary: Color = M3Theme.colorScheme.onPrimary,
        onSecondary: Color = M3Theme.colorScheme.onPrimary,
        onBackground: Color = M3Theme.colorScheme.onBackground,
        onSurface: Color = M3Theme.colorScheme.onSurface,
        onError: Color = M3Theme.colorScheme.onError,
        isLight: Boolean = !isSystemInDarkTheme()
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
            isLight
        )
    }

    /**
     * Exact color mappings from M3 to M2.
     * M2 color values are mapped 1:1 with their counterparts in the M3 theme.
     */
    @Composable
    fun exactColors(
        primary: Color = M3Theme.colorScheme.primary,
        primaryVariant: Color = M3Theme.colorScheme.secondary,
        secondary: Color = M3Theme.colorScheme.tertiary,
        secondaryVariant: Color = M3Theme.colorScheme.tertiary,
        background: Color = M3Theme.colorScheme.background,
        surface: Color = M3Theme.colorScheme.surface,
        error: Color = M3Theme.colorScheme.error,
        onPrimary: Color = M3Theme.colorScheme.onPrimary,
        onSecondary: Color = M3Theme.colorScheme.onTertiary,
        onBackground: Color = M3Theme.colorScheme.onBackground,
        onSurface: Color = M3Theme.colorScheme.onSurface,
        onError: Color = M3Theme.colorScheme.onError,
        isLight: Boolean = !isSystemInDarkTheme()
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
            isLight
        )
    }

    /** The default typography mappings from M3 to M2. */
    @Composable
    fun typography(
        h1: TextStyle = M3Theme.typography.displayLarge,
        h2: TextStyle = M3Theme.typography.displayMedium,
        h3: TextStyle = M3Theme.typography.displaySmall,
        h4: TextStyle = M3Theme.typography.headlineMedium,
        h5: TextStyle = M3Theme.typography.headlineSmall,
        h6: TextStyle = M3Theme.typography.titleLarge,
        subtitle1: TextStyle = M3Theme.typography.titleMedium,
        subtitle2: TextStyle = M3Theme.typography.titleSmall,
        body1: TextStyle = M3Theme.typography.bodyLarge,
        body2: TextStyle = M3Theme.typography.bodyMedium,
        button: TextStyle = M3Theme.typography.labelLarge,
        caption: TextStyle = M3Theme.typography.bodySmall,
        overline: TextStyle = M3Theme.typography.labelSmall
    ): Typography {
        return MaterialTheme.typography.copy(
            h1,
            h2,
            h3,
            h4,
            h5,
            h6,
            subtitle1,
            subtitle2,
            body1,
            body2,
            button,
            caption,
            overline
        )
    }

    /**
     * The default shape mappings from M3 to M2.
     * M2 shape values are set 1:1 with their counterparts in the M3 theme.
     */
    @Composable
    fun shapes(
        small: CornerBasedShape = M3Theme.shapes.small,
        medium: CornerBasedShape = M3Theme.shapes.medium,
        large: CornerBasedShape = M3Theme.shapes.large
    ): Shapes {
        return Shapes(
            small,
            medium,
            large
        )
    }
}