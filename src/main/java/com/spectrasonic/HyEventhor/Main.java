package com.spectrasonic.HyEventhor;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.hypixel.hytale.logger.HytaleLogger;
import com.spectrasonic.HyEventhor.managers.CommandManager;

public class Main extends JavaPlugin {
    
    private static Main instance;
    private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();

    public Main(JavaPluginInit init) {
        super(init);
        instance = this;
    }
    
    public static Main getInstance() {
        return instance;
    }

    @Override
    public void setup() {
        CommandManager commandManager = new CommandManager(this);
        commandManager.registerCommands();
        LOGGER.atInfo().log("HyEventhor setup correctly!");
    }
}
