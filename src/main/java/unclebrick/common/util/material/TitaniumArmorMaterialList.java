package unclebrick.common.util.material;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import unclebrick.core.UnclebricksMod;

public enum TitaniumArmorMaterialList implements IArmorMaterial
{
	//									     	   (f, l, c, h)	
	titanium("titanium", 1561, new int[] {3, 6, 8 ,3}, 22, unclebrick.api.item.UBMItems.titanium_ingot, "entity.ender_dragon_growl", 2.0f);
	
	private static int[] max_damage_array = new int[] {11, 16, 15, 13};
	private String name, equipSound;
	private int durability, enchantability;
	private Item repairMaterial;
	private int[] damageReductionAmount;
	private float toughness;
	
	private TitaniumArmorMaterialList(String name, int durability, int[] damageReductionAmount, int enchantability, Item repairMaterial, String equipSound, float toughness) 
	{
		this.name = name;
		this.durability = durability;
		this.damageReductionAmount = damageReductionAmount;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
		this.equipSound = equipSound;
		this.toughness = toughness;
	}
	
	@Override
	public int getDurability(EntityEquipmentSlot slot) 
	{
		return max_damage_array[slot.getIndex()] * this.durability;
	}

	@Override
	public int getDamageReductionAmount(EntityEquipmentSlot slot) 
	{
		return this.damageReductionAmount[slot.getIndex()];
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() 
	{
		return new SoundEvent(new ResourceLocation(equipSound));
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return Ingredient.fromItems(this.repairMaterial);
	}

	@Override
	public String getName() 
	{
		return UnclebricksMod.modid + ":" + this.name;
	}

	@Override
	public float getToughness() 
	{
		return this.toughness;
	}
	
}
