
package net.mcreator.techodysseybeyondthelimits.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.techodysseybeyondthelimits.init.TechOdysseyBeyondTheLimitsModItems;

public class RubyAxeItem extends AxeItem {
	public RubyAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 286;
			}

			public float getSpeed() {
				return 6f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(TechOdysseyBeyondTheLimitsModItems.RUBY.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
