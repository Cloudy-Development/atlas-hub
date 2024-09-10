package dev.cloudy.hub.hotbar;

import dev.cloudy.hub.Atlas;
import dev.cloudy.hub.util.ItemBuilder;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * @author Emmy
 * @project Atlas
 * @date 10/09/2024 - 20:44
 */
@UtilityClass
public class HotbarUtility {

    private final FileConfiguration hotbarConfig = Atlas.getInstance().getConfigHandler().getConfig("hotbar.yml");

    private final ItemStack SERVER_SELECTOR = new ItemBuilder(Material.matchMaterial(hotbarConfig.getString("server-selector.material")))
            .name(hotbarConfig.getString("server-selector.name"))
            .lore(hotbarConfig.getStringList("server-selector.lore"))
            .durability((short) hotbarConfig.getInt("server-selector.durability"))
            .build();

    /**
     * Apply items to the player's inventory.
     *
     * @param player the player
     * @param clearInventory if the player's inventory should be cleared
     */
    public void applyItems(Player player, boolean clearInventory) {
        if (clearInventory) player.getInventory().clear();

        if (hotbarConfig.getBoolean("server-selector.enabled")) player.getInventory().setItem(hotbarConfig.getInt("server-selector.slot"), SERVER_SELECTOR);
    }
}
