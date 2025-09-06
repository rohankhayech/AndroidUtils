# Theme Wrapper for Compose Material 3

Library for Jetpack Compose providing wrappers to apply **Material 3** (M3) themes to **Material 2** (M2) components and vice-versa.

## Features
- Provides wrapper composables that take the color, typography and shape values from the applied M2/M3 theme and maps them onto a M3/M2 theme.

- Use existing Compose components and libraries built with M2 in your M3 project, and your theme will be applied.

- Use new M3 components in your existing M2 project.

- Migrate parts of your UI or migrate your theme without worrying about compatibility with old or new Compose libraries and components.

## Basic Usage

Simply wrap a Material 2 composable with a `M2Wrapper` and the Material 3 theme will be applied:

```kotlin
MaterialTheme { // Material 3 Theme
    M2Wrapper { // Wrap with a Material 2 Theme Wrapper
        // Insert Material 2 components here...
        ExampleM2Component()
    }
}
```

Material 3 composables can likewise be wrapped with a `M3Wrapper` to apply the Material 2 Theme:
```kotlin
MaterialTheme { // Material 2 Theme
    M3Wrapper { // Wrap with a Material 3 Theme Wrapper
        // Insert Material 3 components here...
        ExampleM3Component()
    }
}
```

## Usage

### Best Practice
The library is intended for use with existing custom built components and the wide variety of component libraries available online, in order to increase compatibility and theming support in existing projects and outdated libraries.

It aims to solve some of the migration issues outlined in the [Android Developers documentation](https://developer.android.com/jetpack/compose/designsystems/material2-material3).

As default M2 components *(such as buttons, the top app bar, and other controls)* use different color roles and shape sizes than their M3 counterparts, they will not look exactly the same even with the wrapper applied (and vice-versa). Therefore it is recommended to simply use the default low-level components of the intended theme where possible, and only use the wrapper for more complex components. 

The above linked resource explains the difference between the two design systems and their compatibility in greater detail.

### Customisation
By default, the wrappers map the colors and shapes that allow for components to best match their counterparts in the current theme.

If this does not work as expected, the library also provides the `exactColors()`, `exactColorScheme()` and `exactShapes()` mappings which map values 1:1 to their named counterparts in the current theme, which may be more intuitive depending on the component.

These can be specified by modifying the properties of the wrapper:
```kotlin
M2Wrapper(
    colors = M2WrapperDefaults.exactColors()
) { /* ... */ }
```
```kotlin
M3Wrapper(
    colorScheme = M3WrapperDefaults.exactColorScheme(),
    shapes = M3WrapperDefaults.exactShapes()
) { /* ... */ }
```

All of the default color, typography and shape mappings can also be overridden as required, for example:
```kotlin
M2Wrapper(
    colors = M2WrapperDefaults.colors(
        primaryVariant = MaterialTheme.colorScheme.primaryContainer
    )
) { /* ... */ }
```

The `M2WrapperDefaults` and `M3WrapperDefaults` provide the default `colors()` / `colorScheme()`, `shapes()` and `typography()` mappings to allow for complete customisation.

This is useful for ensuring the correct colors etc. are used for components that lack color customisation.

> For best results, use the wrapper as close to the component as possible to allow mappings to be customised per component.

You can also specify your own `Colors` / `ColorScheme`, `Shapes` and `Typography` objects, however this is not recommended.

