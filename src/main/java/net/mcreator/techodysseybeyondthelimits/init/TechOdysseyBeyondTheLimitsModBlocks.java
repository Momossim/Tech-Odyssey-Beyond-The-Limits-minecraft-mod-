
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.techodysseybeyondthelimits.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.techodysseybeyondthelimits.block.TitaniumOreBlock;
import net.mcreator.techodysseybeyondthelimits.block.TitaniumBlockBlock;
import net.mcreator.techodysseybeyondthelimits.block.SapphireOreBlock;
import net.mcreator.techodysseybeyondthelimits.block.SapphireBlockBlock;
import net.mcreator.techodysseybeyondthelimits.block.RubyOreBlock;
import net.mcreator.techodysseybeyondthelimits.block.RubyBlockBlock;
import net.mcreator.techodysseybeyondthelimits.block.ReallycompressedcobblestoneBlock;
import net.mcreator.techodysseybeyondthelimits.block.PeridotOreBlock;
import net.mcreator.techodysseybeyondthelimits.block.PeridotBlockBlock;
import net.mcreator.techodysseybeyondthelimits.block.HelloblockBlock;
import net.mcreator.techodysseybeyondthelimits.TechOdysseyBeyondTheLimitsMod;

public class TechOdysseyBeyondTheLimitsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TechOdysseyBeyondTheLimitsMod.MODID);
	public static final RegistryObject<Block> TITANIUM_ORE = REGISTRY.register("titanium_ore", () -> new TitaniumOreBlock());
	public static final RegistryObject<Block> TITANIUM_BLOCK = REGISTRY.register("titanium_block", () -> new TitaniumBlockBlock());
	public static final RegistryObject<Block> RUBY_ORE = REGISTRY.register("ruby_ore", () -> new RubyOreBlock());
	public static final RegistryObject<Block> RUBY_BLOCK = REGISTRY.register("ruby_block", () -> new RubyBlockBlock());
	public static final RegistryObject<Block> PERIDOT_ORE = REGISTRY.register("peridot_ore", () -> new PeridotOreBlock());
	public static final RegistryObject<Block> PERIDOT_BLOCK = REGISTRY.register("peridot_block", () -> new PeridotBlockBlock());
	public static final RegistryObject<Block> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", () -> new SapphireOreBlock());
	public static final RegistryObject<Block> SAPPHIRE_BLOCK = REGISTRY.register("sapphire_block", () -> new SapphireBlockBlock());
	public static final RegistryObject<Block> REALLYCOMPRESSEDCOBBLESTONE = REGISTRY.register("reallycompressedcobblestone",
			() -> new ReallycompressedcobblestoneBlock());
	public static final RegistryObject<Block> HELLOBLOCK = REGISTRY.register("helloblock", () -> new HelloblockBlock());
}
