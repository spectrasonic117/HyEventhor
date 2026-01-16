package com.spectrasonic.hyeventhor;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.spectrasonic.hyeventhor.managers.CommandManager;
import com.hypixel.hytale.logger.HytaleLogger;

import javax.annotation.Nonnull;

public class Main extends JavaPlugin {

    private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();

    public Main(@Nonnull JavaPluginInit init) {
        super(init);
        LOGGER.atInfo().log("Hola desde " + this.getName() + " version " + this.getManifest().getVersion().toString());
    }

    @Override
    public void setup() {
        super.setup();
        CommandManager commandManager = new CommandManager(this);
        commandManager.registerCommands();
        LOGGER.atInfo().log("HyEventhor setup correctly!");
        LOGGER.atInfo().log("Developed by Spectrasonic.");
    }
}
