package com.legionmodding.usefulutilities.handler.registry;

import com.legionmodding.usefulutilities.UsefulUtilities;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeMaker;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeRegistry
{
    public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, UsefulUtilities.MOD_ID);

    public static final RegistryObject<Biome> MINING_DIMENSION = BIOMES.register("mining_dimension", BiomeMaker::theVoidBiome);

    public static void registerBiomes()
    {
        BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public static final class Type
    {
        public static final BiomeDictionary.Type MINING_DIMENSION = BiomeDictionary.Type.getType("MINING_DIMENSION");
    }
}
