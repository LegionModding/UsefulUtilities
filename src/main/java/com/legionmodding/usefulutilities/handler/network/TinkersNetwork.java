package com.legionmodding.usefulutilities.handler.network;

import com.legionmodding.usefulutilities.UsefulUtilities;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.network.NetworkRegistry;
import net.minecraftforge.fml.network.simple.SimpleChannel;

public class TinkersNetwork
{
    private static final String PROTOCOL_VERSION = "1";

    public static SimpleChannel INSTANCE = NetworkRegistry.ChannelBuilder
            .named(new ResourceLocation(UsefulUtilities.MOD_ID, "useful_utilities"))
            .clientAcceptedVersions(PROTOCOL_VERSION::equals)
            .serverAcceptedVersions(PROTOCOL_VERSION::equals)
            .networkProtocolVersion(() -> PROTOCOL_VERSION)
            .simpleChannel();

    public static void init()
    {
        int i = 0;

    }
}
