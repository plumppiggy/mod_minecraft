package com.Elysia.elysia.datagen2;

import com.Elysia.elysia.elysia;
import com.Elysia.elysia.setup.Registration;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class TutLanguageProvider extends LanguageProvider {
	public TutLanguageProvider(DataGenerator gen, String locale) {
		super(gen, elysia.MOD_ID, locale);
	}
	
	@Override
	protected void addTranslations() {
		add("itemGroup.elysia", "Elysia");
		add(Registration.ELYSIUM_ORE.get(), "Elysia Ore");
	}

	

}
