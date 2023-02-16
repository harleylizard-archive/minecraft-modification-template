pluginManagement {
	repositories {
		gradlePluginPortal()
		mavenCentral()
		mavenLocal()
		maven("https://maven.fabricmc.net/")
		maven("https://maven.architectury.dev/")
		maven("https://files.minecraftforge.net/maven/")
		maven("https://repo.spongepowered.org/repository/maven-public/")
		maven("https://maven.quiltmc.org/repository/snapshot/")
		maven("https://maven.quiltmc.org/repository/release/")
		maven("https://maven.msrandom.net/repository/root/")
	}
}
rootProject.name = "minecraft-modification-template"
include("forge", "fabric", "quilt", "common")