package com.Elysia.elysia.dataGen.server;

import java.util.function.Consumer;

import com.Elysia.elysia.elysia;
import com.Elysia.elysia.init.blockInit;
import com.Elysia.elysia.init.itemInit;
import com.Elysia.elysia.init.tagInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;

public class ModRecipeProvider extends RecipeProvider {

	public ModRecipeProvider(DataGenerator generator) {
		super(generator);
	}
	
	@Override
	protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder.shaped(itemInit.EXAMPLE_ITEM.get())
		.define('a', blockInit.EXAMPLE_BLOCK.get().asItem())
		.define('b', tagInit.Items.COOL_ITEMS)
		.unlockedBy("has_" + blockInit.EXAMPLE_BLOCK.get().getRegistryName().getPath(), has(blockInit.EXAMPLE_BLOCK.get().asItem()))
		.pattern("aba").pattern("bab").pattern("aba")
		.save(consumer, new ResourceLocation(elysia.MOD_ID, itemInit.EXAMPLE_ITEM.get().getRegistryName().getPath()));
		
		ShapelessRecipeBuilder.shapeless(blockInit.EXAMPLE_BLOCK.get().asItem(), 4)
			.requires(itemInit.EXAMPLE_ITEM.get())
			.unlockedBy("has_" + itemInit.EXAMPLE_ITEM.get().getRegistryName().getPath(), has(itemInit.EXAMPLE_ITEM.get()))
			.save(consumer, new ResourceLocation(elysia.MOD_ID, blockInit.EXAMPLE_BLOCK.get().getRegistryName().getPath()));
		
		SimpleCookingRecipeBuilder.smelting(Ingredient.of(blockInit.ROTATABLE_BLOCK.get().asItem()), 
				itemInit.EXAMPLE_ITEM.get(), 1f, 200)
			.unlockedBy("has_" + blockInit.ROTATABLE_BLOCK.get().getRegistryName().getPath(), has(blockInit.ROTATABLE_BLOCK.get().asItem()))
			.save(consumer, new ResourceLocation(elysia.MOD_ID, itemInit.EXAMPLE_ITEM.get().getRegistryName().getPath()
			+ "_smelting"));
		
	}

}
