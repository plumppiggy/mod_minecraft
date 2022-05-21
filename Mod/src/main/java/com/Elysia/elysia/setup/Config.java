package com.Elysia.elysia.setup;

import com.Elysia.elysia.worldgen.ores.OresConfig;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;

public class Config {
	
	public static void register() {
		//registerServerConfigs();
		registerCommonConfigs();
		//registerClientConfigs();
	}
	
	/*private static void registerClientConfigs() {
		ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();
		
	}*/
	
	private static void registerCommonConfigs() {
		ForgeConfigSpec.Builder COMMON_BUILDER = new ForgeConfigSpec.Builder();
		OresConfig.registerCommonConfig(COMMON_BUILDER);
		ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, COMMON_BUILDER.build());
	}

}
