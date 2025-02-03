package net.mcreator.brokenworldextra.item.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.brokenworldextra.item.NailShotgunItem;

public class NailShotgunItemModel extends GeoModel<NailShotgunItem> {
	@Override
	public ResourceLocation getAnimationResource(NailShotgunItem animatable) {
		return new ResourceLocation("broken_world_extra", "animations/blaser3.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NailShotgunItem animatable) {
		return new ResourceLocation("broken_world_extra", "geo/blaser3.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NailShotgunItem animatable) {
		return new ResourceLocation("broken_world_extra", "textures/item/blaster_4.png");
	}
}
