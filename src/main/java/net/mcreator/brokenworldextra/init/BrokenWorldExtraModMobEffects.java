
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokenworldextra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.brokenworldextra.potion.BleedingMobEffect;
import net.mcreator.brokenworldextra.BrokenWorldExtraMod;

public class BrokenWorldExtraModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, BrokenWorldExtraMod.MODID);
	public static final RegistryObject<MobEffect> BLEEDING = REGISTRY.register("bleeding", () -> new BleedingMobEffect());
}
