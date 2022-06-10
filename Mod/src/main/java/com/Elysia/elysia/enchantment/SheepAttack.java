package com.Elysia.elysia.enchantment;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class SheepAttack extends Enchantment {

	protected SheepAttack(Rarity rarity, EnchantmentCategory category, EquipmentSlot... mainhand) {
		super(rarity, category, mainhand);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void doPostAttack(LivingEntity attacker, Entity target, int level) {
		// TODO Auto-generated method stub
		
		if (!attacker.level.isClientSide()) {
			ServerLevel world = ((ServerLevel) attacker.level);
			ServerPlayer player = ((ServerPlayer) attacker);
			BlockPos pos = target.blockPosition();
			
			if (level == 1) {
				EntityType.SHEEP.spawn(world, null, player, pos, null, true, true);
			}
			
			if (level == 2) {
				EntityType.SHEEP.spawn(world, null, player, pos, null, true, true);
				EntityType.SHEEP.spawn(world, null, player, pos, null, true, true);
			}
		}
		super.doPostAttack(attacker, target, level);
	}
	
	@Override
	public int getMaxLevel() {
		// TODO Auto-generated method stub
		return 2;
	}
	

}
