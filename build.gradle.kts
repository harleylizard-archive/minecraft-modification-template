plugins {
    id("java")
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

fun SourceSetContainer.copy(sourceSet: SourceSet) {
    main.configure {
        java.srcDirs(sourceSet.java.srcDirs())
        resources.srcDirs(sourceSet.resources.srcDirs())
    }
}

subprojects {
    apply(plugin = "java")

    project(":common").takeIf { project != it }?.let {
        sourceSets.copy(it.sourceSets.main.get())

        dependencies {
            implementation(it)
        }
    }

    java {
        withSourcesJar()
    }
}