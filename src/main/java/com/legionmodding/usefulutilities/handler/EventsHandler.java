package com.legionmodding.usefulutilities.handler;

import com.legionmodding.usefulutilities.UsefulUtilities;
import com.legionmodding.usefulutilities.handler.registry.CommandRegistry;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = UsefulUtilities.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class EventsHandler
{
    @SubscribeEvent
    public static void serverLoad(RegisterCommandsEvent event)
    {
        CommandRegistry.register(event.getDispatcher());
    }
}
