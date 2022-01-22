package de.dragonrexx.newversionplugin.utils;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class DragonApi {


    public static void FillSmallChestMargins(Inventory invname, Material matname){
        for(int i=0; i<9; i++){
            invname.setItem(i, new ItemStack(matname));
        }
        for(int s=18; s<27; s++){
            invname.setItem(s, new ItemStack(matname));
        }
        invname.setItem(9, new ItemStack(matname));
        invname.setItem(17, new ItemStack(matname));
    }

    public static void FillBigChestMargins(Inventory invname, Material matname){
        for(int i=0; i<9; i++){
            invname.setItem(i, new ItemStack(matname));
        }
        for(int s=45; s<54; s++){
            invname.setItem(s, new ItemStack(matname));
        }
        invname.setItem(9, new ItemStack(matname));
        invname.setItem(18, new ItemStack(matname));
        invname.setItem(27, new ItemStack(matname));
        invname.setItem(36, new ItemStack(matname));
        invname.setItem(17, new ItemStack(matname));
        invname.setItem(26, new ItemStack(matname));
        invname.setItem(35, new ItemStack(matname));
        invname.setItem(45, new ItemStack(matname));
        invname.setItem(44, new ItemStack(matname));
    }

    public static void sendActionbar(Player player, String message){
        player.spigot().sendMessage(ChatMessageType.ACTION_BAR, TextComponent.fromLegacyText(message));
    }

    public static void openUi(Player player, Inventory inventory){
        player.openInventory(inventory);
    }
}

