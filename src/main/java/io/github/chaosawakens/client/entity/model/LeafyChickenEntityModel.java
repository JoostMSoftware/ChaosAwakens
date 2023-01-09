package io.github.chaosawakens.client.entity.model;

import io.github.chaosawakens.ChaosAwakens;
import io.github.chaosawakens.common.entity.LeafyChickenEntity;
import net.minecraft.util.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedTickingGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class LeafyChickenEntityModel extends AnimatedTickingGeoModel<LeafyChickenEntity> {

	@Override
	public ResourceLocation getAnimationFileLocation(LeafyChickenEntity animatable) {
		return new ResourceLocation(ChaosAwakens.MODID, "animations/leafy_chicken.animation.json");
	}

	@Override
	public ResourceLocation getModelLocation(LeafyChickenEntity object) {
		return new ResourceLocation(ChaosAwakens.MODID, "geo/leafy_chicken.geo.json");
	}

	@Override
	public ResourceLocation getTextureLocation(LeafyChickenEntity object) {
		return new ResourceLocation(ChaosAwakens.MODID, "textures/entity/leafy_chicken.png");
	}

	@SuppressWarnings("unchecked")
	@Override
	public void setLivingAnimations(LeafyChickenEntity entity, Integer uniqueID, @SuppressWarnings("rawtypes") AnimationEvent customPredicate) {
		super.setLivingAnimations(entity, uniqueID, customPredicate);
		
		EntityModelData data = (EntityModelData) customPredicate.getExtraData().get(0);
		IBone root = this.getAnimationProcessor().getBone("body");
		IBone head = this.getAnimationProcessor().getBone("head");
		if (data.isChild) {
			root.setScaleX(0.5f);
			root.setScaleY(0.5f);
			root.setScaleZ(0.5f);
			root.setPivotY(-0.5f);
		} else {
			root.setScaleX(1.0f);
			root.setScaleY(1.0f);
			root.setScaleZ(1.0f);
		}
		if (data.isChild) {
			head.setScaleX(1f);
			head.setScaleY(1f);
			head.setScaleZ(1f);
			head.setPivotY(7.75f);
		} else {
			head.setScaleX(1.0f);
			head.setScaleY(1.0f);
			head.setScaleZ(1.0f);
		}
		EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
		head.setRotationX((extraData.headPitch) * ((float) Math.PI / 180F));
		head.setRotationY((extraData.netHeadYaw) * ((float) Math.PI / 270F));
	}
	
}