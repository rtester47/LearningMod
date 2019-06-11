package unclebrick.common.util.inventory;


import unclebrick.api.item.UBMItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class ItemGroupUBM extends ItemGroup
{

	public static final ItemGroupUBM instance = new ItemGroupUBM(ItemGroup.GROUPS.length, "unclebricksmod");
	
	public ItemGroupUBM(int index, String label)
	{
		super(index, label);
	}

	@Override
	public ItemStack createIcon()
	{
		return new ItemStack(UBMItems.ubm_icon);
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void fill(NonNullList<ItemStack> items)
	{
		super.fill(items);
	}

}
