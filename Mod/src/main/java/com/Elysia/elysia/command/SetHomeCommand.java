package com.Elysia.elysia.command;

import com.Elysia.elysia.elysia;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerPlayer;

public class SetHomeCommand {
	
	public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
		dispatcher.register(Commands.literal("setHome").executes((command) -> {
			return setHome(command.getSource());
		}));
	}
	
	/*public SetHomeCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
		dispatcher.register(Commands.literal("home").then(Commands.literal("set").executes((command) -> {
			return setHome(command.getSource());
		})));
	}*/
	
	private static int setHome(CommandSourceStack source) throws CommandSyntaxException {
		ServerPlayer player = source.getPlayerOrException();
		BlockPos playerPos = player.blockPosition();
		String pos = "(" + playerPos.getX() + ", " + playerPos.getY() + ", " + playerPos.getZ() + ")";
		
		boolean hasHomePos = player.getPersistentData().getIntArray(elysia.MOD_ID + "homepos").length != 0;
		if (hasHomePos) {
			source.sendSuccess(new TextComponent("Mate you have a home " + pos), false);
			return -1;
		} else {
			player.getPersistentData().putIntArray(elysia.MOD_ID + "homepos",
					new int[] { playerPos.getX(), playerPos.getY(), playerPos.getZ() });
		
			source.sendSuccess(new TextComponent("Home Home Home: " + pos), true);
			return 1;	
		}
	}
}
