package de.dragonrexx.newversionplugin.gamesettings;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class GameSettingsAktionsListener implements Listener {
    @EventHandler
    public void onBreakBlock(BlockBreakEvent event){
        if(GameSettingsAttribute.isBreakProtection()){
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onPlaceBlock(BlockPlaceEvent event){
        if(GameSettingsAttribute.isPlaceProtection()){
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent event){
        if(!GameSettingsAttribute.isChat()){
            event.setCancelled(true);
        }
    }

    public static void onPvP(String worldname){
        if(!GameSettingsAttribute.isPvp()){
            Bukkit.getWorld(worldname).setPVP(false);
        } else {
            Bukkit.getWorld(worldname).setPVP(true);
        }
    }

    @EventHandler
    public static void onHungry(FoodLevelChangeEvent event){
        Player player = (Player) event.getEntity();
        if(!GameSettingsAttribute.isFood()){
            event.setCancelled(true);
        }
    }

    @EventHandler
    public static void onPhysic(BlockPhysicsEvent event){
        if(!GameSettingsAttribute.isBlockPhysics()){
            event.setCancelled(true);
        }
    }

    @EventHandler
    public static void onExplosion(BlockExplodeEvent event){
        if(!GameSettingsAttribute.isExplosions()){
            event.setCancelled(true);
        }
    }

    @EventHandler
    public static void onEntitySpawn(EntitySpawnEvent event){
        if(!GameSettingsAttribute.isEntitySpawn()){
            event.setCancelled(true);
        }
    }
}
