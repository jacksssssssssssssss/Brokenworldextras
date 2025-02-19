package net.mcreator.brokenworldextra.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.brokenworldextra.init.BrokenWorldExtraModItems;
import net.mcreator.brokenworldextra.init.BrokenWorldExtraModBlocks;

public class RemoteRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _level)
			FallingBlockEntity.fall(_level, BlockPos.containing(x, 140, z), BrokenWorldExtraModBlocks.DROP_CHEST.get().defaultBlockState());
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(BrokenWorldExtraModItems.REMOTE.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
