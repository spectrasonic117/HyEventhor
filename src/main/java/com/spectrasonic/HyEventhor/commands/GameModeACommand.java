package com.spectrasonic.hyeventhor.commands;

import com.hypixel.hytale.server.core.command.system.AbstractCommand;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.protocol.GameMode;
import com.spectrasonic.Utils.MessageUtils;
import com.spectrasonic.hyeventhor.managers.GameModeManager;
import com.spectrasonic.hyeventhor.managers.MessageManager;

import javax.annotation.Nonnull;
import java.util.concurrent.CompletableFuture;

public class GameModeACommand extends AbstractCommand {

    public GameModeACommand() {
        super("gma", "Cambiar a modo aventura");
    }

    @Override
    protected CompletableFuture<Void> execute(@Nonnull CommandContext context) {
        if (context.sender() instanceof PlayerRef player) {
            GameModeManager.getInstance().setPlayerGameMode(player, GameMode.Adventure);
            MessageUtils.sendMessage(player, MessageManager.get("message.gamemode_adventure"));
        }
        return CompletableFuture.completedFuture(null);
    }
}
