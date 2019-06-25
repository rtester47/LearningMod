package com.github.rtester47.unclebrick.init;

import static com.github.rtester47.unclebrick.api.block.UBMBlocks.*;

import com.github.rtester47.unclebrick.common.block.BlockFenceGateUBM;
import com.github.rtester47.unclebrick.common.block.BlockFenceUBM;
import com.github.rtester47.unclebrick.common.block.BlockSlabUBM;
import com.github.rtester47.unclebrick.common.block.BlockStairsUBM;
import com.github.rtester47.unclebrick.common.block.BlockWallUBM;
import com.github.rtester47.unclebrick.common.util.inventory.ItemGroupUBM;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

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
        BlockItem blockItem = new BlockItem(block, new Item.Properties().group(ItemGroupUBM.instance));
        block.setRegistryName(name);
        blockItem.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(blockItem);
        return block;
    }
    
    public static Block registerBlock(Block block, BlockItem blockItem, String name)
    {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        
        if (blockItem != null)
        {
            blockItem.setRegistryName(name);
        	ForgeRegistries.ITEMS.register(blockItem);
        }
        
        return block;
    }

}
