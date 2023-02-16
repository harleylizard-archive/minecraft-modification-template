import net.fabricmc.loom.api.mappings.layered.spec.LayeredMappingSpecBuilder

plugins {
    id("dev.architectury.loom") version "0.12.0-SNAPSHOT"
}

loom {

}

dependencies {
    minecraft("com.mojang:minecraft:1.19.3")
    mappings(loom.layered(LayeredMappingSpecBuilder::officialMojangMappings))

    forge("net.minecraftforge:forge:1.19.3-44.1.16")
}