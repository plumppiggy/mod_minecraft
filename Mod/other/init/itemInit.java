package com.Elysia.elysia.init;

import com.Elysia.elysia.elysia;
import com.Elysia.elysia.item.exampleItem;
import com.google.common.base.Supplier;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class itemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, elysia.MOD_ID);
	
	public static final RegistryObject<Item> EXAMPLE_ITEM = register("example_item", 
			() -> new exampleItem(new Item.Properties().tab(elysia.TUTORIAL_TAB)
					.food(new FoodProperties.Builder()
					.nutrition(4).saturationMod(2.0f).effect(() -> new MobEffectInstance(MobEffects.REGENERATION), 200).build())));
	
	public static final RegistryObject<Item> SHIV = register("shiv", 
			() -> new SwordItem(Tiers.DIAMOND, 5, 2f, new Item.Properties().tab(elysia.TUTORIAL_TAB)));
	
	public static final RegistryObject<Item> RAW_BRUV = ITEMS.register("raw_bruv",
			() -> new Item(new Item.Properties().tab(elysia.TUTORIAL_TAB)));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}

	
}
