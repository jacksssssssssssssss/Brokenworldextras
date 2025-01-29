
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokenworldextra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.brokenworldextra.item.VoodooDollItem;
import net.mcreator.brokenworldextra.item.TheNightmareItem;
import net.mcreator.brokenworldextra.item.TheMakerItem;
import net.mcreator.brokenworldextra.item.RemoteItem;
import net.mcreator.brokenworldextra.item.LimboBagItem;
import net.mcreator.brokenworldextra.item.GrenadeItem;
import net.mcreator.brokenworldextra.item.DucktapedswordsItem;
import net.mcreator.brokenworldextra.item.DuckTapeItem;
import net.mcreator.brokenworldextra.item.DeepslateOreItem;
import net.mcreator.brokenworldextra.BrokenWorldExtraMod;

public class BrokenWorldExtraModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BrokenWorldExtraMod.MODID);
	public static final RegistryObject<Item> THE_NIGHTMARE = REGISTRY.register("the_nightmare", () -> new TheNightmareItem());
	public static final RegistryObject<Item> LIMBO_BAG = REGISTRY.register("limbo_bag", () -> new LimboBagItem());
	public static final RegistryObject<Item> VOODOO_DOLL = REGISTRY.register("voodoo_doll", () -> new VoodooDollItem());
	public static final RegistryObject<Item> DUCK_TAPE = REGISTRY.register("duck_tape", () -> new DuckTapeItem());
	public static final RegistryObject<Item> DUCKTAPEDSWORDS = REGISTRY.register("ducktapedswords", () -> new DucktapedswordsItem());
	public static final RegistryObject<Item> BLOOD_ANGAL_SPAWN_EGG = REGISTRY.register("blood_angal_spawn_egg", () -> new ForgeSpawnEggItem(BrokenWorldExtraModEntities.BLOOD_ANGAL, -6724096, -6724096, new Item.Properties()));
	public static final RegistryObject<Item> LIMBO_ECSAPE_DOOR = block(BrokenWorldExtraModBlocks.LIMBO_ECSAPE_DOOR);
	public static final RegistryObject<Item> DEEPSLATE_ORE = REGISTRY.register("deepslate_ore", () -> new DeepslateOreItem());
	public static final RegistryObject<Item> THE_MAKER = REGISTRY.register("the_maker", () -> new TheMakerItem());
	public static final RegistryObject<Item> LIMBOBLOCK = block(BrokenWorldExtraModBlocks.LIMBOBLOCK);
	public static final RegistryObject<Item> CREEPER = block(BrokenWorldExtraModBlocks.CREEPER);
	public static final RegistryObject<Item> C_4_SPAWN_EGG = REGISTRY.register("c_4_spawn_egg", () -> new ForgeSpawnEggItem(BrokenWorldExtraModEntities.C_4, -3407872, -10066330, new Item.Properties()));
	public static final RegistryObject<Item> GRENADE = REGISTRY.register("grenade", () -> new GrenadeItem());
	public static final RegistryObject<Item> DROP_CHEST = block(BrokenWorldExtraModBlocks.DROP_CHEST);
	public static final RegistryObject<Item> REMOTE = REGISTRY.register("remote", () -> new RemoteItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
