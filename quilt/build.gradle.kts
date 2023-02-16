import net.fabricmc.loom.api.mappings.layered.spec.LayeredMappingSpecBuilder

plugins {
    id("org.quiltmc.loom") version "0.12-SNAPSHOT"
}

dependencies {
    minecraft("com.mojang:minecraft:1.19.3")
    mappings(loom.layered(LayeredMappingSpecBuilder::officialMojangMappings))

    modImplementation("org.quiltmc:quilt-loader:0.18.1-beta.26")
    modImplementation("org.quiltmc.quilted-fabric-api:quilted-fabric-api:5.0.0-alpha.8+0.71.0-1.19.3")
}