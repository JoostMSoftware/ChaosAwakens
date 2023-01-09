package io.github.chaosawakens.common.blocks;

import java.util.Random;
import java.util.function.Supplier;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class FruitLeavesBlock extends LeavesBlock {
	protected static final BooleanProperty RIPE = BooleanProperty.create("ripe");
	private final Supplier<Item> fruit;
	private final int minFruit;
	private final int maxFruit;
	private final int chance;

	public FruitLeavesBlock(Properties properties, Supplier<Item> fruit, int minFruit, int maxFruit, int chance) {
		super(properties);
		this.fruit = fruit;
		this.minFruit = minFruit;
		this.maxFruit = maxFruit;
		this.chance = chance;
		this.registerDefaultState(this.stateDefinition.any().setValue(DISTANCE, 7).setValue(PERSISTENT, false).setValue(RIPE, false));
	}

	@Override
	public boolean isRandomlyTicking(BlockState state) {
		return super.isRandomlyTicking(state) || !state.getValue(RIPE);
	}

	@Override
	protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(RIPE);
	}
	
	@Override
	public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult result) {
		Item handItem = player.getItemInHand(hand).getItem();
		if (state.getValue(RIPE) && handItem.equals(Items.SHEARS)) {
			worldIn.setBlockAndUpdate(pos, state.setValue(RIPE, false));
			Block.popResource(worldIn, pos, new ItemStack(fruit.get(), this.RANDOM.nextInt(maxFruit - minFruit == 0 ? 1 : maxFruit - minFruit) + minFruit));
			return ActionResultType.SUCCESS;
		}
		return ActionResultType.PASS;
	}

	@Override
	public void randomTick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
		if(!state.getValue(PERSISTENT) && !state.getValue(RIPE) && rand.nextInt(chance) == 0) worldIn.setBlockAndUpdate(pos, state.setValue(RIPE, true));
		super.randomTick(state, worldIn, pos, rand);
	}
}
