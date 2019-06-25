package com.github.rtester47.unclebrick.init;

import static com.github.rtester47.unclebrick.api.item.UBMItems.*;

import com.github.rtester47.unclebrick.common.item.AxeItemUBM;
import com.github.rtester47.unclebrick.common.item.PickaxeItemUBM;
import com.github.rtester47.unclebrick.common.util.inventory.ItemGroupUBM;
import com.github.rtester47.unclebrick.common.util.material.TitaniumArmorMaterialList;
import com.github.rtester47.unclebrick.common.util.material.TitaniumItemMaterialList;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems
{
	public static void init()
	{
		titanium_ingot = registerItem(new Item(new Item.Properties().group(ItemGroupUBM.instance)), "titanium_ingot");
		titanium_nugget = registerItem(new Item(new Item.Properties().group(ItemGroupUBM.instance)), "titanium_nugget");
		titanium_axe = registerItem(new AxeItemUBM(TitaniumItemMaterialList.titanium, 5f, -3.0f, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_axe"); 
		titanium_pickaxe = registerItem(new PickaxeItemUBM(TitaniumItemMaterialList.titanium, 1, -2.8f, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_pickaxe");
		titanium_shovel = registerItem(new ShovelItem(TitaniumItemMaterialList.titanium, 1.5f, -3.0f, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_shovel");
		titanium_sword = registerItem(new SwordItem(TitaniumItemMaterialList.titanium, 3, -2.4f, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_sword");
		titanium_hoe = registerItem(new HoeItem(TitaniumItemMaterialList.titanium, 0f,  new Item.Properties().group(ItemGroupUBM.instance)), "titanium_hoe");
		titanium_boots = registerItem(new ArmorItem(TitaniumArmorMaterialList.titanium, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_boots");
		titanium_helmet = registerItem(new ArmorItem(TitaniumArmorMaterialList.titanium, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_helmet");
		titanium_chestplate = registerItem(new ArmorItem(TitaniumArmorMaterialList.titanium, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_chestplate");
		titanium_leggings = registerItem(new ArmorItem(TitaniumArmorMaterialList.titanium, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_leggings");
		
		ubm_icon = registerItem(new Item(new Item.Properties()), "ubm_icon");
	}

    public static Item registerItem(Item item, String name)
    {
    	item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}
