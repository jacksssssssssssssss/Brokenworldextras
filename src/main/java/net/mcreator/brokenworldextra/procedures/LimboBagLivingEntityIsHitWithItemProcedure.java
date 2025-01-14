package net.mcreator.brokenworldextra.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class LimboBagLivingEntityIsHitWithItemProcedure {
	@SubscribeEvent
	public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		boolean found = false;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		if (entity instanceof Zombie) {
			{
				Entity _entityTeam = entity;
				PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("LIMBO");
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
