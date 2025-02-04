package net.mcreator.brokenworldextra.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.brokenworldextra.item.PotionSiniperrifalItem;
import net.mcreator.brokenworldextra.init.BrokenWorldExtraModItems;
import net.mcreator.brokenworldextra.init.BrokenWorldExtraModEntities;
import net.mcreator.brokenworldextra.entity.PotEntity;
import net.mcreator.brokenworldextra.BrokenWorldExtraMod;

public class PotionSiniperrifalRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(BrokenWorldExtraModItems.POTBULLET.get())) : false) {
			if (itemstack.getItem() instanceof PotionSiniperrifalItem)
				itemstack.getOrCreateTag().putString("geckoAnim", "shoot_1");
			BrokenWorldExtraMod.queueServerWork(10, () -> {
				{
					Entity _shootFrom = entity;
					Level projectileLevel = _shootFrom.level();
					if (!projectileLevel.isClientSide()) {
						Projectile _entityToSpawn = new Object() {
							public Projectile getArrow(Level level, float damage, int knockback, byte piercing) {
								AbstractArrow entityToSpawn = new PotEntity(BrokenWorldExtraModEntities.POT.get(), level);
								entityToSpawn.setBaseDamage(damage);
								entityToSpawn.setKnockback(knockback);
								entityToSpawn.setSilent(true);
								entityToSpawn.setPierceLevel(piercing);
								return entityToSpawn;
							}
						}.getArrow(projectileLevel, 2, 1, (byte) 3);
						_entityToSpawn.setPos(_shootFrom.getX(), _shootFrom.getEyeY() - 0.1, _shootFrom.getZ());
						_entityToSpawn.shoot(_shootFrom.getLookAngle().x, _shootFrom.getLookAngle().y, _shootFrom.getLookAngle().z, 8, 1);
						projectileLevel.addFreshEntity(_entityToSpawn);
					}
				}
				if (itemstack.getItem() instanceof PotionSiniperrifalItem)
					itemstack.getOrCreateTag().putString("geckoAnim", "Idle");
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_pearl.throw")), SoundSource.NEUTRAL, 1, (float) 0.5);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_pearl.throw")), SoundSource.NEUTRAL, 1, (float) 0.5, false);
					}
				}
			});
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 500);
			{
				ItemStack _ist = itemstack;
				if (_ist.hurt(5, RandomSource.create(), null)) {
					_ist.shrink(1);
					_ist.setDamageValue(0);
				}
			}
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(BrokenWorldExtraModItems.POTBULLET.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Gun Is Out Of Ammo"), true);
		}
	}
}
