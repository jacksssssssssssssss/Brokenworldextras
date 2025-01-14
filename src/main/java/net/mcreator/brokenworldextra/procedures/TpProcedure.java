package net.mcreator.brokenworldextra.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.brokenworldextra.init.BrokenWorldExtraModItems;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TpProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Zombie) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == BrokenWorldExtraModItems.LIMBO_BAG.get()) {
				{
					Entity _entityTeam = entity;
					PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("team");
					if (_pt != null) {
						if (_entityTeam instanceof Player _player)
							_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
						else
							_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
					}
				}
			}
		}
	}
}
