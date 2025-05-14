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

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color
import org.junit.Assert.assertEquals
import org.junit.Test

class ColorsTest {
    @Test
    fun testTrueDarkColors() {
        val colors = darkColorScheme().trueDark()
        assertEquals(colors.background, Color.Black)
        assertEquals(colors.onBackground, Color.LightGray)
    }

    @Test
    fun testPrimaryBackground() {
        // Light
        val lColors = lightColorScheme()
        var pb = lColors.primaryBackground(isLight = true)
        assertEquals(lColors.primaryContainer, pb)

        // Dark
        val dColors = darkColorScheme()
        pb = dColors.primaryBackground(isLight = false)
        assertEquals(dColors.background, pb)
    }

    @Test
    fun testPrimaryContainerBackground() {
        // Light
        val lColors = lightColorScheme()
        var pcb = lColors.primaryContainerBackground(isLight = true, trueDark = false)
        assertEquals(lColors.primaryContainer, pcb)
        pcb = lColors.primaryContainerBackground(isLight = true, trueDark = true)
        assertEquals(lColors.primaryContainer, pcb)

        // Dark
        val dColors = darkColorScheme()
        pcb = dColors.primaryContainerBackground(isLight = false, trueDark = false)
        assertEquals(dColors.primaryContainer, pcb)

        // True Dark
        val tdColors = darkColorScheme()
        pcb = tdColors.primaryContainerBackground(isLight = false, trueDark = true)
        assertEquals(tdColors.background, pcb)
    }

    @Test
    fun testVibrantContainer() {
        // Light
        val lColors = lightColorScheme()
        var vc = lColors.vibrantContainer(isLight = true, trueDark = false)
        assertEquals(lColors.primary, vc)
        vc = lColors.vibrantContainer(isLight = true, trueDark = true)
        assertEquals(lColors.primary, vc)

        // Dark
        val dColors = darkColorScheme()
        vc = dColors.vibrantContainer(isLight = false, trueDark = false)
        assertEquals(dColors.primaryContainer, vc)

        // True Dark
        val tdColors = darkColorScheme()
        vc = tdColors.vibrantContainer(isLight = false, trueDark = true)
        assertEquals(tdColors.background, vc)
    }
}