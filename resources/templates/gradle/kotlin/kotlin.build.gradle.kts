plugins {
    kotlin("jvm") version "2.0.0"
}

group = "{{ self.group }}"
version = "1.0-SNAPSHOT"

kotlin {
    jvmToolchain(24)
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("com.hypixel.hytale:hytale-server:1.0")
}
