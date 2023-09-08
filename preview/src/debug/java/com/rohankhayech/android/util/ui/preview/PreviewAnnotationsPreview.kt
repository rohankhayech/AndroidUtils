/*
 * Copyright 2023 Rohan Khayech
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