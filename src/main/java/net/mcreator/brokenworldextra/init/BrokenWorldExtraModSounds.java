
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokenworldextra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.brokenworldextra.BrokenWorldExtraMod;

public class BrokenWorldExtraModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BrokenWorldExtraMod.MODID);
	public static final RegistryObject<SoundEvent> OH_NO = REGISTRY.register("oh_no", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("broken_world_extra", "oh_no")));
	public static final RegistryObject<SoundEvent> LIMBO = REGISTRY.register("limbo", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("broken_world_extra", "limbo")));
}
