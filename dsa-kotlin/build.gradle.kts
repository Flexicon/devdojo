plugins {
    kotlin("jvm") version "2.4.10"
}

group = "dev.devdojo"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(21)
}

dependencies {
    testImplementation(kotlin("test-junit5"))
}

tasks.test {
    useJUnitPlatform()

    if (project.hasProperty("problem")) {
        filter {
            includeTestsMatching("*${project.property("problem")}*")
        }
    }
}
