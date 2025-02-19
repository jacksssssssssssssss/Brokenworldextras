
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokenworldextra.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.brokenworldextra.client.renderer.C4Renderer;
import net.mcreator.brokenworldextra.client.renderer.BulletRenderer;
import net.mcreator.brokenworldextra.client.renderer.BloodAngalRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BrokenWorldExtraModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BrokenWorldExtraModEntities.BLOOD_ANGAL.get(), BloodAngalRenderer::new);
		event.registerEntityRenderer(BrokenWorldExtraModEntities.C_4.get(), C4Renderer::new);
		event.registerEntityRenderer(BrokenWorldExtraModEntities.BULLET.get(), BulletRenderer::new);
		event.registerEntityRenderer(BrokenWorldExtraModEntities.POT.get(), ThrownItemRenderer::new);
	}
}
