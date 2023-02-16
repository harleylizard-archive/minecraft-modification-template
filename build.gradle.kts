plugins {
    id("java")
    id("jvm-class-extensions") version "1.3"
    id("jvm-post-processing") version "0.6.1"
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

allprojects {
    group = "com.chaottic"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "jvm-class-extensions")
    apply(plugin = "jvm-post-processing")

    val common = project(":common")

    if (project != common) {
        sourceSets.main.configure {
            val main = common.sourceSets.main.get()

            java.srcDirs(main.java.srcDirs)
            resources.srcDirs(main.resources.srcDirs)
        }

        dependencies {
            implementation(common)
        }
    }
}