package com.Elysia.elysia.block.entity;

import com.Elysia.elysia.elysia;
import com.Elysia.elysia.block.ModBlocks;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
	
	public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = 
			DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, elysia.MOD_ID);
	
	public static final RegistryObject<BlockEntityType<ToasterBlockEntity>> TOASTER = 
			BLOCK_ENTITIES.register("toaster", () ->
			BlockEntityType.Builder.of(ToasterBlockEntity::new,
					ModBlocks.TOASTER.get()).build(null));
	
	public static void register(IEventBus bus) {
		BLOCK_ENTITIES.register(bus);
	}




}
