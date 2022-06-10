package com.Elysia.elysia.enchantment;

import com.Elysia.elysia.elysia;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
	public static final DeferredRegister<Enchantment> ENCHANTMENTS = 
			DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, elysia.MOD_ID);
	
	public static RegistryObject<Enchantment> LIGHTNING_STRIKE =
			ENCHANTMENTS.register("lightning_strike", 
					() -> new LightningStrike(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));
	
	public static RegistryObject<Enchantment> SHEEP_ATTACK = 
			ENCHANTMENTS.register("sheep_attack", () -> new SheepAttack(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.WEAPON, 
					EquipmentSlot.MAINHAND));
	
	public static void register(IEventBus bus) {
		ENCHANTMENTS.register(bus);
	}

}
