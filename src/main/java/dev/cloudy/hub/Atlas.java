package dev.cloudy.hub;

import dev.cloudy.hub.config.ConfigHandler;
import dev.cloudy.hub.listener.PlayerListener;
import lombok.Getter;
import lombok.Setter;
import org.bukkit.plugin.java.JavaPlugin;

@Getter
@Setter
public class Atlas extends JavaPlugin {

    @Getter
    private static Atlas instance;

    private ConfigHandler configHandler;

    @Override
    public void onEnable() {
        instance = this;

        configHandler = new ConfigHandler();

        getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }

    @Override
    public void onDisable() {
        instance = null;
    }
}
