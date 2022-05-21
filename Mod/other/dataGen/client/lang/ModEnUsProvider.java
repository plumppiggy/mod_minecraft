package com.Elysia.elysia.dataGen.client.lang;

import com.Elysia.elysia.elysia;
import com.Elysia.elysia.init.blockInit;
import com.Elysia.elysia.init.itemInit;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModEnUsProvider extends LanguageProvider {
	public ModEnUsProvider(DataGenerator gen) {
		super(gen, elysia.MOD_ID, "en_us");
	}

	@Override
	protected void addTranslations() {
		
		// Item Groups
		add("itemGroup.elysia", "Elysia Mod Tab");
		
		// Items
		add(itemInit.EXAMPLE_ITEM.get(), "Example Item");
		
		// Blocks
		add(blockInit.EXAMPLE_BLOCK.get(), "Example Block");
		add(blockInit.ROTATABLE_BLOCK.get(), "Rotatable Block");
	}
}
