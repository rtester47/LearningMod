package unclebrick.init;

import static unclebrick.api.block.UBMBlocks.*;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.ForgeRegistries;
import unclebrick.common.block.BlockFenceGateUBM;
import unclebrick.common.block.BlockFenceUBM;
import unclebrick.common.block.BlockSlabUBM;
import unclebrick.common.block.BlockStairsUBM;
import unclebrick.common.block.BlockWallUBM;
import unclebrick.common.util.inventory.ItemGroupUBM;

public class ModBlocks {
	
	public static void init ()
	{
		titanium_block = registerBlock(new Block(Block.Properties.from(Blocks.OBSIDIAN).sound(SoundType.METAL)), "titanium_block");
		titanium_end_ore = registerBlock(new Block(Block.Properties.from(titanium_block).sound(SoundType.STONE)), "titanium_end_ore");
		titanium_fence = registerBlock(new BlockFenceUBM(Block.Properties.from(titanium_block)), "titanium_fence");
		titanium_fence_gate = registerBlock(new BlockFenceGateUBM(Block.Properties.from(titanium_block)), "titanium_fence_gate");
		titanium_nether_ore = registerBlock(new Block(Block.Properties.from(titanium_block).sound(SoundType.STONE)), "titanium_nether_ore");
		titanium_ore = registerBlock(new Block(Block.Properties.from(titanium_block).sound(SoundType.STONE)), "titanium_ore");
		titanium_slab = registerBlock(new BlockSlabUBM(Block.Properties.from(titanium_block)), "titanium_slab");
		titanium_stairs = registerBlock(new BlockStairsUBM(titanium_block.getDefaultState(), Block.Properties.from(titanium_block)), "titanium_stairs");
		titanium_wall = registerBlock(new BlockWallUBM(Block.Properties.from(titanium_block)), "titanium_wall");
	}
	
    public static Block registerBlock(Block block, String name)
    {
        ItemBlock itemBlock = new ItemBlock(block, new Item.Properties().group(ItemGroupUBM.instance));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }
    
    public static Block registerBlock(Block block, ItemBlock itemBlock, String name)
    {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        
        if (itemBlock != null)
        {
            itemBlock.setRegistryName(name);
        	ForgeRegistries.ITEMS.register(itemBlock);
        }
        
        return block;
    }

}
