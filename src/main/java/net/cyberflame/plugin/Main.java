package net.cyberflame.plugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

import net.cyberflame.plugin.commands.Command;
import net.cyberflame.plugin.listeners.PlayerJoinListener;
import net.cyberflame.plugin.tasks.Task;

public class Main extends JavaPlugin {
    
    @Override
    public void onEnable () {
        this.saveDefaultConfig();
	    
        Plugin.instance = this;
	    
        this.getCommand("command").setExecutor(new Command());
        
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerJoinListener(), this);

        final long taskRepeatEvery = this.getConfig().getInt("task-repeat-every") * 20L;
        BukkitTask task = new Task().runTaskLater(this, taskRepeatEvery);
    }

    private static Main instance;

    public static Main getInstance () {
        return Main.instance;
    }
}
