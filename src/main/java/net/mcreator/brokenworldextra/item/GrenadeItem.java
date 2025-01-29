
package net.mcreator.brokenworldextra.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GrenadeItem extends Item {
	public GrenadeItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.UNCOMMON));
	}
}
