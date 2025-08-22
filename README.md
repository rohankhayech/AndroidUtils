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

**Module:** `preview`

### Theme Utils
Utilities for theming Compose UI.
- Adaptable material theme composable that handles dark theme and dynamic color logic internally.
- True dark (AMOLED black) color set and associated color methods.
- Dynamic color sets for Material 2, including color harmonisation methods for Compose.
- Extended default component colors including secondary (de-emphasised) button colors.

**Module:** `theme` (Material 2) or `theme-m3` (Material 3) 

## Installation 
Android Utils is available via Jitpack.io as both a full library or individual modules.

**Latest Version:**

[![](https://jitpack.io/v/rohankhayech/AndroidUtils.svg)](https://jitpack.io/#rohankhayech/AndroidUtils)

To use the library you must first add Jitpack.io as a repository in your project's root level `build.gradle` file:
```groovy
allprojects {
  repositories {
    // ...
    maven { url 'https://jitpack.io' }
  }
}
```

You can then add the full library as a dependency in your app/module level `build.gradle` file:
```groovy
dependencies {
  // ...
  implementation 'com.github.rohankhayech:AndroidUtils:[version]'
}
```

Or add individual modules:
```groovy
dependencies {
  // ...
  implementation 'com.github.rohankhayech.AndroidUtils:[module]:[version]'
}
```

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
