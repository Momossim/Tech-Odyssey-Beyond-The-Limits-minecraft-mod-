
package net.mcreator.techodysseybeyondthelimits.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.techodysseybeyondthelimits.TechOdysseyBeyondTheLimitsModElements;

@TechOdysseyBeyondTheLimitsModElements.ModElement.Tag
public class PeridotSwordItem extends TechOdysseyBeyondTheLimitsModElements.ModElement {
	@ObjectHolder("tech_odyssey_beyond_the_limits:peridot_sword")
	public static final Item block = null;

	public PeridotSwordItem(TechOdysseyBeyondTheLimitsModElements instance) {
		super(instance, 72);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 286;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PeridotItem.block));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("peridot_sword"));
	}
}