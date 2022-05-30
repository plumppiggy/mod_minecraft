package com.Elysia.elysia.setup;

import com.Elysia.elysia.elysia;
import com.Elysia.elysia.screen.ModMenuTypes;
import com.Elysia.elysia.screen.ToasterScreen;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = elysia.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {
	public static void init(final FMLClientSetupEvent event) {
		MenuScreens.register(ModMenuTypes.TOASTER_MENU.get(), ToasterScreen::new);
		
	}
	

}
