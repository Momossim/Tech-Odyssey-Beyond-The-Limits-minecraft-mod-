
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.techodysseybeyondthelimits.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TechOdysseyBeyondTheLimitsModTabs {
	public static CreativeModeTab TAB_TECHODYSSEY;

	public static void load() {
		TAB_TECHODYSSEY = new CreativeModeTab("tabtechodyssey") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(TechOdysseyBeyondTheLimitsModItems.WIP.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
