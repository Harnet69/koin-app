import io.gitlab.arturbosch.detekt.Detekt

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.detekt)
}

tasks.register<Detekt>("detektAll") {
    description = "Detekt build"
    buildUponDefaultConfig = true
    setSource(file(projectDir))
    config.setFrom(file("$rootDir/config/detekt/detekt.yml"))
    include("**/*.kt")
    autoCorrect = true
}

dependencies {
    detektPlugins(libs.detekt.formatting)
}