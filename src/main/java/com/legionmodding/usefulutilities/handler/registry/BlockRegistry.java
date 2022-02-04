package com.legionmodding.usefulutilities.handler.registry;

import com.legionmodding.usefulutilities.UsefulUtilities;

import net.minecraft.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry
{
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, UsefulUtilities.MOD_ID);

    public static void registerBlocks()
    {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
