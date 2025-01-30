package net.mcreator.brokenworldextra.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.brokenworldextra.item.LimboProtonacceleratorItem;

public class LimboProtonacceleratorItemModel extends GeoModel<LimboProtonacceleratorItem> {
	@Override
	public ResourceLocation getAnimationResource(LimboProtonacceleratorItem animatable) {
		return new ResourceLocation("broken_world_extra", "animations/blaster_1_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(LimboProtonacceleratorItem animatable) {
		return new ResourceLocation("broken_world_extra", "geo/blaster_1_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(LimboProtonacceleratorItem animatable) {
		return new ResourceLocation("broken_world_extra", "textures/item/blaster.png");
	}
}
