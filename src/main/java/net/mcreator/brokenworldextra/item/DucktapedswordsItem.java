
package net.mcreator.brokenworldextra.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.brokenworldextra.init.BrokenWorldExtraModItems;

public class DucktapedswordsItem extends SwordItem {
	public DucktapedswordsItem() {
		super(new Tier() {
			public int getUses() {
				return 50;
			}

			public float getSpeed() {
				return 1.5f;
			}

			public float getAttackDamageBonus() {
				return 3.5f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 7;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(BrokenWorldExtraModItems.DUCK_TAPE.get()));
			}
		}, 3, -2f, new Item.Properties());
	}
}
