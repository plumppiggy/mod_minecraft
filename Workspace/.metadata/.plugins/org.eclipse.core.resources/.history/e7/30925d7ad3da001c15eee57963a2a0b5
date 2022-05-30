package com.Elysia.elysia.worldgen.ores;

import java.util.Random;
import java.util.function.Predicate;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.levelgen.placement.PlacementContext;
import net.minecraft.world.level.levelgen.placement.PlacementFilter;
import net.minecraft.world.level.levelgen.placement.PlacementModifierType;

public class DimensionBiomeFilter extends PlacementFilter {
	@SuppressWarnings("unused")
	private final Predicate<ResourceKey<Level>> levelTest;
	
	public DimensionBiomeFilter(Predicate<ResourceKey<Level>> levelTest) {
		this.levelTest = levelTest;
	}

	@Override
	protected boolean shouldPlace(PlacementContext context, Random random, BlockPos pos) {
		return true;
	}

	@Override
	public PlacementModifierType<?> type() {
		return PlacementModifierType.BIOME_FILTER;
	}
	
	

}
