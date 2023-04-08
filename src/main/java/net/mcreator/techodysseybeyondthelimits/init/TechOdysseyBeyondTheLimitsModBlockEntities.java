
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.techodysseybeyondthelimits.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.techodysseybeyondthelimits.block.entity.BaseCenterBlockEntity;
import net.mcreator.techodysseybeyondthelimits.TechOdysseyBeyondTheLimitsMod;

public class TechOdysseyBeyondTheLimitsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
			TechOdysseyBeyondTheLimitsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BASE_CENTER = register("base_center", TechOdysseyBeyondTheLimitsModBlocks.BASE_CENTER,
			BaseCenterBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
