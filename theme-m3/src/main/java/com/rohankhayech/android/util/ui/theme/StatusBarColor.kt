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

package com.rohankhayech.android.util.ui.theme

import android.os.Build
import android.view.WindowInsetsController
import androidx.activity.compose.LocalActivity
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.LaunchedEffect

/**
 * UI component used to control the color of the status bar icons.
 * @param iconColor: Whether to use light or dark status bar icons.
 * @author Rohan Khayech
 */
@Composable
fun StatusBarColor(
    iconColor: StatusBarIconColor
) {
    val activity = LocalActivity.current
    LaunchedEffect(activity, iconColor) {
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.R) {
            activity?.window?.insetsController?.setSystemBarsAppearance(
                when (iconColor) {
                    StatusBarIconColor.LIGHT -> 0
                    StatusBarIconColor.DARK -> WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
                },
                WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
            )
        }
    }
}

/**
 * Enum class representing the color of the status bar icons.
 * @property LIGHT Light status bar icons for use over dark app bars.
 * @property DARK Dark status bar icons for use over light app bars.
 * @author Rohan Khayech
 */
@Immutable
enum class StatusBarIconColor {
    /** Light status bar icons for use over dark app bars. */
    LIGHT,
    /** Dark status bar icons for use over light app bars. */
    DARK
}
