package de.dragonrexx.newversionplugin.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ColorChatListener implements Listener {
    @EventHandler
    public void onChat(AsyncPlayerChatEvent event){
        String message = event.getMessage();

        if(message.startsWith("Color:black")){
            event.setMessage("§0" + message.replace("Color:black", ""));
            event.setFormat("§0" + message.replace("Color:black", ""));
        }
        if(message.startsWith("Color:dark_blue")){
            event.setMessage("§1" + message.replace("Color:dark_blue", ""));
            event.setFormat("§1" + message.replace("Color:dark_blue", ""));
        }
        if(message.startsWith("Color:dark_green")){
            event.setMessage("§2" + message.replace("Color:dark_green", ""));
            event.setFormat("§2" + message.replace("Color:dark_green", ""));
        }
        if(message.startsWith("Color:dark_aqua")){
            event.setMessage("§3" + message.replace("Color:dark_aqua", ""));
            event.setFormat("§3" + message.replace("Color:dark_aqua", ""));
        }
        if(message.startsWith("Color:dark_red")){
            event.setMessage("§4" + message.replace("Color:dark_red", ""));
            event.setFormat("§4" + message.replace("Color:dark_red", ""));
        }
        if(message.startsWith("Color:dark_purple")){
            event.setMessage("§5" + message.replace("Color:dark_purple", ""));
            event.setFormat("§5" + message.replace("Color:dark_purple", ""));
        }
        if(message.startsWith("Color:gold")){
            event.setMessage("§6" + message.replace("Color:gold", ""));
            event.setFormat("§6" + message.replace("Color:gold", ""));
        }
        if(message.startsWith("Color:gray")){
            event.setMessage("§7" + message.replace("Color:gray", ""));
            event.setFormat("§7" + message.replace("Color:gray", ""));
        }
        if(message.startsWith("Color:dark_gray")){
            event.setMessage("§8" + message.replace("Color:dark_gray", ""));
            event.setFormat("§8" + message.replace("Color:dark_gray", ""));
        }
        if(message.startsWith("Color:blue")){
            event.setMessage("§9" + message.replace("Color:blue", ""));
            event.setFormat("§9" + message.replace("Color:blue", ""));
        }
        if(message.startsWith("Color:green")){
            event.setMessage("§a" + message.replace("Color:green", ""));
            event.setFormat("§a" + message.replace("Color:green", ""));
        }
        if(message.startsWith("Color:aqua")){
            event.setMessage("§b" + message.replace("Color:aqua", ""));
            event.setFormat("§b" + message.replace("Color:aqua", ""));
        }
        if(message.startsWith("Color:red")){
            event.setMessage("§c" + message.replace("Color:red", ""));
            event.setFormat("§c" + message.replace("Color:red", ""));
        }
        if(message.startsWith("Color:light_purple")){
            event.setMessage("§d" + message.replace("Color:light_purple", ""));
            event.setFormat("§d" + message.replace("Color:light_purple", ""));
        }
        if(message.startsWith("Color:yellow")){
            event.setMessage("§e" + message.replace("Color:yellow", ""));
            event.setFormat("§e" + message.replace("Color:yellow", ""));
        }
    }
}
