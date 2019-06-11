package unclebrick.common.util.block;

import java.util.Collection;

import net.minecraft.block.state.IBlockState;
import net.minecraft.state.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.Heightmap;

public class BlockUtil {
	
	   @SuppressWarnings("rawtypes")
	public static IProperty getAxisProperty(IBlockState log)
	    {
	        for (IProperty property : log.getProperties())
	        {
	            Collection allowedValues = property.getAllowedValues();
	            if (allowedValues.contains(EnumFacing.Axis.X) && allowedValues.contains(EnumFacing.Axis.Y) && allowedValues.contains(EnumFacing.Axis.Z))
	            {
	                return property;
	            }
	        }
	        return null;
	    }

	    public static BlockPos getTopSolidOrLiquidBlock(IWorld world, int x, int z)
	    {
	        IChunk chunk = world.getChunk(x >> 4, z >> 4);
	        return new BlockPos(x, chunk.getTopBlockY(Heightmap.Type.MOTION_BLOCKING, x & 15, z & 15), z);
	    }
}
