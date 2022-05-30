package com.Elysia.elysia.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;

public class ModCreativeModeTab {

	public static final CreativeModeTab TAB = new CreativeModeTab("elysiatab") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(Blocks.ACACIA_DOOR);
		}
	};
}
