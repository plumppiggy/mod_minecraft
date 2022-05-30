package com.Elysia.elysia.command;

import com.Elysia.elysia.elysia;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerPlayer;

public class GoHomeCommand {
	
	public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
		dispatcher.register(Commands.literal("home").executes((command) -> {
			return goHome(command.getSource());
		}));
	}
	/*
	public GoHomeCommand(CommandDispatcher<CommandSourceStack> dispatcher) {
		dispatcher.register(Commands.literal("home").then(Commands.literal("return").executes((command) -> {
			return goHome(command.getSource());
		})));
	}*/
	
	private static int goHome(CommandSourceStack source) throws CommandSyntaxException {
		ServerPlayer player = source.getPlayerOrException();
		boolean hasHomePos = player.getPersistentData().getIntArray(elysia.MOD_ID + "homepos").length != 0;
		
		if(hasHomePos) {
			int[] playerPos = player.getPersistentData().getIntArray(elysia.MOD_ID + "homepos");
			player.teleportTo(playerPos[0], playerPos[1], playerPos[2]);
			
			source.sendSuccess(new TextComponent("AYOOO welcome home fam"), true);
			return 1;
		}else {
			source.sendFailure(new TextComponent("UR homeless FAM"));
			return -1;
		}
		
	}
}
