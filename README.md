# Android Utils
Collection of utility modules useful for Android projects.

**Author:** Rohan Khayech

## Modules

### Layout Utils
Utilities for Compose layouts.
- Helper function to scroll lazy list items to a specific position on the screen
- Effect which automatically scrolls to the selected item in a lazy list.

**Module:** `layout`

### Preview Utils
Utilities for Compose previews.
- Preview annotations for combinations of theme, devices, orientation and more.
- Wrapper to correctly display previews with a background and theme.
- Color swatch that can be used to preview the colors of a material theme.

**Module:** `preview-m3` (Material 3) or `preview-m3` (Material 2)

### Theme Utils
Utilities for theming Compose UI.
- Adaptable material theme composable that handles dark theme and dynamic color logic internally.
- True dark (AMOLED black) color set and associated color methods.
- Dynamic color sets for Material 2, including color harmonisation methods for Compose.
- Extended default component colors including secondary (de-emphasised) button colors.
- Drop-in status bar color component to set light or dark status bar icons.

**Module:** `theme-m3` (Material 3) or `theme-m2` (Material 2)

### Theme Wrapper for Compose Material 3
Provides wrappers to apply Material 3 (M3) themes to Material 2 (M2) components and vice-versa.
- Provides wrapper composables that take the color, typography and shape values from the applied M2/M3 theme and maps them onto a M3/M2 theme.
- Use existing Compose components and libraries built with M2 in your M3 project, and your theme will be applied.
- Use new M3 components in your existing M2 project.
- Migrate parts of your UI or migrate your theme without worrying about compatibility with old or new Compose libraries and components.

See the [documentation](/theme-wrapper/README.md) for more info and usage instructions.

**Module:** `theme-wrapper`

## Installation 
Android Utils is available via Jitpack.io as individual modules and as a full library.

**Latest Version:**

[![](https://jitpack.io/v/rohankhayech/AndroidUtils.svg)](https://jitpack.io/#rohankhayech/AndroidUtils)

To use the library you must first add Jitpack.io as a repository in your project's root level `settings.gradle.kts` file:
```kotlin
dependencyResolutionManagement {
	repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
	repositories {
		// ...
		maven { url = uri("https://jitpack.io") }
	}
}
```
It is recommended to add JitPack as the last repository in the list to avoid package conflicts.

You can then add the the required modules from the library as dependencies in your app/module level `build.gradle.kts` file:
```kotlin
dependencies {
	// ...
	implementation("com.github.rohankhayech.AndroidUtils:[module]:[version]")
}
```

Or add the whole library:
```kotlin
dependencies {
	// ...
	implementation("com.github.rohankhayech:AndroidUtils:[version]")
}
```
> [!NOTE]
> Adding the whole library will include both M2 and M3 modules, as well as migration compatibility modules. It is recommended to only install the modules your project uses.

## License and Copyright

Copyright © 2025 Rohan Khayech

Android Utils is licensed under the Apache License, Version 2.0.

```
Copyright 2025 Rohan Khayech

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

See [LICENSE](LICENSE) for the full license terms.
