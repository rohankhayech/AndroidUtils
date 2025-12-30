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

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.text.TextStyle
import androidx.compose.material.MaterialTheme as M2Theme

/**
 * Wraps Material 3 composable content with a M3 Theme derived from the current M2 theme.
 *
 * @param colorScheme The colors to use for the M3 theme.
 * @param typography The typography to use for the M3 theme.
 * @param shapes The shapes to use for the M3 theme.
 * @param content The M3 composable content to wrap.
 *
 * @author Rohan Khayech
 */
@Composable
fun M3Wrapper(
    colorScheme: ColorScheme = M3WrapperDefaults.colorScheme(),
    typography: Typography = M3WrapperDefaults.typography(),
    shapes: Shapes = M3WrapperDefaults.shapes(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography,
        shapes = shapes,
        content = content
    )
}

/**
 * The default theme mappings from M2 to M3 for the Material 3 Wrapper.
 */
object M3WrapperDefaults {

    /**
     * The default color mappings from M2 to M3.
     * Optimised to best match the default M2 theme,
     * based on how M3 components use each color.
     */
    @Composable
    fun colorScheme(
        primary: Color = M2Theme.colors.primary,
        onPrimary: Color = M2Theme.colors.onPrimary,
        primaryContainer: Color = M2Theme.colors.secondary,
        onPrimaryContainer: Color = M2Theme.colors.onSecondary,
        inversePrimary: Color = M2Theme.colors.onPrimary,
        secondary: Color = M2Theme.colors.secondary,
        onSecondary: Color = M2Theme.colors.onSecondary,
        secondaryContainer: Color = M2Theme.colors.surface,
        onSecondaryContainer: Color = M2Theme.colors.onSurface,
        tertiary: Color = M2Theme.colors.secondaryVariant,
        onTertiary: Color = M2Theme.colors.onSecondary,
        tertiaryContainer: Color = M2Theme.colors.surface,
        onTertiaryContainer: Color = M2Theme.colors.onSurface,
        background: Color = M2Theme.colors.background,
        onBackground: Color = M2Theme.colors.onBackground,
        surface: Color = M2Theme.colors.surface,
        onSurface: Color = M2Theme.colors.onSurface,
        surfaceVariant: Color = M2Theme.colors.onSurface
            .copy(alpha = 0.10f)
            .compositeOver(M2Theme.colors.surface),
        onSurfaceVariant: Color = M2Theme.colors.onSurface,
        surfaceTint: Color = M2Theme.colors.onSurface,
        inverseSurface: Color = M2Theme.colors.onSurface,
        inverseOnSurface: Color = M2Theme.colors.surface,
        error: Color = M2Theme.colors.error,
        onError: Color = M2Theme.colors.onError,
        errorContainer: Color = M2Theme.colors.error,
        onErrorContainer: Color = M2Theme.colors.onError,
        outline: Color = MaterialTheme.colorScheme.outline,
        outlineVariant: Color = MaterialTheme.colorScheme.outlineVariant,
        scrim: Color = MaterialTheme.colorScheme.scrim
    ): ColorScheme {
        return ColorScheme(
            primary,
            onPrimary,
            primaryContainer,
            onPrimaryContainer,
            inversePrimary,
            secondary,
            onSecondary,
            secondaryContainer,
            onSecondaryContainer,
            tertiary,
            onTertiary,
            tertiaryContainer,
            onTertiaryContainer,
            background,
            onBackground,
            surface,
            onSurface,
            surfaceVariant,
            onSurfaceVariant,
            surfaceTint,
            inverseSurface,
            inverseOnSurface,
            error,
            onError,
            errorContainer,
            onErrorContainer,
            outline,
            outlineVariant,
            scrim,
        )
    }

    /**
     * Exact color mappings from M2 to M3.
     * M3 color values are set 1:1 with their counterparts in the M2 theme.
     */
    @Composable
    fun exactColorScheme(
        primary: Color = M2Theme.colors.primary,
        onPrimary: Color = M2Theme.colors.onPrimary,
        primaryContainer: Color = M2Theme.colors.primary,
        onPrimaryContainer: Color = M2Theme.colors.onPrimary,
        inversePrimary: Color = M2Theme.colors.onPrimary,
        secondary: Color = M2Theme.colors.secondary,
        onSecondary: Color = M2Theme.colors.onSecondary,
        secondaryContainer: Color = M2Theme.colors.secondary,
        onSecondaryContainer: Color = M2Theme.colors.onSecondary,
        tertiary: Color = M2Theme.colors.secondaryVariant,
        onTertiary: Color = M2Theme.colors.onSecondary,
        tertiaryContainer: Color = M2Theme.colors.surface,
        onTertiaryContainer: Color = M2Theme.colors.onSurface,
        background: Color = M2Theme.colors.background,
        onBackground: Color = M2Theme.colors.onBackground,
        surface: Color = M2Theme.colors.surface,
        onSurface: Color = M2Theme.colors.onSurface,
        surfaceVariant: Color = M2Theme.colors.surface,
        onSurfaceVariant: Color = M2Theme.colors.onSurface,
        surfaceTint: Color = M2Theme.colors.onSurface,
        inverseSurface: Color = M2Theme.colors.onSurface,
        inverseOnSurface: Color = M2Theme.colors.surface,
        error: Color = M2Theme.colors.error,
        onError: Color = M2Theme.colors.onError,
        errorContainer: Color = M2Theme.colors.error,
        onErrorContainer: Color = M2Theme.colors.onError,
        outline: Color = MaterialTheme.colorScheme.outline,
        outlineVariant: Color = MaterialTheme.colorScheme.outlineVariant,
        scrim: Color = MaterialTheme.colorScheme.scrim
    ): ColorScheme {
        return ColorScheme(
            primary,
            onPrimary,
            primaryContainer,
            onPrimaryContainer,
            inversePrimary,
            secondary,
            onSecondary,
            secondaryContainer,
            onSecondaryContainer,
            tertiary,
            onTertiary,
            tertiaryContainer,
            onTertiaryContainer,
            background,
            onBackground,
            surface,
            onSurface,
            surfaceVariant,
            onSurfaceVariant,
            surfaceTint,
            inverseSurface,
            inverseOnSurface,
            error,
            onError,
            errorContainer,
            onErrorContainer,
            outline,
            outlineVariant,
            scrim)
    }

    /** The default typography mappings from M2 to M3. */
    @Composable
    fun typography(
        displayLarge: TextStyle = M2Theme.typography.h1,
        displayMedium: TextStyle = M2Theme.typography.h2,
        displaySmall: TextStyle = M2Theme.typography.h3,
        headlineLarge: TextStyle = M2Theme.typography.h3,
        headlineMedium: TextStyle = M2Theme.typography.h4,
        headlineSmall: TextStyle = M2Theme.typography.h5,
        titleLarge: TextStyle = M2Theme.typography.h6,
        titleMedium: TextStyle = M2Theme.typography.subtitle1,
        titleSmall: TextStyle = M2Theme.typography.subtitle2,
        bodyLarge: TextStyle = M2Theme.typography.body1,
        bodyMedium: TextStyle = M2Theme.typography.body2,
        bodySmall: TextStyle = M2Theme.typography.caption,
        labelLarge: TextStyle = M2Theme.typography.button,
        labelMedium: TextStyle = M2Theme.typography.button,
        labelSmall: TextStyle = M2Theme.typography.overline,
    ): Typography {
        return MaterialTheme.typography.copy(
            displayLarge,
            displayMedium,
            displaySmall,
            headlineLarge,
            headlineMedium,
            headlineSmall,
            titleLarge,
            titleMedium,
            titleSmall,
            bodyLarge,
            bodyMedium,
            bodySmall,
            labelLarge,
            labelMedium,
            labelSmall
        )
    }

    /**
     * The default shape mappings from M2 to M3.
     * Optimised to best match the default M2 theme,
     * based on how M3 components use each shape.
     */
    @Composable
    fun shapes(
        extraSmall: CornerBasedShape = M2Theme.shapes.small,
        small: CornerBasedShape = M2Theme.shapes.small,
        medium: CornerBasedShape = M2Theme.shapes.medium,
        large: CornerBasedShape = M2Theme.shapes.medium,
        extraLarge: CornerBasedShape = M2Theme.shapes.medium
    ): Shapes {
        return Shapes(
            extraSmall,
            small,
            medium,
            large,
            extraLarge,
        )
    }

    /** 
     * Exact shape mappings from M2 to M3.
     * M3 shape values are set 1:1 with their counterparts in the M2 theme.
     */
    @Composable
    fun exactShapes(
        extraSmall: CornerBasedShape = M2Theme.shapes.small,
        small: CornerBasedShape = M2Theme.shapes.small,
        medium: CornerBasedShape = M2Theme.shapes.medium,
        large: CornerBasedShape = M2Theme.shapes.large,
        extraLarge: CornerBasedShape = M2Theme.shapes.large
    ): Shapes {
        return Shapes(
            extraSmall,
            small,
            medium,
            large,
            extraLarge,
        )
    }
}