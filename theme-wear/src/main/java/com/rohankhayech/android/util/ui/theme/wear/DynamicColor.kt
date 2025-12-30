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

package com.rohankhayech.android.util.ui.theme.wear

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.wear.compose.material3.ColorScheme
import androidx.wear.compose.material3.MaterialTheme
import com.google.android.material.color.MaterialColors

/**
 * @return A version of this color harmonised with the current theme.
 * @author Rohan Khayech
 */
@Suppress("unused")
@Composable
fun Color.harmonised(): Color {
    return harmonisedWith(MaterialTheme.colorScheme)
}

/**
 * @return A version of this color harmonised withe the specified [themeColors].
 * @author Rohan Khayech
 */
fun Color.harmonisedWith(themeColors: ColorScheme): Color {
    return Color(MaterialColors.harmonize(toArgb(), themeColors.primary.toArgb()))
}