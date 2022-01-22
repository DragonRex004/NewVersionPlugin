package de.dragonrexx.newversionplugin.gamesettings;

import de.dragonrexx.newversionplugin.NewVersionPlugin;
import de.dragonrexx.newversionplugin.utils.DragonApi;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class GameSettingsUiOpenCmd implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if(!(sender instanceof Player))return false;
        Player player = (Player) sender;

        if(player.hasPermission("NewVersionPlugin.Gs")){
            DragonApi.openUi(player, NewVersionPlugin.getGameSettingsUiManager().getSettingsUi());
        }
        return false;
    }
}
