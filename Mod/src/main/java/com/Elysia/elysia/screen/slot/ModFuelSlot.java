package com.Elysia.elysia.screen.slot;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.entity.AbstractFurnaceBlockEntity;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ModFuelSlot extends SlotItemHandler {
	public ModFuelSlot(IItemHandler handler, int index, int x, int y) {
		super(handler, index, x, y);
	}
	
	@Override
	public boolean mayPlace(ItemStack stack) {
		return AbstractFurnaceBlockEntity.isFuel(stack) || ModFuelSlot.isBucket(stack);
	}
	
	@Override
	public int getMaxStackSize(ItemStack stack) {
		return ModFuelSlot.isBucket(stack) ? 1 : super.getMaxStackSize(stack);
	}
	
	public static boolean isBucket(ItemStack stack) {
		return stack.is(Items.BUCKET);
	}

}
