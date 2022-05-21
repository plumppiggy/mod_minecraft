package com.Elysia.elysia.worldgen.ores;

import net.minecraftforge.common.ForgeConfigSpec;

public class OresConfig {
	
	public static ForgeConfigSpec.IntValue MYSTERIOUS_AMOUNT;
	public static ForgeConfigSpec.IntValue MYSTERIOUS_VEINSIZE;
	
	public static void registerCommonConfig(ForgeConfigSpec.Builder COMMON_BUILDER) {
		COMMON_BUILDER.comment("Settings for ore generation").push("ores");
		
		MYSTERIOUS_VEINSIZE = COMMON_BUILDER
				.comment("Veinsize of ores")
				.defineInRange("mysteriousVeinsize", 25, 1, Integer.MAX_VALUE);
		MYSTERIOUS_AMOUNT = COMMON_BUILDER
				.comment("amount of veins of the ore")
				.defineInRange("mysteriousAmount", 10, 1, Integer.MAX_VALUE);
		
		COMMON_BUILDER.pop();
		
	}

}
