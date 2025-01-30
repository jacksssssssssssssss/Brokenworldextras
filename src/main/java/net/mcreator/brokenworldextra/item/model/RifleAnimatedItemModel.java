package net.mcreator.brokenworldextra.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.brokenworldextra.item.RifleAnimatedItem;

public class RifleAnimatedItemModel extends GeoModel<RifleAnimatedItem> {
	@Override
	public ResourceLocation getAnimationResource(RifleAnimatedItem animatable) {
		return new ResourceLocation("broken_world_extra", "animations/blaster_2_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RifleAnimatedItem animatable) {
		return new ResourceLocation("broken_world_extra", "geo/blaster_2_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RifleAnimatedItem animatable) {
		return new ResourceLocation("broken_world_extra", "textures/item/blaster2.png");
	}
}
