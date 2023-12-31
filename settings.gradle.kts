rootProject.name = "sb-repro"

pluginManagement {
    val springBootVersion: String by settings
    val springDependencyManagementVersion: String by settings
    val nativeBuildToolsVersion: String by settings
    val hibernateVersion: String by settings
    val kotlinVersion: String by settings

    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://repo.spring.io/milestone/")
    }

    plugins {
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version springDependencyManagementVersion
        id("org.graalvm.buildtools.native") version nativeBuildToolsVersion
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion
        kotlin("plugin.jpa") version kotlinVersion
    }
}
