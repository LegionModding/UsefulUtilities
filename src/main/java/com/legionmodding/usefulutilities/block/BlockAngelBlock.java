package com.legionmodding.usefulutilities.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class BlockAngelBlock extends Block
{
    public BlockAngelBlock()
    {
        super(Block.Properties.of(Material.METAL).harvestLevel(2).harvestTool(ToolType.PICKAXE).strength(Float.MAX_VALUE, Float.MAX_VALUE).sound(SoundType.METAL));
    }

    @Override
    public void playerDestroy(World world, PlayerEntity player, BlockPos pos, BlockState blockState, @Nullable TileEntity tileEntity, ItemStack stack)
    {
        if (!world.isClientSide && !player.isCreative())
        {
            player.addItem(new ItemStack(this));
        }
    }
}
