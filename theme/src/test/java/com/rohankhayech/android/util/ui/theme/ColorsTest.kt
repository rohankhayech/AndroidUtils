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

package com.rohankhayech.android.util.ui.theme

import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Test

class ColorsTest {

    @Test
    fun testTrueDarkColors() {
        val colors = trueDarkColors()
        assertFalse(colors.isLight)
        assertEquals(colors.background, Color.Black)
        assertEquals(colors.onBackground, Color.LightGray)
    }

    @Test
    fun testPrimarySurfaceDark() {
        // Light
        val lColors = lightColors()
        var psd = lColors.primarySurfaceBackground(trueDark = false)
        assertEquals(lColors.primary, psd)
        psd = lColors.primarySurfaceBackground(trueDark = true)
        assertEquals(lColors.primary, psd)

        // Dark
        val dColors = darkColors()
        psd = dColors.primarySurfaceBackground(trueDark = false)
        assertEquals(dColors.surface, psd)

        // True Dark
        val tdColors = trueDarkColors()
        psd = tdColors.primarySurfaceBackground(trueDark = true)
        assertEquals(tdColors.background, psd)
    }

    @Test
    fun testSurfaceBackground() {
        // Light
        val lColors = lightColors()
        var psd = lColors.surfaceBackground(trueDark = false)
        assertEquals(lColors.surface, psd)
        psd = lColors.surfaceBackground(trueDark = true)
        assertEquals(lColors.surface, psd)

        // Dark
        val dColors = darkColors()
        psd = dColors.surfaceBackground(trueDark = false)
        assertEquals(dColors.surface, psd)

        // True Dark
        val tdColors = trueDarkColors()
        psd = tdColors.surfaceBackground(trueDark = true)
        assertEquals(tdColors.background, psd)
    }
}