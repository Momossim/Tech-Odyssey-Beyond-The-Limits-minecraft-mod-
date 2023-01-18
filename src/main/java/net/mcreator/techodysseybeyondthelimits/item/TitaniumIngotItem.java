
package net.mcreator.techodysseybeyondthelimits.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.techodysseybeyondthelimits.TechOdysseyBeyondTheLimitsModElements;

@TechOdysseyBeyondTheLimitsModElements.ModElement.Tag
public class TitaniumIngotItem extends TechOdysseyBeyondTheLimitsModElements.ModElement {
	@ObjectHolder("tech_odyssey_beyond_the_limits:titanium_ingot")
	public static final Item block = null;

	public TitaniumIngotItem(TechOdysseyBeyondTheLimitsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("titanium_ingot");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
