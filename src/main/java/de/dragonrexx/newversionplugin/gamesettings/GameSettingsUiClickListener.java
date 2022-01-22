package de.dragonrexx.newversionplugin.gamesettings;

import de.dragonrexx.newversionplugin.NewVersionPlugin;
import de.dragonrexx.newversionplugin.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GameSettingsUiClickListener implements Listener {
    @EventHandler
    public void onGSClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();

        if(event.getCurrentItem() == null)
            return;

        if(!(event.getView().getTitle().equals("GameSettingsMenu")))
            return;

        if(event.getCurrentItem().getType().equals(Material.GRAY_STAINED_GLASS_PANE)) {
            event.setCancelled(true);
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("Break Protection §4OFF")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(10);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(10, new ItemBuilder(Material.IRON_PICKAXE).setName("Break Protection §2ON").setLocalizedName("Break Protection §2ON").build());
            GameSettingsAttribute.setBreakProtection(true);
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3Break Protection §6is set of True, this means you can't break Blocks");
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("Break Protection §2ON")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(10);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(10, new ItemBuilder(Material.BARRIER).setName("Break Protection §4OFF").setLocalizedName("Break Protection §4OFF").build());
            GameSettingsAttribute.setBreakProtection(false);
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3Break Protection §6is set of False, this means you can break Blocks");
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("Place Protection §2ON")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(11);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(11, new ItemBuilder(Material.BARRIER).setName("Place Protection §4OFF").setLocalizedName("Place Protection §4OFF").build());
            GameSettingsAttribute.setPlaceProtection(false);
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3Place Protection §6is set of False, this means you can place Blocks");
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("Place Protection §4OFF")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(11);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(11, new ItemBuilder(Material.GRASS_BLOCK).setName("Place Protection §2ON").setLocalizedName("Place Protection §2ON").build());
            GameSettingsAttribute.setPlaceProtection(true);
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3Break Protection §6is set of True, this means you can't place Blocks");
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("Chat §2ON")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(13);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(13, new ItemBuilder(Material.BARRIER).setName("Chat §4OFF").setLocalizedName("Chat §4OFF").build());
            GameSettingsAttribute.setChat(false);
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3Chat §6is set of False, this means the Chat is disabled");
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("Chat §4OFF")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(13);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(13, new ItemBuilder(Material.CREEPER_BANNER_PATTERN).setName("Chat §2ON").setLocalizedName("Chat §2ON").build());
            GameSettingsAttribute.setChat(true);
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3Chat §6is set of True, this means the Chat is enabled");
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("PVP §2ON")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(14);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(14, new ItemBuilder(Material.BARRIER).setName("PVP §4OFF").setLocalizedName("PVP §4OFF").build());
            GameSettingsAttribute.setPvp(false);
            GameSettingsAktionsListener.onPvP(player.getWorld().getName());
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3PVP §6is set of False, this means PVP is disabled");
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("PVP §4OFF")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(14);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(14, new ItemBuilder(Material.IRON_SWORD).setName("PVP §2ON").setLocalizedName("PVP §2ON").build());
            GameSettingsAttribute.setPvp(true);
            GameSettingsAktionsListener.onPvP(player.getWorld().getName());
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3PVP §6is set of True, this means PVP is enabled");
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("Food Change §2ON")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(16);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(16, new ItemBuilder(Material.BARRIER).setName("Food Change §4OFF").setLocalizedName("Food Change §4OFF").build());
            GameSettingsAttribute.setFood(false);
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3Food Change §6is set of false");
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("Food Change §4OFF")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(16);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(16, new ItemBuilder(Material.BREAD).setName("Food Change §2ON").setLocalizedName("Food Change §2ON").build());
            GameSettingsAttribute.setFood(true);
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3Food Change §6is set of True");
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("Block Physics §2ON")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(19);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(19, new ItemBuilder(Material.BARRIER).setName("Block Physics §4OFF").setLocalizedName("Block Physics §4OFF").build());
            GameSettingsAttribute.setBlockPhysics(false);
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3Block Physics §6is set of False");
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("Block Physics §4OFF")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(19);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(19, new ItemBuilder(Material.COMMAND_BLOCK).setName("Block Physics §2ON").setLocalizedName("Block Physics §2ON").build());
            GameSettingsAttribute.setBlockPhysics(true);
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3Block Physics §6is set of True");
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("Explosions §2ON")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(20);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(20, new ItemBuilder(Material.BARRIER).setName("Explosions §4OFF").setLocalizedName("Explosions §4OFF").build());
            GameSettingsAttribute.setExplosions(false);
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3Explosion §6is set of False");
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("Explosions §4OFF")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(20);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(20, new ItemBuilder(Material.TNT).setName("Explosions §2ON").setLocalizedName("Explosions §2ON").build());
            GameSettingsAttribute.setExplosions(true);
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3Explosion §6is set of True");
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("EntitySpawn §2ON")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(22);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(22, new ItemBuilder(Material.BARRIER).setName("EntitySpawn §4OFF").setLocalizedName("EntitySpawn §4OFF").build());
            GameSettingsAttribute.setEntitySpawn(false);
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3EntitySpawn §6is set of False");
            return;
        }

        if(event.getCurrentItem().getItemMeta().getLocalizedName().equals("EntitySpawn §4OFF")){
            event.setCancelled(true);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().clear(22);
            NewVersionPlugin.getGameSettingsUiManager().getSettingsUi().setItem(22, new ItemBuilder(Material.ZOMBIE_HEAD).setLocalizedName("EntitySpawn §2ON").setName("EntitySpawn §2ON").build());
            GameSettingsAttribute.setEntitySpawn(true);
            player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3EntitySpawn §6is set of True");
            return;
        }
    }
}
