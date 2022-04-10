package net.nosadnile.slimeplus.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.HumanEntity;

public class MessageUtil {
    /**
     * Send a colorful message to the specified entity.
     * @param entity The entity that will recieve the message.
     * @param message The message to send.
     */
    public static void send(HumanEntity entity, String message) {
        entity.sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }

    /**
     * Log a colorful message to the console.
     * @param message The message to log.
     */
    public static void log(String message) {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }
}
