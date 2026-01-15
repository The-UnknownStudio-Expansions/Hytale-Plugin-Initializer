plugins {
    java
}

group = "{{ self.group }}"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(24))
    }
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("com.hypixel.hytale:hytale-server:1.0")
}
