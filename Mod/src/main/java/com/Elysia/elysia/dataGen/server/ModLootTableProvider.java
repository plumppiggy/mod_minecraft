package com.Elysia.elysia.dataGen.server;

import com.Elysia.elysia.dataGen.BaseLootTableProvider;
import com.Elysia.elysia.init.blockInit;
import com.Elysia.elysia.init.itemInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModLootTableProvider extends BaseLootTableProvider {

	public ModLootTableProvider(DataGenerator generator) {
		super(generator);
	}

	@Override
	protected void addTables() {
		dropSelf(blockInit.EXAMPLE_BLOCK.get());
		silkTouch(blockInit.ROTATABLE_BLOCK.get(), itemInit.EXAMPLE_ITEM.get(), 1, 4);
	}

	protected void silkTouch(Block block, Item silk, int min, int max) {
		add(block, createSilkTouchTable(block.getRegistryName().getPath(), block, silk, min, max));
	}

	protected void dropSelf(Block block) {
		add(block, createSimpleTable(block.getRegistryName().getPath(), block));
	}
}
