package com.github.rtester47.unclebrick.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;

public class BlockStairsUBM extends StairsBlock
{
	public BlockState modelState;
	public Block modelBlock;
	
	public BlockStairsUBM(BlockState state, Block.Properties properties) 
	{
		super(state, properties);
		this.modelBlock = state.getBlock();
		this.modelState = state;
	}
}
