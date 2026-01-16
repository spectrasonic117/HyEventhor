package com.spectrasonic.hyeventhor.managers;

import java.util.HashMap;
import java.util.Map;

public class MessageManager {
    private static final Map<String, String> messages = new HashMap<>();

    static {
        // Fallback or default messages until config is loaded
        messages.put("message.gamemode_adventure", "&aGamemode changed to Adventure!");
        messages.put("message.gamemode_creative", "&bGamemode changed to Creative!");
        messages.put("message.gamemode_survival", "&6Gamemode changed to Survival!");
        messages.put("message.gamemode_spectator", "&dGamemode changed to Spectator!");
        messages.put("message.gamemode_not_available", "&cThis gamemode is currently not available.");
        messages.put("message.no_permission", "&4You do not have permission to use this command!");
        messages.put("message.player_only", "&cThis command can only be used by players!");
        messages.put("message.invalid_arguments", "&eInvalid arguments. Use /help to see the list of commands.");
    }

    public static String get(String key) {
        return messages.getOrDefault(key, "Message not found: " + key);
    }
}
