package com.legionmodding.usefulutilities.util;

import com.legionmodding.usefulutilities.handler.registry.BlockRegistry;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class Reference
{
    public static final ItemGroup CREATIVE_TAB_BLOCKS = new ItemGroup("creativetabblocks")
    {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(BlockRegistry.ANGEL_BLOCK.get());
        }
    };
}
