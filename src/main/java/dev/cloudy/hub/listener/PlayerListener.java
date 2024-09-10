package dev.cloudy.hub.listener;

import dev.cloudy.hub.hotbar.HotbarUtility;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * @author Emmy
 * @project Atlas
 * @date 10/09/2024 - 20:48
 */
public class PlayerListener implements Listener {

    @EventHandler
    private void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        HotbarUtility.applyItems(player, true);

        event.setJoinMessage(null);
    }
}