package net.mcreator.techodysseybeyondthelimits.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.techodysseybeyondthelimits.init.TechOdysseyBeyondTheLimitsModBlocks;

public class HelloprocedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y, z), TechOdysseyBeyondTheLimitsModBlocks.HELLOBLOCK.get().defaultBlockState(), 3);
	}
}
