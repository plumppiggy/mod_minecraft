package com.Elysia.elysia.dataGen.server;

import com.Elysia.elysia.elysia;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider{

	public ModBlockTagsProvider(DataGenerator generator, ExistingFileHelper helper) {
		super(generator, elysia.MOD_ID, helper);
	}
	
	@Override
	protected void addTags() {
	}

}
