package com.Elysia.elysia;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.Elysia.elysia.setup.ClientSetup;
import com.Elysia.elysia.setup.ModSetup;
import com.Elysia.elysia.setup.Registration;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("elysia")
public class elysia {
	public static final String MOD_ID = "elysia";
	
	@SuppressWarnings("unused")
	private static final Logger LOGGER = LogManager.getLogger();


	public elysia() {
		Registration.init();
		
		IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
		modbus.addListener(ModSetup::init);
		DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
	}


}
