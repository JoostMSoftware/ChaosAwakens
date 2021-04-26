package io.github.chaosawakens;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Enum dedicated to storing tool material data
 * @author invalid2
 *
 */
public enum ToolMaterials
{
	EMERALD("emerald", 4, 1600, 9.0F, 5.0F, 12),
	AMETHYST("amethyst", 4, 1800, 10.0F, 6.0F, 14),
	RUBY("ruby", 4, 2000, 11.0F, 7.0F, 16),
	TIGERS_EYE("tigers_eye", 3, 1561, 8.0F, 4.0F, 10),
	OPTIMISED("optimised", 4, 2200, 12.0F, 8.0F, 18);
	
	private String name;
	private int harvestLevel;
	private int maxUses;
	private float efficiency;
	private float damage;
	private int enchantability;
	private ToolMaterial material;
	
	/**
	 * 
	 * @param name Unlocalized and registry names
	 * @param harvestLevel Harvest level
	 * @param maxUses Durability
	 * @param efficiency efficiency
	 * @param damage Material base damage
	 * @param enchantability Material base enchantability
	 */
	private ToolMaterials(String name, int harvestLevel, int maxUses, float efficiency, float damage, int enchantability) {
		this.name = name;
		this.harvestLevel = harvestLevel;
		this.maxUses = maxUses;
		this.efficiency = efficiency;
		this.damage = damage;
		this.enchantability = enchantability;
		this.material = EnumHelper.addToolMaterial(name, harvestLevel, maxUses, efficiency, damage, enchantability);
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getHarvestLevel()
	{
		return harvestLevel;
	}
	
	public int getMaxUses()
	{
		return maxUses;
	}
	
	public float getEfficiency()
	{
		return efficiency;
	}
	
	public float getDamage()
	{
		return damage;
	}
	
	public int getEnchantability()
	{
		return enchantability;
	}
	
	public ToolMaterial getToolMaterial()
	{
		return material;
	}
}