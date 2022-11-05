# Readme
Build the library for Android:
1. Fire the `buildAndroidLib` gradle task in the `ldklite-android` directory
2. Publish it to your local Maven
```shell
cd ldklite-android
./gradlew buildAndroidLib
./gradlew publishToMavenLocal --exclude-task signMavenPublication
```

You should be able to use the library by adding it like any other dependency in an Android project, given you add `mavenLocal()` to your list of repositories to fetch dependencies from:
```kotlin
// build.gradle.kts
repositories {
    mavenCentral()
    mavenLocal()
}
```
