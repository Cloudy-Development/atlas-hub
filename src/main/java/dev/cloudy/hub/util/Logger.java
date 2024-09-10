package dev.cloudy.hub.util;

import lombok.experimental.UtilityClass;
import org.bukkit.Bukkit;

/**
 * @author Emmy
 * @project Atlas
 * @date 10/09/2024 - 20:34
 */
@UtilityClass
public class Logger {
    /**
     * Log info a message to the console.
     *
     * @param message the message
     */
    public void logError(String message) {
        Bukkit.getConsoleSender().sendMessage(CC.translate(ProjectInfo.ERROR_NAME + " &c&lERROR &8» &c" + message));
    }
}
