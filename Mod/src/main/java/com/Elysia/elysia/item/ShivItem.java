package com.Elysia.elysia.item;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class ShivItem extends SwordItem {

	public ShivItem(Tier tier, int maxDamage, float attackDamage, Properties properties) {
		super(tier, maxDamage, attackDamage, properties);
	}
	
	@Override
	public boolean canAttackBlock(BlockState p_43291_, Level p_43292_, BlockPos p_43293_, Player p_43294_) {
		// TODO Auto-generated method stub
		return super.canAttackBlock(p_43291_, p_43292_, p_43293_, p_43294_);
	}
	
	

}
