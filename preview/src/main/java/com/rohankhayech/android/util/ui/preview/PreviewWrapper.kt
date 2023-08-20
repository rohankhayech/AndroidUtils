package com.rohankhayech.android.util.ui.preview

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

/**
 * Wrapper composable that places [content] inside a
 * material theme and a surface to correctly render a preview.
 *
 * @author Rohan Khayech
 */
@Composable
fun PreviewWrapper(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (isSystemInDarkTheme()) darkColors() else lightColors()
    ) {
        Surface(content = content)
    }
}