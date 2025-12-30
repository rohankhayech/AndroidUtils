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

package com.rohankhayech.android.util.ui.preview.wear

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.Wallpapers.BLUE_DOMINATED_EXAMPLE
import androidx.compose.ui.tooling.preview.Wallpapers.GREEN_DOMINATED_EXAMPLE
import androidx.compose.ui.tooling.preview.Wallpapers.RED_DOMINATED_EXAMPLE
import androidx.compose.ui.tooling.preview.Wallpapers.YELLOW_DOMINATED_EXAMPLE
import androidx.wear.tooling.preview.devices.WearDevices

@Preview(device = WearDevices.SMALL_ROUND)
@Preview(device = WearDevices.SQUARE)
annotation class WearPreview

@Preview(device = WearDevices.LARGE_ROUND)
@Preview(device = WearDevices.RECT)
annotation class WearLargePreview

@Suppress("unused")
@WearPreview
@WearLargePreview
annotation class WearSizePreview

@Suppress("unused")
@Preview(device = WearDevices.SMALL_ROUND, name = "Red", wallpaper = RED_DOMINATED_EXAMPLE)
@Preview(device = WearDevices.SMALL_ROUND, name = "Blue", wallpaper = BLUE_DOMINATED_EXAMPLE)
@Preview(device = WearDevices.SMALL_ROUND, name = "Green", wallpaper = GREEN_DOMINATED_EXAMPLE)
@Preview(device = WearDevices.SMALL_ROUND, name = "Yellow", wallpaper = YELLOW_DOMINATED_EXAMPLE)
annotation class WearDynamicPreview