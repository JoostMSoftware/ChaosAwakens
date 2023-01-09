package io.github.chaosawakens.common.blocks;

import io.github.chaosawakens.common.registry.CATags;
import net.minecraft.block.AbstractBodyPlantBlock;
import net.minecraft.block.AbstractTopPlantBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.fml.RegistryObject;

public class CropBodyPlantBlock extends AbstractBodyPlantBlock {
	private final RegistryObject<? extends AbstractTopPlantBlock> topBlock;
	
	public CropBodyPlantBlock(Properties properties, Direction direction, VoxelShape shape, boolean p_i241179_4_, RegistryObject<? extends AbstractTopPlantBlock> topBlock) {
		super(properties, direction, shape, p_i241179_4_);
		this.topBlock = topBlock;
	}
	
	@Override
	public BlockState updateShape(BlockState state, Direction direction, BlockState state2, IWorld worldIn, BlockPos pos, BlockPos pos2) {
		if (direction == this.growthDirection.getOpposite() && !state.canSurvive(worldIn, pos)) {
			worldIn.getBlockTicks().scheduleTick(pos, this, 1);
		}

		CropTopPlantBlock topBlock = (CropTopPlantBlock) this.getHeadBlock();
		if (direction == this.growthDirection) {
			Block block = state2.getBlock();
			if (block != this && block != topBlock) return topBlock.getUpdateShapeState(worldIn);
		}

		if (this.scheduleFluidTicks) worldIn.getLiquidTicks().scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(worldIn));

		return super.updateShape(state, direction, state2, worldIn, pos, pos2);
	}

	@Override
	public boolean canSurvive(BlockState state, IWorldReader reader, BlockPos pos) {
		BlockPos downPos = pos.relative(this.growthDirection.getOpposite());
		BlockState downState = reader.getBlockState(downPos);
		Block block = downState.getBlock();
		return block == this.getHeadBlock() || block == this.getBodyBlock()
				|| downState.is(Blocks.GRASS_BLOCK) || downState.is(Blocks.DIRT)
				|| downState.is(Blocks.COARSE_DIRT) || downState.is(Blocks.PODZOL)
				|| downState.is(CATags.Blocks.FARMABLE);
	}

	@Override
	protected AbstractTopPlantBlock getHeadBlock() {
		return this.topBlock.get();
	}
}
