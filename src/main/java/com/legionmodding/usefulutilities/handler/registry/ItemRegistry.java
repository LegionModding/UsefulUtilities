package com.legionmodding.usefulutilities.handler.registry;

import com.legionmodding.usefulutilities.UsefulUtilities;

import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UsefulUtilities.MOD_ID);

    public static void registerItems()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
