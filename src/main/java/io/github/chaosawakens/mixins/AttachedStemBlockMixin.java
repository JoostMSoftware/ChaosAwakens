package io.github.chaosawakens.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import io.github.chaosawakens.common.registry.CATags;
import net.minecraft.block.AttachedStemBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

@Mixin(AttachedStemBlock.class)
public abstract class AttachedStemBlockMixin {
	
	@Inject(method = "Lnet/minecraft/block/AttachedStemBlock;mayPlaceOn(Lnet/minecraft/block/BlockState;Lnet/minecraft/world/IBlockReader;Lnet/minecraft/util/math/BlockPos;)Z", at = @At("HEAD"), cancellable = true)
	public void chaosawakens$mayPlaceOn(BlockState state, IBlockReader level, BlockPos pos, CallbackInfoReturnable<Boolean> cir) {
		if(state.is(CATags.Blocks.FARMABLE))cir.setReturnValue(true);
	}
}
