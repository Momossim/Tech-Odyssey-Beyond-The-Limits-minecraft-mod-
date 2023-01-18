
package net.mcreator.techodysseybeyondthelimits.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.techodysseybeyondthelimits.item.WipItem;
import net.mcreator.techodysseybeyondthelimits.TechOdysseyBeyondTheLimitsModElements;

@TechOdysseyBeyondTheLimitsModElements.ModElement.Tag
public class TechodysseyItemGroup extends TechOdysseyBeyondTheLimitsModElements.ModElement {
	public TechodysseyItemGroup(TechOdysseyBeyondTheLimitsModElements instance) {
		super(instance, 89);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtechodyssey") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(WipItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
