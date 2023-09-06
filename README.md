# Android Utils
Collection of utility modules useful for Android projects.

**Author:** Rohan Khayech

## Modules

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

**Module:** `theme`

### Installation 
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
