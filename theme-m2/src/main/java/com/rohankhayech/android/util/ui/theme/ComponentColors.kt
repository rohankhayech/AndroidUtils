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

//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.ButtonColors
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.ButtonDefaults
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.LocalContentColor
//noinspection UsingMaterialAndMaterial3Libraries
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