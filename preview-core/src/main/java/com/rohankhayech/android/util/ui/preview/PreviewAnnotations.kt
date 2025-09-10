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

package com.rohankhayech.android.util.ui.preview

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Preview

/**
 * Preview annotations for Compose.
 * @author Rohan Khayech
 */

/**
 * Preview for dark theme.
 * @author Rohan Khayech
 */
@Preview(name = "Phone (Dark)", group = "Dark", uiMode = UI_MODE_NIGHT_YES)
annotation class DarkPreview

/**
 * Previews for light and dark theme.
 * @author Rohan Khayech
 */
@Preview(name = "Phone", group = "Light")
@DarkPreview
annotation class ThemePreview

/**
 * Preview for landscape orientation.
 * @author Rohan Khayech
 */
@Preview(name = "Phone (Landscape)", group = "Light", device = "spec:parent=pixel_5,orientation=landscape")
annotation class LandscapePreview

/**
 * Previews for landscape orientation in light and dark theme.
 * @author Rohan Khayech
 */
@LandscapePreview
@Preview(
    name = "Phone (Landscape, Dark)",
    group = "Dark",
    uiMode = UI_MODE_NIGHT_YES,
    device = "spec:parent=pixel_5, orientation=landscape"
)
annotation class LandscapeThemePreview

/**
 * Previews for portrait and landscape orientation.
 * @author Rohan Khayech
 */
@Preview(
    name = "Phone",
    group = "Light"
)
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
@Preview(
    name = "Tablet",
    group = "Light",
    device = "spec:width=1280dp, height=800dp, dpi=240"
)
annotation class TabletPreview

/**
 * Previews for tablet devices in light and dark theme.
 * @author Rohan Khayech
 */
@TabletPreview
@Preview(
    name = "Tablet (Dark)",
    group = "Dark",
    device = "spec:width=1280dp, height=800dp, dpi=240",
    uiMode = UI_MODE_NIGHT_YES
)
annotation class TabletThemePreview

/**
 * Previews for tablet devices in portrait and landscape orientation.
 * @author Rohan Khayech
 */
@TabletPreview
@Preview(
    name = "Tablet (Portrait)",
    group = "Light",
    device = "spec:width=1280dp, height=800dp, dpi=240, orientation=portrait"
)
annotation class TabletOrientationPreview

/**
 * Preview for tablet devices in portrait and landscape orientation, in both light and dark theme.
 * @author Rohan Khayech
 */
@TabletThemePreview
@Preview(
    name = "Tablet (Portrait)",
    group = "Light",
    device = "spec:width=1280dp, height=800dp, dpi=240, orientation=portrait"
)
@Preview(
    name = "Tablet (Portrait, Dark)",
    group = "Dark",
    device = "spec:width=1280dp, height=800dp, dpi=240, orientation=portrait",
    uiMode = UI_MODE_NIGHT_YES
)
annotation class TabletOrientationThemePreview

/**
 * Preview for small-screen devices.
 * @author Rohan Khayech
 */
@Preview(
    name = "Small Screen",
    group = "Light",
    device = "spec:parent=2.7in QVGA"
)
annotation class CompactPreview

/**
 * Previews for small-screen devices in both light and dark theme.
 * @author Rohan Khayech
 */
@CompactPreview
@Preview(
    name = "Small Screen (Dark)",
    group = "Dark",
    device = "spec:parent=2.7in QVGA",
    uiMode = UI_MODE_NIGHT_YES
)
annotation class CompactThemePreview

/**
 * Preview for small-screen devices in portrait and landscape orientation.
 * @author Rohan Khayech
 */
@CompactPreview
@Preview(
    name = "Small Screen (Landscape)",
    group = "Light",
    device = "spec:parent=2.7in QVGA, orientation=landscape"
)
annotation class CompactOrientationPreview

/**
 * Preview for small-screen devices in portrait and landscape orientation,
 * in both light and dark theme.
 * @author Rohan Khayech
 */
@CompactThemePreview
@Preview(
    name = "Small Screen (Landscape)",
    group = "Light",
    device = "spec:parent=2.7in QVGA, orientation=landscape"
)
@Preview(
    name = "Small Screen (Landscape, Dark)",
    group = "Dark",
    device = "spec:parent=2.7in QVGA, orientation=landscape",
    uiMode = UI_MODE_NIGHT_YES
)
annotation class CompactOrientationThemePreview

/**
 * Previews for all devices.
 * @author Rohan Khayech
 */
@Preview(
    name = "Phone",
    group = "Light"
)
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
 * @author Rohan Khayech
 */
@Preview(
    name = "Phone (Large Font Size)",
    fontScale = 1.3f
)
annotation class LargeFontPreview

/**
 * Full set of previews for device, orientation, theme and font scale.
 * @author Rohan Khayech
 */
@DeviceOrientationThemePreview
@LargeFontPreview
annotation class FullPreview