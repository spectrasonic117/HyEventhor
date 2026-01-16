package com.spectrasonic.Utils;

import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.Message;

public class MessageUtils {

    public static void sendMessage(PlayerRef player, String message) {
        if (player != null) {
            player.sendMessage(MessageFormatter.format(message));
        }
    }

    public static void broadcastMessage(String message) {
        // Hytale implementation for broadcast depends on API
        // For now, we take it as a placeholder or implement if known
    }

    public static Message formatMessage(String message) {
        return MessageFormatter.format(message);
    }

    public static String stripColorCodes(String text) {
        return MessageFormatter.stripColorCodes(text);
    }
}
