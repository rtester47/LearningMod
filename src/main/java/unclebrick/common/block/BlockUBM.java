package unclebrick.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraftforge.common.ToolType;

public class BlockUBM extends Block
{

	public BlockUBM(Block.Properties properties)
	{
		super(properties);
	}
	
	   @Override
	   public int getHarvestLevel(IBlockState state)
	   {
	      return 3;
	   }
	   
	   @Override
	   public ToolType getHarvestTool(IBlockState state) {
	      return ToolType.PICKAXE;
	   }
}
