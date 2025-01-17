
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokenworldextra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.brokenworldextra.BrokenWorldExtraMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BrokenWorldExtraModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BrokenWorldExtraMod.MODID);
	public static final RegistryObject<CreativeModeTab> UNIVERSAL_DUCKTAPE = REGISTRY.register("universal_ducktape",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.broken_world_extra.universal_ducktape")).icon(() -> new ItemStack(BrokenWorldExtraModItems.DUCK_TAPE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BrokenWorldExtraModItems.DUCK_TAPE.get());
				tabData.accept(BrokenWorldExtraModItems.DUCKTAPEDSWORDS.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> BROKEN_WOLD_EXTRAS = REGISTRY.register("broken_wold_extras",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.broken_world_extra.broken_wold_extras")).icon(() -> new ItemStack(BrokenWorldExtraModItems.LIMBO_BAG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(BrokenWorldExtraModItems.THE_NIGHTMARE.get());
				tabData.accept(BrokenWorldExtraModItems.LIMBO_BAG.get());
				tabData.accept(BrokenWorldExtraModItems.VOODOO_DOLL.get());
				tabData.accept(BrokenWorldExtraModItems.BLOOD_ANGAL_SPAWN_EGG.get());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {

			tabData.accept(BrokenWorldExtraModItems.BLOOD_ANGAL_SPAWN_EGG.get());

		}
	}
}
