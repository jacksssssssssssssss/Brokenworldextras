
package net.mcreator.brokenworldextra.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.brokenworldextra.entity.C4Entity;
import net.mcreator.brokenworldextra.client.model.ModelCustomModel;

public class C4Renderer extends MobRenderer<C4Entity, ModelCustomModel<C4Entity>> {
	public C4Renderer(EntityRendererProvider.Context context) {
		super(context, new ModelCustomModel(context.bakeLayer(ModelCustomModel.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public ResourceLocation getTextureLocation(C4Entity entity) {
		return new ResourceLocation("broken_world_extra:textures/entities/gra.png");
	}
}
