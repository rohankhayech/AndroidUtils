package com.rohankhayech.android.util.ui.theme

import androidx.compose.runtime.Composable
import com.rohankhayech.android.util.ui.preview.ColorSwatch
import com.rohankhayech.android.util.ui.preview.DarkPreview
import com.rohankhayech.android.util.ui.preview.ThemePreview

@ThemePreview
@Composable
private fun Preview() {
    AdaptableMaterialTheme {
        ColorSwatch()
    }
}

@DarkPreview
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

@DarkPreview
@Composable
private fun DynamicTrueDarkPreview() {
    AdaptableMaterialTheme(trueDark = true, dynamicColor = true) {
        ColorSwatch()
    }
}