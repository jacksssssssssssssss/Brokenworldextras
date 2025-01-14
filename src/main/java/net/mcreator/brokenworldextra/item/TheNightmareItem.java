
package net.mcreator.brokenworldextra.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class TheNightmareItem extends RecordItem {
	public TheNightmareItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("broken_world_extra:oh_no")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1560);
	}
}
