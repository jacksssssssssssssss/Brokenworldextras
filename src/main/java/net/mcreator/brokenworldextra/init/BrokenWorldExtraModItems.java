
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokenworldextra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.brokenworldextra.item.TheNightmareItem;
import net.mcreator.brokenworldextra.item.LimboBagItem;
import net.mcreator.brokenworldextra.BrokenWorldExtraMod;

public class BrokenWorldExtraModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BrokenWorldExtraMod.MODID);
	public static final RegistryObject<Item> THE_NIGHTMARE = REGISTRY.register("the_nightmare", () -> new TheNightmareItem());
	public static final RegistryObject<Item> LIMBO_BAG = REGISTRY.register("limbo_bag", () -> new LimboBagItem());
	// Start of user code block custom items
	// End of user code block custom items
}
