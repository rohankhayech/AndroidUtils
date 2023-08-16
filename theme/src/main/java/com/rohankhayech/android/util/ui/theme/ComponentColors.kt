package com.rohankhayech.android.util.ui.theme

import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.LocalContentColor
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.compositeOver

/**
 * Button colors for buttons performing a secondary action.
 * Button background will be the surface color, instead of the primary color.
 *
 * @author Rohan Khayech
 */
@Composable
fun secondaryButtonColors() : ButtonColors {
    return ButtonDefaults.buttonColors(
        backgroundColor = MaterialTheme.colors.onSurface
            .copy(alpha = 0.11f)
            .compositeOver(MaterialTheme.colors.surface)
    )
}

/**
 * Button colors for a secondary-action text button.
 * Content color will be the content color for the current background, instead of the primary color.
 *
 * @author Rohan Khayech
 */
@Composable
fun secondaryTextButtonColors() : ButtonColors {
    return ButtonDefaults.textButtonColors(
        contentColor = LocalContentColor.current
    )
}