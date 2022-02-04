package com.legionmodding.usefulutilities.item;

import com.legionmodding.usefulutilities.handler.registry.BlockRegistry;
import com.legionmodding.usefulutilities.util.Reference;

import net.minecraft.block.AirBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemAngelBlock extends BlockItem
{
    public ItemAngelBlock()
    {
        super(BlockRegistry.ANGEL_BLOCK.get(), new Item.Properties().tab(Reference.CREATIVE_TAB_BLOCKS));
    }

    @Override
    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand)
    {
        if (!world.isClientSide)
        {
            double x = player.getX() + 3 * player.getLookAngle().x;
            double y = 1.5 + player.getY() + 3 * player.getLookAngle().y;
            double z = player.getZ() + 3 * player.getLookAngle().z;

            BlockPos pos = new BlockPos(x,y,z);

            if (world.getBlockState(pos).getBlock() instanceof AirBlock || !world.getFluidState(pos).isEmpty())
            {
                world.setBlockAndUpdate(pos, BlockRegistry.ANGEL_BLOCK.get().defaultBlockState());

                if (!player.isCreative())
                {
                    player.getItemInHand(hand).shrink(1);
                }
            }
        }

        player.playSound(SoundEvents.METAL_PLACE, 1.0F, 1.0F);
        return new ActionResult<>(ActionResultType.PASS, player.getItemInHand(hand));
    }
}
