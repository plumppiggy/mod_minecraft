package com.Elysia.elysia.recipe;

import com.Elysia.elysia.elysia;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
	
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = 
			DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, elysia.MOD_ID);
	
	public static final RegistryObject<RecipeSerializer<ToasterRecipe>> TOASTER_SERIALIZER = 
			SERIALIZERS.register("toasting", () -> ToasterRecipe.Serializer.INSTANCE);
	
	public static void register(IEventBus bus) {
		SERIALIZERS.register(bus);
	}

}
