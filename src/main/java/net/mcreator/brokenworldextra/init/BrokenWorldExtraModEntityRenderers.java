
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokenworldextra.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.brokenworldextra.client.renderer.BloodAngalRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BrokenWorldExtraModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BrokenWorldExtraModEntities.BLOOD_ANGAL.get(), BloodAngalRenderer::new);
	}
}
