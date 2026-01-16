package com.spectrasonic.HyEventhor;

import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.protocol.GameMode;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.hypixel.hytale.logger.HytaleLogger;
import com.spectrasonic.HyEventhor.managers.CommandManager;
import com.hypixel.hytale.server.core.entity.entities.Player;

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

    // Método auxiliar para cambiar el gamemode de un jugador
    public void setPlayerGameMode(PlayerRef playerRef, GameMode gameMode) {
        if (playerRef != null && playerRef.getReference() != null) {
            LOGGER.atInfo().log("Cambiando gamemode de " + playerRef.getUsername() + " a " + gameMode);
            // Implementación basada en ECS de Hytale
            var ref = playerRef.getReference();
            var store = ref.getStore();
            Player.setGameMode(ref, gameMode, store);
        }
    }
}
