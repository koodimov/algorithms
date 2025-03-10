plugins {
    kotlin("jvm") version "2.1.0"
}

group = "mov.kudy"
version = "1.0-SNAPSHOT"

val kotestVersion = "5.9.1"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("io.kotest:kotest-runner-junit5:$kotestVersion")
    testImplementation("io.kotest:kotest-assertions-core:$kotestVersion")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}