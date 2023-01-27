
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.techodysseybeyondthelimits.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.techodysseybeyondthelimits.TechOdysseyBeyondTheLimitsMod;

public class TechOdysseyBeyondTheLimitsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, TechOdysseyBeyondTheLimitsMod.MODID);
	public static final RegistryObject<Potion> OFLEVITATION = REGISTRY.register("oflevitation",
			() -> new Potion(new MobEffectInstance(MobEffects.LEVITATION, 3600, 0, false, true)));
}
