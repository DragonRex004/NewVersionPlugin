package de.dragonrexx.newversionplugin.commands.permscommand;

import de.dragonrexx.newversionplugin.NewVersionPlugin;
import de.dragonrexx.newversionplugin.utils.DragonApi;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PermissionDisplayCmd implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player))return false;
        Player player = (Player) sender;

        // /displayperms <Playername> <perm>
        if(args.length == 2){
            if(player.hasPermission("NewVersionPlugin.Dp")){
                Player target = Bukkit.getPlayer(args[0]);
                String perm = args[1];
                if(target !=null){
                   if(target.hasPermission(perm)){
                       player.sendMessage(NewVersionPlugin.getPrefix() + "§6The Player: §3" + target.getName() + " §6has the Permission: §3" + perm);
                   } else {
                       player.sendMessage(NewVersionPlugin.getPrefix() + "§6The Player: §3" + target.getName() + " §6has not this §3" + perm);
                    }
                } else {
                    DragonApi.sendActionbar(player, "§6The Player: §3" + target.getName() + " §6is not online");
                }
            } else {
                DragonApi.sendActionbar(player, "§6You have no Permissions for this");
            }
        } else {
            DragonApi.sendActionbar(player, "§6Please use /displayperms <playername>");
        }
        return false;
    }
}
