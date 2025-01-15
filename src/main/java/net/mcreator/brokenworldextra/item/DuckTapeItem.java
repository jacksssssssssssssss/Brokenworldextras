
package net.mcreator.brokenworldextra.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DuckTapeItem extends Item {
	public DuckTapeItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.UNCOMMON));
	}
}
