
package net.mcreator.techodysseybeyondthelimits.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.techodysseybeyondthelimits.TechOdysseyBeyondTheLimitsModElements;

@TechOdysseyBeyondTheLimitsModElements.ModElement.Tag
public class TitaniumPickaxeItem extends TechOdysseyBeyondTheLimitsModElements.ModElement {
	@ObjectHolder("tech_odyssey_beyond_the_limits:titanium_pickaxe")
	public static final Item block = null;

	public TitaniumPickaxeItem(TechOdysseyBeyondTheLimitsModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 361;
			}

			public float getEfficiency() {
				return 7f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 18;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TitaniumIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("titanium_pickaxe"));
	}
}
