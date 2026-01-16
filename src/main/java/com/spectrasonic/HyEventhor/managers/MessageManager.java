package com.spectrasonic.HyEventhor.managers;

import java.util.HashMap;
import java.util.Map;

public class MessageManager {
    private static final Map<String, String> messages = new HashMap<>();

    static {
        // Fallback or default messages until config is loaded
        messages.put("message.gamemode_adventure", "<yellow>Gamemode changed to Adventure!</yellow>");
        messages.put("message.gamemode_creative", "<yellow>Gamemode changed to Creative!</yellow>");
        messages.put("message.gamemode_not_available", "<red>This gamemode is currently not available.</red>");
    }

    public static String get(String key) {
        return messages.getOrDefault(key, "Message not found: " + key);
    }
}
