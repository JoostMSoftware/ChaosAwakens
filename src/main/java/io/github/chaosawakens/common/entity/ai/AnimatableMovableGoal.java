package io.github.chaosawakens.common.entity.ai;

import io.github.chaosawakens.common.entity.base.AnimatableAnimalEntity;
import io.github.chaosawakens.common.entity.base.AnimatableMonsterEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.pathfinding.Path;

public abstract class AnimatableMovableGoal extends AnimatableGoal {
	protected Path path;
	

	@Override
	abstract public boolean canUse();

	protected boolean isExecutable(AnimatableMovableGoal goal, AnimatableMonsterEntity attacker, LivingEntity target) {
		if (target == null) return false;
		if (target.isAlive() && !target.isSpectator()) {
			if (target instanceof PlayerEntity && ((PlayerEntity) target).isCreative()) return false;
			double distance = goal.entity.distanceToSqr(target.getX(), target.getY(), target.getZ());
			goal.path = attacker.getNavigation().createPath(target, 0);
			return attacker.getSensing().canSee(target) && distance >= AnimatableGoal.getAttackReachSq(attacker, target) && goal.path != null;
		}
		return false;
	}
	
	protected boolean isExecutable(AnimatableMovableGoal goal, AnimatableAnimalEntity attacker, LivingEntity target) {
		if (target == null) return false;
		if (target.isAlive() && !target.isSpectator()) {
			if (target instanceof PlayerEntity && ((PlayerEntity) target).isCreative()) return false;
			double distance = goal.entity.distanceToSqr(target.getX(), target.getY(), target.getZ());
			goal.path = attacker.getNavigation().createPath(target, 0);
			return attacker.getSensing().canSee(target) && distance >= AnimatableGoal.getAttackReachSq(attacker, target) && goal.path != null;
		}
		return false;
	}
}
