package de.dragonrexx.newversionplugin.commands;

import de.dragonrexx.newversionplugin.utils.DragonApi;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.jetbrains.annotations.NotNull;

public class HealCmd implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player))return false;
        Player player = (Player) sender;

        //Command: /heal <playername>
        Player target = Bukkit.getPlayer(args[0]);
        if(args.length == 1){
            if(args[0] == null){
                DragonApi.sendActionbar(player, "§6The Player " + target.getName() + " is not Online.");
            }
            if(player.hasPermission("NewVersionPlugin.heal")){
                target.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 100, 3, true, false, false));
                DragonApi.sendActionbar(player, "§6The Player §3" + target.getName() + " §6was Healed.");
            } else {
                DragonApi.sendActionbar(player, "§6You have no Permission for this");
            }
        } else {
            DragonApi.sendActionbar(player, "§6Please use /heal <playername> <count 1 to 20>");
        }
        return false;
    }
}
