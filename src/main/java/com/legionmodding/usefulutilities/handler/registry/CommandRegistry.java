package com.legionmodding.usefulutilities.handler.registry;

import com.legionmodding.usefulutilities.UsefulUtilities;
import com.legionmodding.usefulutilities.command.CommandMiningDimension;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.tree.LiteralCommandNode;

import net.minecraft.command.CommandSource;
import net.minecraft.command.Commands;

public class CommandRegistry
{
    public static void register(CommandDispatcher<CommandSource> dispatcher)
    {
        LiteralCommandNode<CommandSource> cmdMiningTeleport = dispatcher.register(
                Commands.literal(UsefulUtilities.MOD_ID)
                        .then(CommandMiningDimension.register(dispatcher))
        );

        dispatcher.register(Commands.literal("mining_dimension").redirect(cmdMiningTeleport));
    }
}
