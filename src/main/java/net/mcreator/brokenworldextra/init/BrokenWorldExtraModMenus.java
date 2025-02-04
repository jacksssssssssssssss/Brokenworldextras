
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokenworldextra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.brokenworldextra.world.inventory.OpenwaclomeMenu;
import net.mcreator.brokenworldextra.BrokenWorldExtraMod;

public class BrokenWorldExtraModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, BrokenWorldExtraMod.MODID);
	public static final RegistryObject<MenuType<OpenwaclomeMenu>> OPENWACLOME = REGISTRY.register("openwaclome", () -> IForgeMenuType.create(OpenwaclomeMenu::new));
}
