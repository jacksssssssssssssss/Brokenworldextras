
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokenworldextra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.brokenworldextra.block.LimboblockBlock;
import net.mcreator.brokenworldextra.block.LimboEcsapeDoorBlock;
import net.mcreator.brokenworldextra.block.DropChestBlock;
import net.mcreator.brokenworldextra.block.CreeperBlock;
import net.mcreator.brokenworldextra.BrokenWorldExtraMod;

public class BrokenWorldExtraModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BrokenWorldExtraMod.MODID);
	public static final RegistryObject<Block> LIMBO_ECSAPE_DOOR = REGISTRY.register("limbo_ecsape_door", () -> new LimboEcsapeDoorBlock());
	public static final RegistryObject<Block> LIMBOBLOCK = REGISTRY.register("limboblock", () -> new LimboblockBlock());
	public static final RegistryObject<Block> CREEPER = REGISTRY.register("creeper", () -> new CreeperBlock());
	public static final RegistryObject<Block> DROP_CHEST = REGISTRY.register("drop_chest", () -> new DropChestBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
