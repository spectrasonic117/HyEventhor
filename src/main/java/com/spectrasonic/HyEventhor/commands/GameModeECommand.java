package com.spectrasonic.hyeventhor.commands;

import com.hypixel.hytale.server.core.command.system.AbstractCommand;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.spectrasonic.Utils.MessageUtils;
import com.spectrasonic.hyeventhor.managers.MessageManager;

import javax.annotation.Nonnull;
import java.util.concurrent.CompletableFuture;

public class GameModeECommand extends AbstractCommand {

    public GameModeECommand() {
        super("gme", "Cambiar a modo exploración");
    }

    @Override
    protected CompletableFuture<Void> execute(@Nonnull CommandContext context) {
        if (context.sender() instanceof PlayerRef player) {
            MessageUtils.sendMessage(player, MessageManager.get("message.gamemode_not_available"));
        }
        return CompletableFuture.completedFuture(null);
    }
}
