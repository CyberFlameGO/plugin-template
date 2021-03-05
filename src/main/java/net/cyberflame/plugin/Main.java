package net.cyberflame.plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
@Override
public void onEnable() {
	Bukkit.broadcastMessage("[Plugin] Plugin loaded and enabled successfully!");
//	Bukkit.getPluginManager().registerEvents(new PlayerListener(), this);
}
}
