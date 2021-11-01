package net.cyberflame.plugin.tasks;

import net.cyberflame.plugin.Main;
import org.bukkit.Bukkit;

import net.cyberflame.plugin.Plugin;

public class Task implements Runnable {
    @Override
    public void run() {
        final String message = Main.getInstance().getConfig().getString("messages.from-task");
        Bukkit.getServer().broadcastMessage(message);
    }
}
