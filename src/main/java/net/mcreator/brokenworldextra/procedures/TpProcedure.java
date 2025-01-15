package net.mcreator.brokenworldextra.procedures;

import net.minecraft.world.scores.PlayerTeam;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.brokenworldextra.init.BrokenWorldExtraModItems;

public class TpProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
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
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(BrokenWorldExtraModItems.VOODOO.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
