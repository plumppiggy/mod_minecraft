package com.Elysia.elysia.setup;

import com.Elysia.elysia.elysia;
import com.Elysia.elysia.command.GoHomeCommand;
import com.Elysia.elysia.command.SetHomeCommand;

import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = elysia.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModEventListener {

    @SubscribeEvent
    public static void registerCommands(RegisterCommandsEvent event){
        SetHomeCommand.register(event.getDispatcher());
        GoHomeCommand.register(event.getDispatcher());
    }
}