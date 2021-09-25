package stories.villagerlimit;

import org.bukkit.configuration.file.FileConfiguration;

import org.bukkit.plugin.java.JavaPlugin;

public final class VillagerLimit extends JavaPlugin {

    public static FileConfiguration config;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        config = getConfig();
        getServer().getPluginManager().registerEvents(new VillagerTrade(),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
