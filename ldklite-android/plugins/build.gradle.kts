plugins {
    id("java-gradle-plugin")
    `kotlin-dsl`
}

gradlePlugin {
    plugins {
        create("uniFfiAndroidBindings") {
            id = "org.lightningdevkit.plugins.generate-android-bindings"
            implementationClass = "org.lightningdevkit.plugins.UniFfiAndroidPlugin"
        }
    }
}
