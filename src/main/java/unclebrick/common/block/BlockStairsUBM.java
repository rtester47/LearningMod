package unclebrick.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockStairsUBM extends BlockStairs
{
	public IBlockState modelState;
	public Block modelBlock;
	
	public BlockStairsUBM(IBlockState state, Block.Properties properties) 
	{
		super(state, properties);
		this.modelBlock = state.getBlock();
		this.modelState = state;
	}
}
