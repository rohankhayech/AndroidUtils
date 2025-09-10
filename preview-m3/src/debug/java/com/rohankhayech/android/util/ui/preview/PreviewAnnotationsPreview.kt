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

package com.rohankhayech.android.util.ui.preview

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.rohankhayech.android.util.ui.preview.m3.PreviewWrapper

/**
 * Preview of preview annotations.
 * @author Rohan Khayech
 */
@OptIn(ExperimentalMaterial3Api::class)
@FullPreview
@Composable
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
private fun Preview() {
    PreviewWrapper {
        Scaffold(topBar = {
            TopAppBar(title = { Text("Preview") })
        }) { padding ->
            Box(modifier = Modifier.padding(padding))
        }
    }
}