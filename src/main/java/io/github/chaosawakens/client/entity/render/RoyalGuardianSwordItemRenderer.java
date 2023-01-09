package io.github.chaosawakens.client.entity.render;

import io.github.chaosawakens.client.entity.model.RoyalGuardianSwordItemModel;
import io.github.chaosawakens.common.items.extended.RoyalGuardianSwordItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class RoyalGuardianSwordItemRenderer extends GeoItemRenderer<RoyalGuardianSwordItem> {
	public RoyalGuardianSwordItemRenderer() {
		super(new RoyalGuardianSwordItemModel());
	}
}
