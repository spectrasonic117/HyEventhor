package com.spectrasonic.hyeventhor.managers;

import com.spectrasonic.hyeventhor.Main;
import com.spectrasonic.hyeventhor.commands.GameModeACommand;
import com.spectrasonic.hyeventhor.commands.GameModeCCommand;
import com.spectrasonic.hyeventhor.commands.GameModeECommand;

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
