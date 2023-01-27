
package net.mcreator.techodysseybeyondthelimits.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

public class ReallycompressedcobblestoneBlock extends Block {
	public ReallycompressedcobblestoneBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(-1, 3600000).lightLevel(s -> 1)
				.requiresCorrectToolForDrops().speedFactor(0.8f).jumpFactor(1.1f).hasPostProcess((bs, br, bp) -> true)
				.emissiveRendering((bs, br, bp) -> true).noLootTable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 7;
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		if (player.getInventory().getSelected().getItem() instanceof TieredItem tieredItem)
			return tieredItem.getTier().getLevel() >= 9;
		return false;
	}
}
