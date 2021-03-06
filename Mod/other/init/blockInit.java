package com.Elysia.elysia.init;

import java.util.function.Function;

import com.Elysia.elysia.elysia;
import com.Elysia.elysia.block.exampleBlock;
import com.Elysia.elysia.block.oreBlock;
import com.Elysia.elysia.block.rotatableBlock;
import com.google.common.base.Supplier;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class blockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, elysia.MOD_ID);
	
	public static final DeferredRegister<Item> ITEMS = itemInit.ITEMS;
	
	public static final RegistryObject<Block> BRUV_ORE = register("bruv_ore", 
			() -> new oreBlock(BlockBehaviour.Properties.of(Material.METAL)
					.strength(5f).requiresCorrectToolForDrops()), 
					object -> () -> new BlockItem(object.get(),
							new Item.Properties().tab(elysia.TUTORIAL_TAB)));
	
	public static final RegistryObject<Block> EXAMPLE_BLOCK = register("example_block",
			() -> new exampleBlock(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_CYAN)
					.strength(3.0f).sound(SoundType.METAL).requiresCorrectToolForDrops()),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(elysia.TUTORIAL_TAB)));
	
	
	public static final RegistryObject<Block> ROTATABLE_BLOCK = register("rotatable_block", 
			() -> new rotatableBlock(BlockBehaviour.Properties.copy(Blocks.DIRT).dynamicShape().sound(SoundType.SAND)),
			object -> () -> new BlockItem(object.get(), new Item.Properties().tab(elysia.TUTORIAL_TAB)));
	
	private static <T extends Block> RegistryObject<T> registerBlock(final String name, 
			final Supplier<? extends T> block) {
		return BLOCKS.register(name, block);
	}
	
	private static <T extends Block> RegistryObject<T> register(final String name, 
			final Supplier<? extends T> block, Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}
}
