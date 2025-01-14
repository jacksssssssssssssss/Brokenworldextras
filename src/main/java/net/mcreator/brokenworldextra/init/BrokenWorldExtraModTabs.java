
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokenworldextra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.brokenworldextra.BrokenWorldExtraMod;

public class BrokenWorldExtraModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BrokenWorldExtraMod.MODID);
	public static final RegistryObject<CreativeModeTab> BROKEN_WOLD_EXTRAS = REGISTRY.register("broken_wold_extras",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.broken_world_extra.broken_wold_extras")).icon(() -> new ItemStack(BrokenWorldExtraModItems.LIMBO_BAG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BrokenWorldExtraModItems.THE_NIGHTMARE.get());
				tabData.accept(BrokenWorldExtraModItems.LIMBO_BAG.get());
			}).withSearchBar().build());
}
