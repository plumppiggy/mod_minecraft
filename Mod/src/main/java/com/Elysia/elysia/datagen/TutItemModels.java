package com.Elysia.elysia.datagen;

import com.Elysia.elysia.elysia;
import com.Elysia.elysia.setup.Registration;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class TutItemModels extends ItemModelProvider {

	public TutItemModels(DataGenerator generator, ExistingFileHelper helper) {
		super(generator, elysia.MOD_ID, helper);
	}
	
	@Override
	protected void registerModels() {

		withExistingParent(Registration.BRUV_ORE.get().getRegistryName().getPath(), modLoc("block/bruv_ore"));
	}
}
