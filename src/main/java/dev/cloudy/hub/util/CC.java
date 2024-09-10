package dev.cloudy.hub.util;

import lombok.experimental.UtilityClass;
import org.bukkit.ChatColor;

/**
 * @author Emmy
 * @project Atlas
 * @date 10/09/2024 - 20:35
 */
@UtilityClass
public class CC {
    /**
     * Translate color codes string.
     *
     * @param message the message
     * @return the string
     */
    public String translate(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }
}
