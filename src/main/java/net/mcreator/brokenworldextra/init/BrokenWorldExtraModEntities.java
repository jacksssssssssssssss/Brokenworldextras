
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.brokenworldextra.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.brokenworldextra.entity.C4Entity;
import net.mcreator.brokenworldextra.entity.BulletEntity;
import net.mcreator.brokenworldextra.entity.BloodAngalEntity;
import net.mcreator.brokenworldextra.BrokenWorldExtraMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BrokenWorldExtraModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BrokenWorldExtraMod.MODID);
	public static final RegistryObject<EntityType<BloodAngalEntity>> BLOOD_ANGAL = register("blood_angal",
			EntityType.Builder.<BloodAngalEntity>of(BloodAngalEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BloodAngalEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<C4Entity>> C_4 = register("c_4",
			EntityType.Builder.<C4Entity>of(C4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(C4Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BulletEntity>> BULLET = register("bullet",
			EntityType.Builder.<BulletEntity>of(BulletEntity::new, MobCategory.MISC).setCustomClientFactory(BulletEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BloodAngalEntity.init();
			C4Entity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BLOOD_ANGAL.get(), BloodAngalEntity.createAttributes().build());
		event.put(C_4.get(), C4Entity.createAttributes().build());
	}
}
