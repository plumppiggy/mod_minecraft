package com.Elysia.elysia.worldgen.ores;


import com.Elysia.elysia.setup.Registration;

import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraftforge.event.world.BiomeLoadingEvent;


public class Ores {
	
	
	
	public static PlacedFeature OREGEN;
	
	public static void registerConfiguredFeatures() {
		OreConfiguration mysteriousConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, Registration.BRUV_ORE.get().defaultBlockState(),
				OresConfig.MYSTERIOUS_VEINSIZE.get());
		OREGEN = registerPlacedFeature("bruv_ore", Feature.ORE.configured(mysteriousConfig),
				CountPlacement.of(3),
				InSquarePlacement.spread(),
				BiomeFilter.biome(),
				HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(90)));
				
	
	}
	private static <C extends FeatureConfiguration, F extends Feature<C>> PlacedFeature registerPlacedFeature(String
			registryName, ConfiguredFeature<C, F> feature, PlacementModifier... placementModifiers) {
		PlacedFeature placed = BuiltinRegistries.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(registryName),
				feature).placed(placementModifiers);
		return PlacementUtils.register(registryName, placed);
	}
	
	public static void onBiomeLoadingEvent(BiomeLoadingEvent event) {
		event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, OREGEN);
	}
}