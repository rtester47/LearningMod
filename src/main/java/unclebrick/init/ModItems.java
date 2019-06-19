package unclebrick.init;

import static unclebrick.api.item.UBMItems.*;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.registries.ForgeRegistries;
import unclebrick.common.item.ItemAxeUBM;
import unclebrick.common.item.ItemPickAxeUBM;
import unclebrick.common.util.inventory.ItemGroupUBM;
import unclebrick.common.util.material.TitaniumArmorMaterialList;
import unclebrick.common.util.material.TitaniumItemMaterialList;

public class ModItems
{
	public static void init()
	{
		titanium_ingot = registerItem(new Item(new Item.Properties().group(ItemGroupUBM.instance)), "titanium_ingot");
		titanium_nugget = registerItem(new Item(new Item.Properties().group(ItemGroupUBM.instance)), "titanium_nugget");
		titanium_axe = registerItem(new ItemAxeUBM(TitaniumItemMaterialList.titanium, 5f, -3.0f, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_axe"); 
		titanium_pickaxe = registerItem(new ItemPickAxeUBM(TitaniumItemMaterialList.titanium, 1, -2.8f, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_pickaxe");
		titanium_shovel = registerItem(new ItemSpade(TitaniumItemMaterialList.titanium, 1.5f, -3.0f, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_shovel");
		titanium_sword = registerItem(new ItemSword(TitaniumItemMaterialList.titanium, 3, -2.4f, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_sword");
		titanium_hoe = registerItem(new ItemHoe(TitaniumItemMaterialList.titanium, 0f,  new Item.Properties().group(ItemGroupUBM.instance)), "titanium_hoe");
		titanium_boots = registerItem(new ItemArmor(TitaniumArmorMaterialList.titanium, EntityEquipmentSlot.FEET, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_boots");
		titanium_helmet = registerItem(new ItemArmor(TitaniumArmorMaterialList.titanium, EntityEquipmentSlot.HEAD, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_helmet");
		titanium_chestplate = registerItem(new ItemArmor(TitaniumArmorMaterialList.titanium, EntityEquipmentSlot.CHEST, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_chestplate");
		titanium_leggings = registerItem(new ItemArmor(TitaniumArmorMaterialList.titanium, EntityEquipmentSlot.LEGS, new Item.Properties().group(ItemGroupUBM.instance)), "titanium_leggings");
		
		ubm_icon = registerItem(new Item(new Item.Properties()), "ubm_icon");
	}

    public static Item registerItem(Item item, String name)
    {
    	item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}
