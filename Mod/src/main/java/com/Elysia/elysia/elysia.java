package com.Elysia.elysia;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Elysia.elysia.block.ModBlocks;
import com.Elysia.elysia.block.entity.ModBlockEntities;
import com.Elysia.elysia.enchantment.ModEnchantments;
import com.Elysia.elysia.item.ModItems;
import com.Elysia.elysia.recipe.ModRecipes;
import com.Elysia.elysia.screen.ModMenuTypes;
import com.Elysia.elysia.screen.ToasterScreen;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("elysia")
public class elysia {
	public static final String MOD_ID = "elysia";
	
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LogManager.getLogger();


	public elysia() {
		IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ModEnchantments.register(modbus);
		ModMenuTypes.register(modbus);
		ModItems.register(modbus);
		ModBlocks.register(modbus);
		ModRecipes.register(modbus);
		ModBlockEntities.register(modbus);
		
		modbus.addListener(this::setup);
		modbus.addListener(this::clientSetup);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	private void clientSetup(final FMLClientSetupEvent event) {
		ItemBlockRenderTypes.setRenderLayer(ModBlocks.TOASTER.get(), RenderType.cutout());
		
		MenuScreens.register(ModMenuTypes.TOASTER_MENU.get(), ToasterScreen::new);
	}
	
	private void setup(final FMLClientSetupEvent event) {
		
	}


}
