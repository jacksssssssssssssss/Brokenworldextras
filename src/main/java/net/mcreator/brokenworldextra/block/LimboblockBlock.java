
package net.mcreator.brokenworldextra.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.brokenworldextra.procedures.LimboblockEntityWalksOnTheBlockProcedure;

public class LimboblockBlock extends Block {
	public LimboblockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.GRAVEL).strength(1.3f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		LimboblockEntityWalksOnTheBlockProcedure.execute(entity);
	}
}
