package io.github.chaosawakens.common.entity.projectile;

import io.github.chaosawakens.common.registry.CAEntityTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class UltimateArrowEntity extends AbstractArrowEntity {
	private int duration = 200;

	public UltimateArrowEntity(EntityType<? extends UltimateArrowEntity> type, World worldIn) {
		super(type, worldIn);
	}

	public UltimateArrowEntity(World worldIn, double x, double y, double z) {
		super(CAEntityTypes.ULTIMATE_ARROW.get(), x, y, z, worldIn);
	}

	public UltimateArrowEntity(World worldIn, LivingEntity shooter) {
		super(CAEntityTypes.ULTIMATE_ARROW.get(), shooter, worldIn);
	}

	@Override
	protected void onHitEntity(EntityRayTraceResult result) {
		Entity entity = result.getEntity();
		if (entity instanceof PlayerEntity || (entity instanceof TameableEntity && ((TameableEntity) entity).isTame() && ((TameableEntity) entity).getOwner() == this.getOwner())) {
			((LivingEntity) entity).heal(5.0F);
			remove();
			return;
		}
		super.onHitEntity(result);
	}

	@Override
	protected ItemStack getPickupItem() {
		return new ItemStack(Items.AIR);
	}

	@Override
	public void readAdditionalSaveData(CompoundNBT compound) {
		super.readAdditionalSaveData(compound);
		if (compound.contains("Duration")) this.duration = compound.getInt("Duration");
	}

	@Override
	public void tick() {
		super.tick();
		if (!this.level.isClientSide && this.inGround && this.inGroundTime != 0 && this.inGroundTime >= 600) this.level.broadcastEntityEvent(this, (byte) 0);
	}

	@Override
	public void addAdditionalSaveData(CompoundNBT compound) {
		super.addAdditionalSaveData(compound);
		compound.putInt("Duration", this.duration);
	}

	@Override
	public IPacket<?> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	public double getBaseDamage() {
		return 15.0D;
	}
}
