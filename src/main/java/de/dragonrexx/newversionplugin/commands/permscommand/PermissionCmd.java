package de.dragonrexx.newversionplugin.commands.permscommand;

import de.dragonrexx.newversionplugin.NewVersionPlugin;
import de.dragonrexx.newversionplugin.utils.DragonApi;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachment;
import org.jetbrains.annotations.NotNull;

public class PermissionCmd implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player))return false;
        Player player = (Player) sender;

        //  /permnwp <add/remove> <playername> <permission>

        if(args.length == 3){
            if(player.hasPermission("op")) {
                if (args[0].equalsIgnoreCase("add")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    String permission = args[2];
                    if (target != null) {
                        PermissionAttachment attachment = target.addAttachment(NewVersionPlugin.getInstance());
                        attachment.setPermission(permission, true);
                        DragonApi.sendActionbar(player, "§6 The Player: §3" + target.getName() + " §6added: " + permission);
                    } else {
                        DragonApi.sendActionbar(player, "§6 The Target: §3" + target.getName() + " §6is not Online!");
                    }
                }
                if (args[0].equalsIgnoreCase("remove")) {
                    Player target = Bukkit.getPlayer(args[1]);
                    String permission = args[2];
                    if (target != null) {
                        PermissionAttachment attachment = target.addAttachment(NewVersionPlugin.getInstance());
                        attachment.setPermission(permission, false);
                        DragonApi.sendActionbar(player, "§6 The Player: §3" + target.getName() + " §6removed: " + permission);
                        player.sendMessage("The Play");
                    } else {
                        DragonApi.sendActionbar(player, "§6 The Target: §3" + target.getName() + " §6is not Online!");
                    }
                }
            } else {
                DragonApi.sendActionbar(player, "§6 You have no Permission for this");
            }
        } else {
            DragonApi.sendActionbar(player, "§6 Please use §3/permnwp <add/remove> <Playername> <permission> §6!");
        }
        return false;
    }
}
