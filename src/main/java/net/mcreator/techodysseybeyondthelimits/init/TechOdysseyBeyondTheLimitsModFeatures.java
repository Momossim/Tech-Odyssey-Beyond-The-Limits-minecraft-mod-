
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.techodysseybeyondthelimits.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.techodysseybeyondthelimits.world.features.ores.TitaniumOreFeature;
import net.mcreator.techodysseybeyondthelimits.world.features.ores.SapphireOreFeature;
import net.mcreator.techodysseybeyondthelimits.world.features.ores.RubyOreFeature;
import net.mcreator.techodysseybeyondthelimits.world.features.ores.PeridotOreFeature;
import net.mcreator.techodysseybeyondthelimits.world.features.Ruin1Feature;
import net.mcreator.techodysseybeyondthelimits.TechOdysseyBeyondTheLimitsMod;

@Mod.EventBusSubscriber
public class TechOdysseyBeyondTheLimitsModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES,
			TechOdysseyBeyondTheLimitsMod.MODID);
	public static final RegistryObject<Feature<?>> TITANIUM_ORE = REGISTRY.register("titanium_ore", TitaniumOreFeature::feature);
	public static final RegistryObject<Feature<?>> RUBY_ORE = REGISTRY.register("ruby_ore", RubyOreFeature::feature);
	public static final RegistryObject<Feature<?>> PERIDOT_ORE = REGISTRY.register("peridot_ore", PeridotOreFeature::feature);
	public static final RegistryObject<Feature<?>> SAPPHIRE_ORE = REGISTRY.register("sapphire_ore", SapphireOreFeature::feature);
	public static final RegistryObject<Feature<?>> RUIN_1 = REGISTRY.register("ruin_1", Ruin1Feature::feature);
}
