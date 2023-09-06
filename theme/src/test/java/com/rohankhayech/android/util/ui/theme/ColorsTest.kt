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