package net.mcreator.brokenworldextra.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.brokenworldextra.world.inventory.OpenwaclomeMenu;
import net.mcreator.brokenworldextra.procedures.PlayerProcedure;
import net.mcreator.brokenworldextra.network.OpenwaclomeButtonMessage;
import net.mcreator.brokenworldextra.BrokenWorldExtraMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class OpenwaclomeScreen extends AbstractContainerScreen<OpenwaclomeMenu> {
	private final static HashMap<String, Object> guistate = OpenwaclomeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_continue;

	public OpenwaclomeScreen(OpenwaclomeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 399;
		this.imageHeight = 226;
	}

	private static final ResourceLocation texture = new ResourceLocation("broken_world_extra:textures/screens/openwaclome.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		if (PlayerProcedure.execute(world, x, y, z, entity) instanceof LivingEntity livingEntity) {
			InventoryScreen.renderEntityInInventoryFollowsAngle(guiGraphics, this.leftPos + 199, this.topPos + 158, 15, 0f + (float) Math.atan((this.leftPos + 199 - mouseX) / 40.0), (float) Math.atan((this.topPos + 109 - mouseY) / 40.0),
					livingEntity);
		}
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.broken_world_extra.openwaclome.label_walcome_to_the_world"), 134, 113, -16777216, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.broken_world_extra.openwaclome.label_rules_1_dont_lie"), 84, 36, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.broken_world_extra.openwaclome.label_rules_2_dont_cheat_unless_you"), 85, 54, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.broken_world_extra.openwaclome.label_rules_3_dont_use_foul_language"), 84, 72, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.broken_world_extra.openwaclome.label_rule_6_no_useing_end_items_till"), 83, 88, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.broken_world_extra.openwaclome.label_rule_5_to_no_tipped_arrows_and_s"), 14, 98, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_continue = Button.builder(Component.translatable("gui.broken_world_extra.openwaclome.button_continue"), e -> {
			if (true) {
				BrokenWorldExtraMod.PACKET_HANDLER.sendToServer(new OpenwaclomeButtonMessage(0, x, y, z));
				OpenwaclomeButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 166, this.topPos + 165, 67, 20).build();
		guistate.put("button:button_continue", button_continue);
		this.addRenderableWidget(button_continue);
	}
}
