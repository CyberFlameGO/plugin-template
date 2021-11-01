package net.cyberflame.plugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import net.cyberflame.plugin.Main;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerJoin (final PlayerJoinEvent event) {
        final String message = Main.getInstance().getConfig().getString("messages.from-listener");
        event.getPlayer().sendMessage(ChatColor.translateAlternateColorCodes('&', message));
    }
}
