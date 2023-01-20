
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.techodysseybeyondthelimits.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.techodysseybeyondthelimits.item.WipItem;
import net.mcreator.techodysseybeyondthelimits.item.TitaniumplateItem;
import net.mcreator.techodysseybeyondthelimits.item.TitaniumSwordItem;
import net.mcreator.techodysseybeyondthelimits.item.TitaniumShovelItem;
import net.mcreator.techodysseybeyondthelimits.item.TitaniumPickaxeItem;
import net.mcreator.techodysseybeyondthelimits.item.TitaniumIngotItem;
import net.mcreator.techodysseybeyondthelimits.item.TitaniumHoeItem;
import net.mcreator.techodysseybeyondthelimits.item.TitaniumAxeItem;
import net.mcreator.techodysseybeyondthelimits.item.TitaniumArmorItem;
import net.mcreator.techodysseybeyondthelimits.item.SapphireSwordItem;
import net.mcreator.techodysseybeyondthelimits.item.SapphireShovelItem;
import net.mcreator.techodysseybeyondthelimits.item.SapphirePickaxeItem;
import net.mcreator.techodysseybeyondthelimits.item.SapphireItem;
import net.mcreator.techodysseybeyondthelimits.item.SapphireHoeItem;
import net.mcreator.techodysseybeyondthelimits.item.SapphireAxeItem;
import net.mcreator.techodysseybeyondthelimits.item.SapphireArmorItem;
import net.mcreator.techodysseybeyondthelimits.item.RubySwordItem;
import net.mcreator.techodysseybeyondthelimits.item.RubyShovelItem;
import net.mcreator.techodysseybeyondthelimits.item.RubyPickaxeItem;
import net.mcreator.techodysseybeyondthelimits.item.RubyItem;
import net.mcreator.techodysseybeyondthelimits.item.RubyHoeItem;
import net.mcreator.techodysseybeyondthelimits.item.RubyAxeItem;
import net.mcreator.techodysseybeyondthelimits.item.RubyArmorItem;
import net.mcreator.techodysseybeyondthelimits.item.PeridotSwordItem;
import net.mcreator.techodysseybeyondthelimits.item.PeridotShovelItem;
import net.mcreator.techodysseybeyondthelimits.item.PeridotPickaxeItem;
import net.mcreator.techodysseybeyondthelimits.item.PeridotItem;
import net.mcreator.techodysseybeyondthelimits.item.PeridotHoeItem;
import net.mcreator.techodysseybeyondthelimits.item.PeridotAxeItem;
import net.mcreator.techodysseybeyondthelimits.item.PeridotArmorItem;
import net.mcreator.techodysseybeyondthelimits.item.IronplateItem;
import net.mcreator.techodysseybeyondthelimits.item.HammerhItem;
import net.mcreator.techodysseybeyondthelimits.TechOdysseyBeyondTheLimitsMod;

public class TechOdysseyBeyondTheLimitsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TechOdysseyBeyondTheLimitsMod.MODID);
	public static final RegistryObject<Item> TITANIUM_INGOT = REGISTRY.register("titanium_ingot", () -> new TitaniumIngotItem());
	public static final RegistryObject<Item> RUBY = REGISTRY.register("ruby", () -> new RubyItem());
	public static final RegistryObject<Item> PERIDOT = REGISTRY.register("peridot", () -> new PeridotItem());
	public static final RegistryObject<Item> SAPPHIRE = REGISTRY.register("sapphire", () -> new SapphireItem());
	public static final RegistryObject<Item> TITANIUM_ORE = block(TechOdysseyBeyondTheLimitsModBlocks.TITANIUM_ORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TITANIUM_BLOCK = block(TechOdysseyBeyondTheLimitsModBlocks.TITANIUM_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUBY_ORE = block(TechOdysseyBeyondTheLimitsModBlocks.RUBY_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUBY_BLOCK = block(TechOdysseyBeyondTheLimitsModBlocks.RUBY_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PERIDOT_ORE = block(TechOdysseyBeyondTheLimitsModBlocks.PERIDOT_ORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PERIDOT_BLOCK = block(TechOdysseyBeyondTheLimitsModBlocks.PERIDOT_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SAPPHIRE_ORE = block(TechOdysseyBeyondTheLimitsModBlocks.SAPPHIRE_ORE,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SAPPHIRE_BLOCK = block(TechOdysseyBeyondTheLimitsModBlocks.SAPPHIRE_BLOCK,
			CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TITANIUM_PICKAXE = REGISTRY.register("titanium_pickaxe", () -> new TitaniumPickaxeItem());
	public static final RegistryObject<Item> TITANIUM_AXE = REGISTRY.register("titanium_axe", () -> new TitaniumAxeItem());
	public static final RegistryObject<Item> TITANIUM_SHOVEL = REGISTRY.register("titanium_shovel", () -> new TitaniumShovelItem());
	public static final RegistryObject<Item> TITANIUM_HOE = REGISTRY.register("titanium_hoe", () -> new TitaniumHoeItem());
	public static final RegistryObject<Item> RUBY_PICKAXE = REGISTRY.register("ruby_pickaxe", () -> new RubyPickaxeItem());
	public static final RegistryObject<Item> RUBY_AXE = REGISTRY.register("ruby_axe", () -> new RubyAxeItem());
	public static final RegistryObject<Item> RUBY_SHOVEL = REGISTRY.register("ruby_shovel", () -> new RubyShovelItem());
	public static final RegistryObject<Item> RUBY_HOE = REGISTRY.register("ruby_hoe", () -> new RubyHoeItem());
	public static final RegistryObject<Item> PERIDOT_PICKAXE = REGISTRY.register("peridot_pickaxe", () -> new PeridotPickaxeItem());
	public static final RegistryObject<Item> PERIDOT_AXE = REGISTRY.register("peridot_axe", () -> new PeridotAxeItem());
	public static final RegistryObject<Item> PERIDOT_SHOVEL = REGISTRY.register("peridot_shovel", () -> new PeridotShovelItem());
	public static final RegistryObject<Item> PERIDOT_HOE = REGISTRY.register("peridot_hoe", () -> new PeridotHoeItem());
	public static final RegistryObject<Item> SAPPHIRE_PICKAXE = REGISTRY.register("sapphire_pickaxe", () -> new SapphirePickaxeItem());
	public static final RegistryObject<Item> SAPPHIRE_AXE = REGISTRY.register("sapphire_axe", () -> new SapphireAxeItem());
	public static final RegistryObject<Item> SAPPHIRE_SHOVEL = REGISTRY.register("sapphire_shovel", () -> new SapphireShovelItem());
	public static final RegistryObject<Item> SAPPHIRE_HOE = REGISTRY.register("sapphire_hoe", () -> new SapphireHoeItem());
	public static final RegistryObject<Item> TITANIUM_SWORD = REGISTRY.register("titanium_sword", () -> new TitaniumSwordItem());
	public static final RegistryObject<Item> TITANIUM_ARMOR_HELMET = REGISTRY.register("titanium_armor_helmet", () -> new TitaniumArmorItem.Helmet());
	public static final RegistryObject<Item> TITANIUM_ARMOR_CHESTPLATE = REGISTRY.register("titanium_armor_chestplate",
			() -> new TitaniumArmorItem.Chestplate());
	public static final RegistryObject<Item> TITANIUM_ARMOR_LEGGINGS = REGISTRY.register("titanium_armor_leggings",
			() -> new TitaniumArmorItem.Leggings());
	public static final RegistryObject<Item> TITANIUM_ARMOR_BOOTS = REGISTRY.register("titanium_armor_boots", () -> new TitaniumArmorItem.Boots());
	public static final RegistryObject<Item> RUBY_SWORD = REGISTRY.register("ruby_sword", () -> new RubySwordItem());
	public static final RegistryObject<Item> RUBY_ARMOR_HELMET = REGISTRY.register("ruby_armor_helmet", () -> new RubyArmorItem.Helmet());
	public static final RegistryObject<Item> RUBY_ARMOR_CHESTPLATE = REGISTRY.register("ruby_armor_chestplate", () -> new RubyArmorItem.Chestplate());
	public static final RegistryObject<Item> RUBY_ARMOR_LEGGINGS = REGISTRY.register("ruby_armor_leggings", () -> new RubyArmorItem.Leggings());
	public static final RegistryObject<Item> RUBY_ARMOR_BOOTS = REGISTRY.register("ruby_armor_boots", () -> new RubyArmorItem.Boots());
	public static final RegistryObject<Item> PERIDOT_SWORD = REGISTRY.register("peridot_sword", () -> new PeridotSwordItem());
	public static final RegistryObject<Item> PERIDOT_ARMOR_HELMET = REGISTRY.register("peridot_armor_helmet", () -> new PeridotArmorItem.Helmet());
	public static final RegistryObject<Item> PERIDOT_ARMOR_CHESTPLATE = REGISTRY.register("peridot_armor_chestplate",
			() -> new PeridotArmorItem.Chestplate());
	public static final RegistryObject<Item> PERIDOT_ARMOR_LEGGINGS = REGISTRY.register("peridot_armor_leggings",
			() -> new PeridotArmorItem.Leggings());
	public static final RegistryObject<Item> PERIDOT_ARMOR_BOOTS = REGISTRY.register("peridot_armor_boots", () -> new PeridotArmorItem.Boots());
	public static final RegistryObject<Item> SAPPHIRE_SWORD = REGISTRY.register("sapphire_sword", () -> new SapphireSwordItem());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_HELMET = REGISTRY.register("sapphire_armor_helmet", () -> new SapphireArmorItem.Helmet());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_CHESTPLATE = REGISTRY.register("sapphire_armor_chestplate",
			() -> new SapphireArmorItem.Chestplate());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_LEGGINGS = REGISTRY.register("sapphire_armor_leggings",
			() -> new SapphireArmorItem.Leggings());
	public static final RegistryObject<Item> SAPPHIRE_ARMOR_BOOTS = REGISTRY.register("sapphire_armor_boots", () -> new SapphireArmorItem.Boots());
	public static final RegistryObject<Item> WIP = REGISTRY.register("wip", () -> new WipItem());
	public static final RegistryObject<Item> TITANIUMPLATE = REGISTRY.register("titaniumplate", () -> new TitaniumplateItem());
	public static final RegistryObject<Item> IRONPLATE = REGISTRY.register("ironplate", () -> new IronplateItem());
	public static final RegistryObject<Item> HAMMERH = REGISTRY.register("hammerh", () -> new HammerhItem());
	public static final RegistryObject<Item> REALLYCOMPRESSEDCOBBLESTONE = block(TechOdysseyBeyondTheLimitsModBlocks.REALLYCOMPRESSEDCOBBLESTONE,
			TechOdysseyBeyondTheLimitsModTabs.TAB_TECHODYSSEY);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
