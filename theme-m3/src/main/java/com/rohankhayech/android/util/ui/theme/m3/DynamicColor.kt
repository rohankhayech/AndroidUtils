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

package com.rohankhayech.android.util.ui.theme.m3

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.google.android.material.color.MaterialColors

/**
 * Creates a true dark dynamic color set for Material 2,
 * with true black (#000000) as the background color,
 * and light gray content color on backgrounds.
 *
 * Optimised for AMOLED displays.
 *
 * Use this function to create a color set based off the system wallpaper. If the developer
 * changes the wallpaper this color set will change accordingly. This dynamic color set is a
 * dark theme variant.
 *
 * @param context The context required to get system resource data.
 * @author Rohan Khayech
 */
@RequiresApi(Build.VERSION_CODES.S)
fun dynamicTrueDarkColorScheme(context: Context): ColorScheme {
    return dynamicDarkColorScheme(context).copy(
        background = Color.Black,
        onBackground = Color.LightGray,
    )
}


/**
 * @return A version of this color harmonised with the current theme.
 * @author Rohan Khayech
 */
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