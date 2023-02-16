import net.fabricmc.loom.api.mappings.layered.spec.LayeredMappingSpecBuilder

plugins {
    id("fabric-loom") version "1.1-SNAPSHOT"
}

dependencies {
    minecraft("com.mojang:minecraft:1.19.3")
    mappings(loom.layered(LayeredMappingSpecBuilder::officialMojangMappings))

    modImplementation("net.fabricmc:fabric-loader:0.14.11")
    modImplementation("net.fabricmc.fabric-api:fabric-api:0.68.1+1.19.3")
}
