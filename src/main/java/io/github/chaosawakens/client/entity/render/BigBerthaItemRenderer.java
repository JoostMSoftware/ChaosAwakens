package io.github.chaosawakens.client.entity.render;

import io.github.chaosawakens.client.entity.model.BigBerthaItemModel;
import io.github.chaosawakens.common.items.extended.BigBerthaItem;
import software.bernie.geckolib3.renderers.geo.GeoItemRenderer;

public class BigBerthaItemRenderer extends GeoItemRenderer<BigBerthaItem> {
	public BigBerthaItemRenderer() {
		super(new BigBerthaItemModel());
	}
}
