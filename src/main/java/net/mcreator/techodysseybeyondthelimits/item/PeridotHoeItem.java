
package net.mcreator.techodysseybeyondthelimits.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.techodysseybeyondthelimits.init.TechOdysseyBeyondTheLimitsModItems;

public class PeridotHoeItem extends HoeItem {
	public PeridotHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 286;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 0f;
			}

			public int getLevel() {
				return 9;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TechOdysseyBeyondTheLimitsModItems.PERIDOT.get()));
			}
		}, 0, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
