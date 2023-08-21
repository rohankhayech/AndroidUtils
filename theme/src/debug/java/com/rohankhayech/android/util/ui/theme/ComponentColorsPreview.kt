package com.rohankhayech.android.util.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.rohankhayech.android.util.ui.preview.PreviewWrapper
import com.rohankhayech.android.util.ui.preview.ThemePreview

@ThemePreview
@Composable
private fun SecondaryButtonsPreview() {
    PreviewWrapper {
        Column(Modifier.padding(16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(colors = secondaryButtonColors(), onClick = {}) {
                Text(text = "Secondary Button")
            }
            TextButton(colors = secondaryTextButtonColors(), onClick = {}) {
                Text(text = "Secondary Text Button")
            }
        }
    }
}