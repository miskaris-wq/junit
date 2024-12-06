/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn more about Gradle by exploring our Samples at https://docs.gradle.org/8.10.2/samples
 * This project uses @Incubating APIs which are subject to change.
 */
plugins {
    kotlin("jvm") version "1.6.10" // Убедитесь, что у вас установлен плагин Kotlin
}

repositories {
    mavenCentral() // Репозиторий maven central
}

dependencies {
    implementation(kotlin("stdlib"))

    // Зависимости для тестирования
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.3")
}

tasks.test {
    useJUnitPlatform() // Используйте платформу JUnit
}