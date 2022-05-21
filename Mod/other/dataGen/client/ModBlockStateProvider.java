package com.Elysia.elysia.dataGen.client;

import com.Elysia.elysia.elysia;
import com.Elysia.elysia.init.blockInit;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
	
	public ModBlockStateProvider(DataGenerator generator, ExistingFileHelper helper) {
		super(generator, elysia.MOD_ID, helper);
	}

	@Override
	protected void registerStatesAndModels() {
		simpleBlock(blockInit.EXAMPLE_BLOCK.get());
	}
	
	

}
