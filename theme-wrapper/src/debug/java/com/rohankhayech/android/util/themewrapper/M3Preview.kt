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

package com.rohankhayech.android.util.themewrapper

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

// PREVIEWS

@Preview(name = "M3 Components")
@Preview(name = "M3 Components - Dark", uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun M3() {
    M3AdaptiveTheme {
        M3Components()
    }
}

@Preview(name = "M3 Components in Wrapper")
@Preview(name = "M3 Components in Wrapper - Dark", uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun InWrapper() {
    M2AdaptiveTheme {
        M3Wrapper {
            M3Components()
        }
    }
}

@Preview(name = "M2 Components")
@Preview(name = "M2 Components - Dark", uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun M2() {
    M2AdaptiveTheme {
        M2Components()
    }
}

@Preview(name = "M2 Colors")
@Preview(name = "M2 Colors - Dark", uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun M2Colors() {
    M2AdaptiveTheme {
        M2Swatch()
    }
}

@Preview(name = "M3 Colors in Wrapper")
@Preview(name = "M3 Colors in Wrapper - Dark", uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun WrapperColors() {
    M2AdaptiveTheme {
        M3Wrapper {
            M3Swatch()
        }
    }
}

@Preview(name = "M3 Colors in Exact Wrapper")
@Preview(name = "M3 Colors in Exact Wrapper - Dark", uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun ExactWrapperColors() {
    M2AdaptiveTheme {
        M3Wrapper(colorScheme = M3WrapperDefaults.exactColorScheme()) {
            M3Swatch()
        }
    }
}

@Preview(name = "M3 Colors")
@Preview(name = "M3 Colors - Dark", uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun M3Colors() {
    M3AdaptiveTheme {
        M3Swatch()
    }
}