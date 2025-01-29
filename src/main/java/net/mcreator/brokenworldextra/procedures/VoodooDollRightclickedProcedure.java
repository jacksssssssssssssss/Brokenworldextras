package net.mcreator.brokenworldextra.procedures;

import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;

public class VoodooDollRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		{
			Entity _entityTeam = entity;
			PlayerTeam _pt = _entityTeam.level().getScoreboard().getPlayerTeam("team1");
			if (_pt != null) {
				if (_entityTeam instanceof Player _player)
					_entityTeam.level().getScoreboard().addPlayerToTeam(_player.getGameProfile().getName(), _pt);
				else
					_entityTeam.level().getScoreboard().addPlayerToTeam(_entityTeam.getStringUUID(), _pt);
			}
		}
		{
			ItemStack _ist = itemstack;
			if (_ist.hurt(1, RandomSource.create(), null)) {
				_ist.shrink(1);
				_ist.setDamageValue(0);
			}
		}
		if (entity instanceof Player _player)
			_player.getCooldowns().addCooldown(itemstack.getItem(), 300);
	}
}
