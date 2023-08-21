/*
 * Copyright (C) 2023 Rohan Khayech
 */

package com.rohankhayech.android.util.ui.preview

import android.content.res.Configuration
import androidx.compose.ui.tooling.preview.Preview

/**
 * Preview utilities for Compose.
 * @author Rohan Khayech
 */

/**
 * Previews for light and dark theme.
 * @author Rohan Khayech
 */
@Preview(group = "Light")
@Preview(group = "Dark", uiMode = Configuration.UI_MODE_NIGHT_YES)
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
@Preview(group = "Dark", uiMode = Configuration.UI_MODE_NIGHT_YES, device = "spec:parent=pixel_5,orientation=landscape")
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
@Preview(group = "Dark", device = "spec:width=1280dp,height=800dp,dpi=240", uiMode = Configuration.UI_MODE_NIGHT_YES)
annotation class TabletThemePreview

/**
 * Previews for tablet devices in portrait and landscape orientation.
 * @author Rohan Khayech
 */
@Preview(group = "Light", device = "spec:width=1280dp,height=800dp,dpi=240,orientation=portrait")
annotation class TabletOrientationPreview

/**
 * Preview for tablet devices in portrait and landscape orientation, in both light and dark theme.
 * @author Rohan Khayech
 */
@TabletThemePreview
@TabletOrientationPreview
@Preview(group = "Dark", device = "spec:width=1280dp,height=800dp,dpi=240,orientation=portrait", uiMode = Configuration.UI_MODE_NIGHT_YES)
annotation class TabletOrientationThemePreview

/**
 * Previews for all devices.
 * @author Rohan Khayech
 */
@Preview(group = "Light")
@TabletPreview
annotation class DevicePreview

/**
 * Previews for all devices in light and dark theme.
 * @author Rohan Khayech
 */
@ThemePreview
@TabletThemePreview
annotation class DeviceThemePreview

/**
 * Previews for all devices in portrait and landscape orientation.
 * @author Rohan Khayech
 */
@OrientationPreview
@TabletOrientationPreview
annotation class DeviceOrientationPreview

/**
 * Previews for all devices in portrait and landscape orientation, in both light and dark theme.
 * @author Rohan Khayech
 */
@OrientationThemePreview
@TabletOrientationThemePreview
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