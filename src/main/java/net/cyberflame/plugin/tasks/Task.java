package net.cyberflame.plugin.tasks;

import net.cyberflame.plugin.Main;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class Task extends BukkitRunnable {
    @Override
    public void run() {
        final String message = Main.getInstance().getConfig().getString("messages.from-task");
        Bukkit.getServer().broadcastMessage(message);
    }
}
