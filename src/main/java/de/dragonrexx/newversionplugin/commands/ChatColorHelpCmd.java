package de.dragonrexx.newversionplugin.commands;

import de.dragonrexx.newversionplugin.NewVersionPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class ChatColorHelpCmd implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player))return false;
        Player player = (Player) sender;

            player.sendMessage(NewVersionPlugin.getPrefix() + "----Chat-Colors----");
            player.sendMessage("Color:black §0Hello");
            player.sendMessage("Color:dark_blue §1Hello");
            player.sendMessage("Color:dark_green §2Hello");
            player.sendMessage("Color:dark_aqua §3Hello");
            player.sendMessage("Color:dark_red §4Hello");
            player.sendMessage("Color:dark_purple §5Hello");
            player.sendMessage("Color:gold §6Hello");
            player.sendMessage("Color:gray §7Hello");
            player.sendMessage("Color:dark_gray §8Hello");
            player.sendMessage("Color:blue §9Hello");
            player.sendMessage("Color:green §aHello");
            player.sendMessage("Color:aqua §bHello");
            player.sendMessage("Color:red §cHello");
            player.sendMessage("Color:light_purple §dHello");
            player.sendMessage("Color:yellow §eHello");
            player.sendMessage(NewVersionPlugin.getPrefix() + "----Chat-Colors----");

        return false;
    }
}
