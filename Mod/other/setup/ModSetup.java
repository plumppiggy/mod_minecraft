package com.Elysia.elysia.setup;

import com.Elysia.elysia.worldgen.ores.Ores;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModSetup {
	
	public static final String TAB_NAME = "elysia";
	
	public static final CreativeModeTab ITEM_GROUP = new CreativeModeTab(TAB_NAME) {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Items.ACACIA_BOAT);
		}
	};
	
	public static void setup() {
		IEventBus bus = MinecraftForge.EVENT_BUS;
		bus.addListener(Ores::onBiomeLoadingEvent);
		
	}
	
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			Ores.registerConfiguredFeatures();
		});
	}
	
	
	

}
