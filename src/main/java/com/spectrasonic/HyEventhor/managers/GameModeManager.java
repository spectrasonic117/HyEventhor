package com.spectrasonic.HyEventhor.managers;

import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.protocol.GameMode;

public class GameModeManager {
    private static final HytaleLogger LOGGER = HytaleLogger.forEnclosingClass();
    private static GameModeManager instance;

    public static GameModeManager getInstance() {
        if (instance == null) instance = new GameModeManager();
        return instance;
    }

    public void setPlayerGameMode(PlayerRef playerRef, GameMode gameMode) {
        if (playerRef != null && playerRef.getReference() != null) {
            LOGGER.atInfo().log("Cambiando gamemode de " + playerRef.getUsername() + " a " + gameMode);
            var ref = playerRef.getReference();
            var store = ref.getStore();
            Player.setGameMode(ref, gameMode, store);
        }
    }
}
