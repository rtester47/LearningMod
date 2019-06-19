package unclebrick.common.util.material;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum TitaniumItemMaterialList implements IItemTier 
{
	titanium(3.0f, 12.0f, 1561, 3, 22, unclebrick.api.item.UBMItems.titanium_ingot) ;
	
	private float aDamage, efficiency;
	private int maxUses, hLevel, enchantability;
	private Item repairMaterial;
	
	private TitaniumItemMaterialList( float aDamage, float efficiency, int maxUses, int hLevel, int enchantability, Item repairMaterial)
	{
		this.aDamage = aDamage;
		this.efficiency = efficiency;
		this.maxUses = maxUses;
		this.hLevel = hLevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}
	
	@Override
	public int getMaxUses() {
		
		return this.maxUses;
	}

	@Override
	public float getEfficiency() {

		return this.efficiency;
	}

	@Override
	public float getAttackDamage() {
		
		return aDamage;
	}

	@Override
	public int getHarvestLevel() {

		return this.hLevel;
	}

	@Override
	public int getEnchantability() {

		return this.enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {

		return Ingredient.fromItems(this.repairMaterial);
	}

}
