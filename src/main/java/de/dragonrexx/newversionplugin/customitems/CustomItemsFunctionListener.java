package de.dragonrexx.newversionplugin.customitems;

import de.dragonrexx.newversionplugin.utils.ItemBuilder;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class CustomItemsFunctionListener implements Listener {
    @EventHandler
    public void Break(BlockBreakEvent event) {
        Player player = event.getPlayer();
        if(!player.getGameMode().equals(GameMode.SURVIVAL)){
            return;
        }
        if(!player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase("§c§lFurnace Pickaxe")) {
            return;
        }
        int i = (int) (Math.random() * 5);
        switch (event.getBlock().getType()) {
            case IRON_ORE:
                event.getBlock().setType(Material.AIR);
                event.getBlock().getLocation().getWorld().dropItem(event.getBlock().getLocation(), new ItemBuilder(Material.IRON_INGOT).setAmount(i).build());
                break;
            case GOLD_ORE:
                event.getBlock().setType(Material.AIR);
                event.getBlock().getLocation().getWorld().dropItem(event.getBlock().getLocation(), new ItemBuilder(Material.GOLD_INGOT).setAmount(i).build());
                break;
            case STONE:
                event.getBlock().setType(Material.AIR);
                event.getBlock().getLocation().getWorld().dropItem(event.getBlock().getLocation(), new ItemBuilder(Material.STONE).setAmount(i).build());
                break;
            case COPPER_ORE:
                event.getBlock().setType(Material.AIR);
                event.getBlock().getLocation().getWorld().dropItem(event.getBlock().getLocation(), new ItemBuilder(Material.COPPER_INGOT).setAmount(i).build());
                break;
            case DEEPSLATE_COPPER_ORE:
                event.getBlock().setType(Material.AIR);
                event.getBlock().getLocation().getWorld().dropItem(event.getBlock().getLocation(), new ItemBuilder(Material.COPPER_INGOT).setAmount(i).build());
                break;
            case DEEPSLATE_GOLD_ORE:
                event.getBlock().setType(Material.AIR);
                event.getBlock().getLocation().getWorld().dropItem(event.getBlock().getLocation(), new ItemBuilder(Material.GOLD_INGOT).setAmount(i).build());
                break;
            case DEEPSLATE_IRON_ORE:
                event.getBlock().setType(Material.AIR);
                event.getBlock().getLocation().getWorld().dropItem(event.getBlock().getLocation(), new ItemBuilder(Material.IRON_INGOT).setAmount(i).build());
                break;
            default:
                break;
        }
    }
}
