package com.Elysia.elysia.setup;


import com.Elysia.elysia.elysia;
import com.Elysia.elysia.block.custom.ToasterBlock;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Registration {
	
	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, elysia.MOD_ID);
	private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, elysia.MOD_ID);
	
	public static void init() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		BLOCKS.register(bus);
		ITEMS.register(bus);
	}
	public static final RegistryObject<Block> TOASTER = BLOCKS.register("toaster",
            () -> new ToasterBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()));
	public static final RegistryObject<Item> TOASTER_ITEM = fromBlock(TOASTER);
	
	public static final BlockBehaviour.Properties BLOCK_PROPERTIES = BlockBehaviour.Properties.of(Material.STONE).strength(2f).requiresCorrectToolForDrops();
	public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(ModSetup.ITEM_GROUP);
	
	public static final RegistryObject<Block> ELYSIUM_ORE = BLOCKS.register("elysium_ore", () -> new Block(BLOCK_PROPERTIES));
	public static final RegistryObject<Item> ELYSIUM_ITEM = fromBlock(ELYSIUM_ORE);
	
	public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BLOCK_PROPERTIES));
	public static final RegistryObject<Item> EXAMPLE_BLOCK_ITEM = fromBlock(EXAMPLE_BLOCK);
	
	public static final RegistryObject<Item> SHIV = ITEMS.register("shiv", () -> new SwordItem(Tiers.STONE, 2, 0.5f, new Item.Properties().tab(ModSetup.ITEM_GROUP)));
	
	public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
		return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), ITEM_PROPERTIES));
	}
	
	
	
	
	


}
