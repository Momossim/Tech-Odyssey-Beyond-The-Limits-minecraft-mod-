
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.techodysseybeyondthelimits.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.techodysseybeyondthelimits.TechOdysseyBeyondTheLimitsMod;

public class TechOdysseyBeyondTheLimitsModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS,
			TechOdysseyBeyondTheLimitsMod.MODID);
	public static final RegistryObject<PaintingVariant> RODRIFUK = REGISTRY.register("rodrifuk", () -> new PaintingVariant(16, 16));
	public static final RegistryObject<PaintingVariant> SCREEN = REGISTRY.register("screen", () -> new PaintingVariant(48, 48));
}
