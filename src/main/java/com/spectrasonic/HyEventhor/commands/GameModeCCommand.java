package com.spectrasonic.HyEventhor.commands;

import com.hypixel.hytale.server.core.command.system.AbstractCommand;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.protocol.GameMode;
import com.spectrasonic.HyEventhor.Main;
import com.spectrasonic.HyEventhor.managers.MessageManager;
import com.spectrasonic.Utils.MessageUtils;
import javax.annotation.Nonnull;
import java.util.concurrent.CompletableFuture;

public class GameModeCCommand extends AbstractCommand {

    public GameModeCCommand() {
        super("gmc", "Cambiar a modo creativo");
    }

    @Override
    protected CompletableFuture<Void> execute(@Nonnull CommandContext context) {
        if (context.sender() instanceof PlayerRef player) {
            Main.getInstance().setPlayerGameMode(player, GameMode.Creative);
            MessageUtils.sendMessage(player, MessageManager.get("message.gamemode_creative"));
        }
        return CompletableFuture.completedFuture(null);
    }
}
