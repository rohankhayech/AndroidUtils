package com.rohankhayech.android.util.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import com.rohankhayech.android.util.ui.preview.ColorSwatch
import com.rohankhayech.android.util.ui.preview.DarkPreview

/** Preview for [trueDarkColors]. */
@DarkPreview
@Composable
private fun TrueDarkColorsPreview() {
    MaterialTheme(colors = trueDarkColors()) {
        ColorSwatch()
    }
}