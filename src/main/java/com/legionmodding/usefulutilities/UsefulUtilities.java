package com.legionmodding.usefulutilities;

import com.legionmodding.usefulutilities.handler.registry.BlockRegistry;
import com.legionmodding.usefulutilities.handler.registry.ItemRegistry;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(UsefulUtilities.MOD_ID)
public class UsefulUtilities
{
    public static final String MOD_ID = "usefulutilities";

    public UsefulUtilities()
    {
        BlockRegistry.registerBlocks();
        ItemRegistry.registerItems();

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);

        FMLJavaModLoadingContext.get().getModEventBus().register(this);
    }

    private void onClientSetup(FMLClientSetupEvent event)
    {

    }

    private void onCommonSetup(FMLCommonSetupEvent event)
    {

    }
}
