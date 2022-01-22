package de.dragonrexx.newversionplugin.listener;

import de.dragonrexx.newversionplugin.NewVersionPlugin;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.sendMessage(NewVersionPlugin.getPrefix() + "§6------List-of-Default-permissions------");
        player.sendMessage(NewVersionPlugin.getPrefix() + "");
        player.sendMessage(NewVersionPlugin.getPrefix() + "§6These Permissions can only be set by one");
        player.sendMessage(NewVersionPlugin.getPrefix() + "§6 with op Permissions");
        player.sendMessage(NewVersionPlugin.getPrefix() + "§6Permission Heal: §3NewVersionPlugin.Heal");
        player.sendMessage(NewVersionPlugin.getPrefix() + "§6Permission Dp: §3NewVersionPlugin.Dp");
        player.sendMessage(NewVersionPlugin.getPrefix() + "§6Permission Gameini: §3NewVersionPlugin.Gs");
        player.sendMessage(NewVersionPlugin.getPrefix() + "§6Permission NPC: §3NewVersionPlugin.npc");
        player.sendMessage(NewVersionPlugin.getPrefix() + "");
        player.sendMessage(NewVersionPlugin.getPrefix() + "§6------List-of-Default-permissions------");
        player.setTexturePack("https://www.dropbox.com/s/6s6onpboyf9vpjm/NewVersionPlugin.zip?dl=1");
    }
}
