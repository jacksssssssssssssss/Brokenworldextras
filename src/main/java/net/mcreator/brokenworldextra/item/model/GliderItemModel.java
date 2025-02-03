package net.mcreator.brokenworldextra.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.brokenworldextra.item.GliderItem;

public class GliderItemModel extends GeoModel<GliderItem> {
	@Override
	public ResourceLocation getAnimationResource(GliderItem animatable) {
		return new ResourceLocation("broken_world_extra", "animations/butcher__glider1_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GliderItem animatable) {
		return new ResourceLocation("broken_world_extra", "geo/butcher__glider1_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GliderItem animatable) {
		return new ResourceLocation("broken_world_extra", "textures/item/glideer.png");
	}
}
