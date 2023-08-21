/*
 * Copyright (C) 2023 Rohan Khayech
 */

package com.rohankhayech.android.util.ui.preview

import android.annotation.SuppressLint
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

/**
 * Preview of preview annotations.
 * @author Rohan Khayech
 */
@FullPreview
@Composable
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
private fun Preview() {
    PreviewWrapper {
        Scaffold(topBar = {
            TopAppBar(title = { Text("Preview") })
        }) {}
    }
}