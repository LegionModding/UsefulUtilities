package com.legionmodding.usefulutilities.handler.registry;

import com.legionmodding.usefulutilities.UsefulUtilities;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = UsefulUtilities.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DimensionRegistry
{
    public static final RegistryKey<World> MINING_DIMENSION = RegistryKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(UsefulUtilities.MOD_ID, "mining_dimension"));
}