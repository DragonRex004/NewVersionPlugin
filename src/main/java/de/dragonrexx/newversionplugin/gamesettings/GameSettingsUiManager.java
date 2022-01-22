package de.dragonrexx.newversionplugin.gamesettings;

import de.dragonrexx.newversionplugin.NewVersionPlugin;
import de.dragonrexx.newversionplugin.utils.DragonApi;
import de.dragonrexx.newversionplugin.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

public class GameSettingsUiManager {

    private Inventory SettingsUi = Bukkit.createInventory(null, 6*9, "GameSettingsMenu");

    public void createUi(){
        DragonApi.FillBigChestMargins(SettingsUi, Material.GRAY_STAINED_GLASS_PANE);
        if(!NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.BreakProtection")){
            SettingsUi.setItem(10, new ItemBuilder(Material.BARRIER).setName("Break Protection §4OFF").setLocalizedName("Break Protection §4OFF").build());
        } else {
            SettingsUi.setItem(10, new ItemBuilder(Material.IRON_PICKAXE).setName("Break Protection §2ON").setLocalizedName("Break Protection §2ON").build());
        }

        if(NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.Chat")){
            SettingsUi.setItem(13, new ItemBuilder(Material.CREEPER_BANNER_PATTERN).setName("Chat §2ON").setLocalizedName("Chat §2ON").build());
        } else {
            SettingsUi.setItem(13, new ItemBuilder(Material.BARRIER).setName("Chat §4OFF").setLocalizedName("Chat §4OFF").build());
        }

        if(!NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.PlaceProtection")){
            SettingsUi.setItem(11, new ItemBuilder(Material.BARRIER).setName("Place Protection §4OFF").setLocalizedName("Place Protection §4OFF").build());
        } else {
            SettingsUi.setItem(11, new ItemBuilder(Material.GRASS_BLOCK).setName("Place Protection §2ON").setLocalizedName("Place Protection §2ON").build());
        }

        if(NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.PvP")){
            SettingsUi.setItem(14, new ItemBuilder(Material.IRON_SWORD).setName("PVP §2ON").setLocalizedName("PVP §2ON").build());
        } else {
            SettingsUi.setItem(14, new ItemBuilder(Material.BARRIER).setName("PVP §4OFF").setLocalizedName("PVP §4OFF").build());
        }

        if(NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.Food")){
            SettingsUi.setItem(16, new ItemBuilder(Material.BREAD).setName("Food Change §2ON").setLocalizedName("Food Change §2ON").build());
        } else {
            SettingsUi.setItem(16, new ItemBuilder(Material.BARRIER).setName("Food Change §4OFF").setLocalizedName("Food Change §4OFF").build());
        }

        if(NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.BlockPhysics")){
            SettingsUi.setItem(19, new ItemBuilder(Material.COMMAND_BLOCK).setName("Block Physics §2ON").setLocalizedName("Block Physics §2ON").build());
        } else {
            SettingsUi.setItem(19, new ItemBuilder(Material.BARRIER).setName("Block Physics §4OFF").setLocalizedName("Block Physics §4OFF").build());
        }

        if(NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.Explosions")){
            SettingsUi.setItem(20, new ItemBuilder(Material.TNT).setName("Explosions §2ON").setLocalizedName("Explosions §2ON").build());
        } else {
            SettingsUi.setItem(20, new ItemBuilder(Material.BARRIER).setName("Explosions §4OFF").setLocalizedName("Explosions §2ON").build());
        }

        if(NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.EntitySpawn")){
            SettingsUi.setItem(22, new ItemBuilder(Material.ZOMBIE_HEAD).setName("EntitySpawn §2ON").setLocalizedName("EntitySpawn §2ON").build());
        } else {
            SettingsUi.setItem(22, new ItemBuilder(Material.BARRIER).setName("EntitySpawn §4OFF").setLocalizedName("EntitySpawn §4OFF").build());
        }
    }

    public Inventory getSettingsUi() {
        return SettingsUi;
    }
}
