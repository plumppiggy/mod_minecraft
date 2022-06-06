package com.Elysia.elysia.item;

import com.Elysia.elysia.elysia;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	
	 public static final DeferredRegister<Item> ITEMS =
	            DeferredRegister.create(ForgeRegistries.ITEMS, elysia.MOD_ID);
	 
	 public static final RegistryObject<Item> RAW_ELYSIUM = 
			 ITEMS.register("raw_elysium", 
					 () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
	 
	 public static final RegistryObject<Item> ELYSIUM_INGOT = 
			 ITEMS.register("elysium_ingot", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.TAB)));
	 
	 public static final RegistryObject<Item> SHIV = 
			 ITEMS.register("shiv", 
					 () -> new SwordItem(Tiers.STONE, 0, 0f, new Item.Properties().tab(ModCreativeModeTab.TAB)));
	 
	 public static void register(IEventBus eventBus) {
	        ITEMS.register(eventBus);
	    }

}
