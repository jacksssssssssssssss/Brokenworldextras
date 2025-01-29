
package net.mcreator.brokenworldextra.block;

import org.checkerframework.checker.units.qual.s;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.brokenworldextra.procedures.CreeperEntityCollidesInTheBlockProcedure;

public class CreeperBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public CreeperBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.ANCIENT_DEBRIS).strength(1000f, 385f).lightLevel(s -> 8).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(4, 18, 4, 12, 26, 12), box(4, 6, 6, 12, 18, 10), box(4, 0, 2, 8, 6, 6), box(8, 0, 2, 12, 6, 6), box(4, 0, 10, 8, 6, 14), box(8, 0, 10, 12, 6, 14));
			case NORTH -> Shapes.or(box(4, 18, 4, 12, 26, 12), box(4, 6, 6, 12, 18, 10), box(8, 0, 10, 12, 6, 14), box(4, 0, 10, 8, 6, 14), box(8, 0, 2, 12, 6, 6), box(4, 0, 2, 8, 6, 6));
			case EAST -> Shapes.or(box(4, 18, 4, 12, 26, 12), box(6, 6, 4, 10, 18, 12), box(2, 0, 8, 6, 6, 12), box(2, 0, 4, 6, 6, 8), box(10, 0, 8, 14, 6, 12), box(10, 0, 4, 14, 6, 8));
			case WEST -> Shapes.or(box(4, 18, 4, 12, 26, 12), box(6, 6, 4, 10, 18, 12), box(10, 0, 4, 14, 6, 8), box(10, 0, 8, 14, 6, 12), box(2, 0, 4, 6, 6, 8), box(2, 0, 8, 6, 6, 12));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		if (context.getClickedFace().getAxis() == Direction.Axis.Y)
			return super.getStateForPlacement(context).setValue(FACING, Direction.NORTH);
		return super.getStateForPlacement(context).setValue(FACING, context.getClickedFace());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		CreeperEntityCollidesInTheBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}

	@Override
	public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
		super.stepOn(world, pos, blockstate, entity);
		CreeperEntityCollidesInTheBlockProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}
