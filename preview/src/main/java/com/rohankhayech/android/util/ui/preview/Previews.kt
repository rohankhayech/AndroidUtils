/*
 * Copyright (C) 2023 Rohan Khayech
 */

package com.rohankhayech.android.util.ui.preview

import android.annotation.SuppressLint
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

/**
 * Preview utilities for Compose.
 * @author Rohan Khayech
 */

/**
 * Preview for dark theme.
 * @author Rohan Khayech
 */
@Preview(group = "Dark", uiMode = UI_MODE_NIGHT_YES)
annotation class DarkPreview

/**
 * Previews for light and dark theme.
 * @author Rohan Khayech
 */
@Preview(group = "Light")
@DarkPreview
annotation class ThemePreview

/**
 * Preview for landscape orientation.
 * @author Rohan Khayech
 */
@Preview(group = "Light", device = "spec:parent=pixel_5,orientation=landscape")
annotation class LandscapePreview

/**
 * Previews for landscape orientation in light and dark theme.
 * @author Rohan Khayech
 */
@LandscapePreview
@Preview(group = "Dark", uiMode = UI_MODE_NIGHT_YES, device = "spec:parent=pixel_5,orientation=landscape")
annotation class LandscapeThemePreview

/**
 * Previews for portrait and landscape orientation.
 * @author Rohan Khayech
 */
@Preview(group = "Light")
@LandscapePreview
annotation class OrientationPreview

/**
 * Previews for portrait and landscape orientation, in light and dark theme.
 * @author Rohan Khayech
 */
@ThemePreview
@LandscapeThemePreview
annotation class OrientationThemePreview

/**
 * Preview for tablet devices.
 * @author Rohan Khayech
 */
@Preview(group = "Light", device = "spec:width=1280dp,height=800dp,dpi=240")
annotation class TabletPreview

/**
 * Previews for tablet devices in light and dark theme.
 * @author Rohan Khayech
 */
@TabletPreview
@Preview(group = "Dark", device = "spec:width=1280dp,height=800dp,dpi=240", uiMode = UI_MODE_NIGHT_YES)
annotation class TabletThemePreview

/**
 * Previews for tablet devices in portrait and landscape orientation.
 * @author Rohan Khayech
 */
@TabletPreview
@Preview(group = "Light", device = "spec:width=1280dp,height=800dp,dpi=240,orientation=portrait")
annotation class TabletOrientationPreview

/**
 * Preview for tablet devices in portrait and landscape orientation, in both light and dark theme.
 * @author Rohan Khayech
 */
@TabletThemePreview
@Preview(group = "Light", device = "spec:width=1280dp,height=800dp,dpi=240,orientation=portrait")
@Preview(group = "Dark", device = "spec:width=1280dp,height=800dp,dpi=240,orientation=portrait", uiMode = UI_MODE_NIGHT_YES)
annotation class TabletOrientationThemePreview

@Preview(group = "Light", device = "spec:parent=2.7in QVGA")
annotation class CompactPreview

@CompactPreview
@Preview(group = "Dark", device = "spec:parent=2.7in QVGA", uiMode = UI_MODE_NIGHT_YES)
annotation class CompactThemePreview

@CompactPreview
@Preview(group = "Light", device = "spec:parent=2.7in QVGA,orientation=landscape")
annotation class CompactOrientationPreview

@CompactThemePreview
@Preview(group = "Light", device = "spec:parent=2.7in QVGA,orientation=landscape")
@Preview(group = "Dark", device = "spec:parent=2.7in QVGA,orientation=landscape", uiMode = UI_MODE_NIGHT_YES)
annotation class CompactOrientationThemePreview

/**
 * Previews for all devices.
 * @author Rohan Khayech
 */
@Preview(group = "Light")
@TabletPreview
@CompactPreview
annotation class DevicePreview

/**
 * Previews for all devices in light and dark theme.
 * @author Rohan Khayech
 */
@ThemePreview
@TabletThemePreview
@CompactThemePreview
annotation class DeviceThemePreview

/**
 * Previews for all devices in portrait and landscape orientation.
 * @author Rohan Khayech
 */
@OrientationPreview
@TabletOrientationPreview
@CompactOrientationPreview
annotation class DeviceOrientationPreview

/**
 * Previews for all devices in portrait and landscape orientation, in both light and dark theme.
 * @author Rohan Khayech
 */
@OrientationThemePreview
@TabletOrientationThemePreview
@CompactOrientationThemePreview
annotation class DeviceOrientationThemePreview

/**
 * Preview for largest font size.
 */
@Preview(fontScale = 1.3f)
annotation class LargeFontPreview

/**
 * Full set of previews for device, orientation, theme and font scale.
 */
@DeviceOrientationThemePreview
@LargeFontPreview
annotation class FullPreview

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@FullPreview
@Composable
private fun Preview() {
    PreviewWrapper {
        Scaffold(topBar = {
            TopAppBar(title = { Text("Preview") })
        }) {}
    }
}