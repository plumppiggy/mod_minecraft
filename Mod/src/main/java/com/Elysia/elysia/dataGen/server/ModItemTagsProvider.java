package com.Elysia.elysia.dataGen.server;

import com.Elysia.elysia.elysia;
import com.Elysia.elysia.init.blockInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider {

	public ModItemTagsProvider(DataGenerator generator, BlockTagsProvider blocks,
			ExistingFileHelper helper) {
		super(generator, blocks, elysia.MOD_ID, helper);
	}
	
	@Override
	protected void addTags() {
		tag(Tags.Items.BARRELS).add(blockInit.ROTATABLE_BLOCK.get().asItem());
	}
	

}
