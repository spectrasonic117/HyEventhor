package com.spectrasonic.HyEventhor.managers;

import com.spectrasonic.HyEventhor.Main;
import com.spectrasonic.HyEventhor.commands.GameModeACommand;
import com.spectrasonic.HyEventhor.commands.GameModeCCommand;
import com.spectrasonic.HyEventhor.commands.GameModeECommand;

public class CommandManager {
    private final Main plugin;

    public CommandManager(Main plugin) {
        this.plugin = plugin;
    }

    public void registerCommands() {
        // Hytale registry approach
        plugin.getCommandRegistry().registerCommand(new GameModeACommand());
        plugin.getCommandRegistry().registerCommand(new GameModeCCommand());
        plugin.getCommandRegistry().registerCommand(new GameModeECommand());
    }
}
