
package net.mcreator.brokenworldextra.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DeepslateOreItem extends Item {
	public DeepslateOreItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.RARE));
	}
}
