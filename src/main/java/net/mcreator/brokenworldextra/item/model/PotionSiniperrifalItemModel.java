package net.mcreator.brokenworldextra.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.brokenworldextra.item.PotionSiniperrifalItem;

public class PotionSiniperrifalItemModel extends GeoModel<PotionSiniperrifalItem> {
	@Override
	public ResourceLocation getAnimationResource(PotionSiniperrifalItem animatable) {
		return new ResourceLocation("broken_world_extra", "animations/pot.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PotionSiniperrifalItem animatable) {
		return new ResourceLocation("broken_world_extra", "geo/pot.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PotionSiniperrifalItem animatable) {
		return new ResourceLocation("broken_world_extra", "textures/item/fafa.png");
	}
}
