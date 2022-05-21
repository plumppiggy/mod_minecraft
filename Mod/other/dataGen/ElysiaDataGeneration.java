package com.Elysia.elysia.dataGen;

import com.Elysia.elysia.elysia;
import com.Elysia.elysia.dataGen.client.ModBlockStateProvider;
import com.Elysia.elysia.dataGen.client.ModItemModelProvider;
import com.Elysia.elysia.dataGen.client.lang.ModEnUsProvider;
import com.Elysia.elysia.dataGen.server.ModBlockTagsProvider;
import com.Elysia.elysia.dataGen.server.ModItemTagsProvider;
import com.Elysia.elysia.dataGen.server.ModLootTableProvider;
import com.Elysia.elysia.dataGen.server.ModRecipeProvider;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = elysia.MOD_ID, bus = Bus.MOD)
public class ElysiaDataGeneration {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		ExistingFileHelper helper = event.getExistingFileHelper();
		
		if (event.includeClient()) {
			
			generator.addProvider(new ModBlockStateProvider(generator, helper));
			generator.addProvider(new ModItemModelProvider(generator, helper));
			generator.addProvider(new ModEnUsProvider(generator));
			
		}
		
		if (event.includeServer()) {
			ModBlockTagsProvider blockTags = new ModBlockTagsProvider(generator, helper);
			
			
			
			generator.addProvider(new ModRecipeProvider(generator));
			generator.addProvider(blockTags);
			generator.addProvider(new ModItemTagsProvider(generator, blockTags, helper));
			generator.addProvider(new ModLootTableProvider(generator));
			
		}
		
	}
	

}
