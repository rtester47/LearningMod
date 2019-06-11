package unclebrick.init;

import static unclebrick.api.item.UBMItems.*;

import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import unclebrick.common.util.inventory.ItemGroupUBM;

public class ModItems
{
	public static void init()
	{
		titanium_ingot = registerItem(new Item(new Item.Properties().group(ItemGroupUBM.instance)), "titanium_ingot");
		titanium_nugget = registerItem(new Item(new Item.Properties().group(ItemGroupUBM.instance)), "titanium_nugget");

		ubm_icon = registerItem(new Item(new Item.Properties()), "ubm_icon");
	}

    public static Item registerItem(Item item, String name)
    {
    	item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}
