package com.Elysia.elysia;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Elysia.elysia.init.blockInit;
import com.Elysia.elysia.init.itemInit;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("elysia")
public class elysia {
	public static final String MOD_ID = "elysia";
	
	private static final Logger LOGGER = LogManager.getLogger();
	
	public static final CreativeModeTab TUTORIAL_TAB = new CreativeModeTab(MOD_ID) {
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			
			return new ItemStack(itemInit.EXAMPLE_ITEM.get());
		}
	};

	public elysia() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		itemInit.ITEMS.register(bus);
		blockInit.BLOCKS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}


}
