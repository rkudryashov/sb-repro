rootProject.name = "sb-repro"

include(
    "sb-repro-1"
)

pluginManagement {
    val springBootVersion: String by settings
    val springDependencyManagementVersion: String by settings
    val nativeBuildToolsVersion: String by settings
    val hibernateVersion: String by settings
    val kotlinVersion: String by settings

    plugins {
        id("org.springframework.boot") version springBootVersion
        id("io.spring.dependency-management") version springDependencyManagementVersion
        id("org.graalvm.buildtools.native") version nativeBuildToolsVersion
        id("org.hibernate.orm") version hibernateVersion
        kotlin("jvm") version kotlinVersion
        kotlin("plugin.spring") version kotlinVersion
        kotlin("plugin.jpa") version kotlinVersion
    }
}
