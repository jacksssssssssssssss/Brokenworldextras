
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokenworldextra.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.brokenworldextra.network.LimbokeyMessage;
import net.mcreator.brokenworldextra.BrokenWorldExtraMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BrokenWorldExtraModKeyMappings {
	public static final KeyMapping LIMBOKEY = new KeyMapping("key.broken_world_extra.limbokey", GLFW.GLFW_KEY_1, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				BrokenWorldExtraMod.PACKET_HANDLER.sendToServer(new LimbokeyMessage(0, 0));
				LimbokeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(LIMBOKEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				LIMBOKEY.consumeClick();
			}
		}
	}
}
