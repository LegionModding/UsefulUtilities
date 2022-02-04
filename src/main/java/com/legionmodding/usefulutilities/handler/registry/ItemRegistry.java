package com.legionmodding.usefulutilities.handler.registry;

import com.legionmodding.usefulutilities.UsefulUtilities;
import com.legionmodding.usefulutilities.item.ItemAngelBlock;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegistry
{
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, UsefulUtilities.MOD_ID);

    private static final RegistryObject<Item> ANGEL_BLOCK = ITEMS.register("angel_block", ItemAngelBlock::new);

    public static void registerItems()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
