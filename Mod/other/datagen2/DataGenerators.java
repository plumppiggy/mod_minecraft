package com.Elysia.elysia.datagen2;

import com.Elysia.elysia.elysia;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = elysia.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator generator = event.getGenerator();
		if (event.includeServer()) {
			//generator.addProvider(new TutRecipes(generator));
			
		}
		if (event.includeClient()) {
			generator.addProvider(new TutBlockStates(generator, event.getExistingFileHelper()));
			generator.addProvider(new TutItemModels(generator, event.getExistingFileHelper()));
			generator.addProvider(new TutLanguageProvider(generator, "en_us"));
		}
	}
}
