package com.Elysia.elysia.screen.slot;

import net.minecraft.world.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ModResultSlot extends SlotItemHandler {
	public ModResultSlot(IItemHandler handler, int index, int x, int y) {
		super(handler, index, x, y);
	}
	
	@Override
	public boolean mayPlace(ItemStack stack) {
		return false;
	}

}
