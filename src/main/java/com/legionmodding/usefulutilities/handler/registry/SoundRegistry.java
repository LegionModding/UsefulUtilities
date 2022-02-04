package com.legionmodding.usefulutilities.handler.registry;

import com.legionmodding.usefulutilities.UsefulUtilities;

import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class SoundRegistry
{
    private static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, UsefulUtilities.MOD_ID);

    public static void registerSounds()
    {
        SOUNDS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
