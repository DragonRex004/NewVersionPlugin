package de.dragonrexx.newversionplugin.customblocks;

import de.dragonrexx.newversionplugin.NewVersionPlugin;
import de.dragonrexx.newversionplugin.customblocks.craftingengine.NewVersionPluginCraftingEngine;
import de.dragonrexx.newversionplugin.customblocks.craftingengine.NewVersionPluginRecipeBookInv;
import de.dragonrexx.newversionplugin.utils.DragonApi;
import de.dragonrexx.newversionplugin.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;

public class CustomBlockFunctionListener implements Listener {

    @EventHandler
    public void onRubyClickEvent(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (!(event.getAction() == Action.RIGHT_CLICK_AIR) && !(event.getAction() == Action.RIGHT_CLICK_BLOCK))
            return;
        if (event.getItem() == null)
            return;
        if (event.getItem().getItemMeta() == null)
            return;
        if (event.getItem().getItemMeta().hasCustomModelData()) {
            if (event.getItem().getItemMeta().getCustomModelData() == 100000) {
                CustomBlocks customBlocks = new CustomBlocks();
                customBlocks.spawnCustomBlock(player, "Ruby Ore", 100000, 1, "Ruby");
            }
        }
    }

    @EventHandler
    public void onRubyBreakEntity(EntityDamageByEntityEvent event) {
        if (!event.getDamager().getType().equals(EntityType.PLAYER))
            return;
        Player player = (Player) event.getDamager();
        boolean IronPickaxe = player.getInventory().getItemInMainHand().getType().equals(Material.IRON_PICKAXE);
        boolean DiamondPickaxe = player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_PICKAXE);
        boolean NetheritePickaxe = player.getInventory().getItemInMainHand().getType().equals(Material.NETHERITE_PICKAXE);
        Block block = event.getEntity().getLocation().getBlock();
        if (IronPickaxe || DiamondPickaxe || NetheritePickaxe) {
            if (event.getEntity().getType().equals(EntityType.ARMOR_STAND)) {
                if (event.getEntity().getName().equals("Ruby")) {
                    event.getEntity().remove();
                    if (block.getType().equals(Material.BARRIER)) {
                        block.setType(Material.AIR);
                        player.getWorld().dropItem(event.getEntity().getLocation(), new ItemBuilder(Material.EMERALD).setCustomModelData(10001).setName("Ruby").build());
                    }
                }
            }
        }
    }

    @EventHandler
    public void onNVP_Crafting_TableClickEvent(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (!(event.getAction() == Action.RIGHT_CLICK_AIR) && !(event.getAction() == Action.RIGHT_CLICK_BLOCK))
            return;
        if (event.getItem() == null)
            return;
        if (event.getItem().getItemMeta() == null)
            return;
        if (event.getItem().getItemMeta().hasCustomModelData()) {
            if (event.getItem().getItemMeta().getCustomModelData() == 100001) {
                CustomBlocks customBlocks = new CustomBlocks();
                customBlocks.spawnCustomBlock(player, "NewVersionPlugin Crafting Table", 100001, 1, "NVP_Crafting_Table");
            }
        }
    }

    @EventHandler
    public void onNVP_Crafting_TableBreakEntity(EntityDamageByEntityEvent event) {
        if (!event.getDamager().getType().equals(EntityType.PLAYER))
            return;
        Player player = (Player) event.getDamager();
        boolean IronPickaxe = player.getInventory().getItemInMainHand().getType().equals(Material.IRON_PICKAXE);
        boolean DiamondPickaxe = player.getInventory().getItemInMainHand().getType().equals(Material.DIAMOND_PICKAXE);
        boolean NetheritePickaxe = player.getInventory().getItemInMainHand().getType().equals(Material.NETHERITE_PICKAXE);
        Block block = event.getEntity().getLocation().getBlock();
        if (IronPickaxe || DiamondPickaxe || NetheritePickaxe) {
            if (event.getEntity().getType().equals(EntityType.ARMOR_STAND)) {
                if (event.getEntity().getName().equals("NVP_Crafting_Table")) {
                    event.getEntity().remove();
                    if (block.getType().equals(Material.BARRIER)) {
                        block.setType(Material.AIR);
                        player.getWorld().dropItem(event.getEntity().getLocation(), new ItemBuilder(Material.FEATHER).setCustomModelData(100001).setName("NewVersionPlugin Crafting Table").build());
                    }
                }
            }
        }
    }

    @EventHandler
    public void onStatueItemClickEvent(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        if (!(event.getAction() == Action.RIGHT_CLICK_AIR) && !(event.getAction() == Action.RIGHT_CLICK_BLOCK))
            return;
        if (event.getItem() == null)
            return;
        if (event.getItem().getItemMeta() == null)
            return;
        if (event.getItem().getItemMeta().hasCustomModelData()) {
            if (event.getItem().getItemMeta().getCustomModelData() == 10002) {
                CustomBlocks customBlocks = new CustomBlocks();
                customBlocks.spawnCustomStatue(player, "DragonRex Skin", 10002, 1);
            }
            if (event.getItem().getItemMeta().getCustomModelData() == 10003) {
                CustomBlocks customBlocks = new CustomBlocks();
                customBlocks.spawnCustomStatue(player, "Z0eyby Skin", 10003, 1);
            }
            if (event.getItem().getItemMeta().getCustomModelData() == 10004) {
                CustomBlocks customBlocks = new CustomBlocks();
                customBlocks.spawnCustomStatue(player, "L__Master Skin", 10004, 1);
            }
            if (event.getItem().getItemMeta().getCustomModelData() == 10005) {
                CustomBlocks customBlocks = new CustomBlocks();
                customBlocks.spawnCustomStatue(player, "Mineblocker Skin", 10005, 1);
            }
            if (event.getItem().getItemMeta().getCustomModelData() == 10006) {
                CustomBlocks customBlocks = new CustomBlocks();
                customBlocks.spawnCustomStatue(player, "Franky Skin", 10006, 1);
            }
            if (event.getItem().getItemMeta().getCustomModelData() == 10007) {
                CustomBlocks customBlocks = new CustomBlocks();
                customBlocks.spawnCustomStatue(player, "Alex Skin", 10007, 1);
            }
            if (event.getItem().getItemMeta().getCustomModelData() == 10008) {
                CustomBlocks customBlocks = new CustomBlocks();
                customBlocks.spawnCustomStatue(player, "Zomi Skin", 10008, 1);
            }
            if (event.getItem().getItemMeta().getCustomModelData() == 10009) {
                CustomBlocks customBlocks = new CustomBlocks();
                customBlocks.spawnCustomStatue(player, "Lephu Skin", 10009, 1);
            }
            if (event.getItem().getItemMeta().getCustomModelData() == 10010) {
                CustomBlocks customBlocks = new CustomBlocks();
                customBlocks.spawnCustomStatue(player, "Foxxo Skin", 10010, 1);
            }
            if (event.getItem().getItemMeta().getCustomModelData() == 10011) {
                CustomBlocks customBlocks = new CustomBlocks();
                customBlocks.spawnCustomStatue(player, "Pixel Skin", 10011, 1);
            }
            if (event.getItem().getItemMeta().getCustomModelData() == 10012) {
                CustomBlocks customBlocks = new CustomBlocks();
                customBlocks.spawnCustomStatue(player, "DevByTimo Skin", 10012, 1);
            }
        }
    }

    @EventHandler
    public void onEngine(InventoryOpenEvent event) {
        if (event.getView().getTitle().equals("NVP Crafting Table")) {
            NewVersionPlugin.engine.onRubyPickaxeTask();
            NewVersionPlugin.engine.onSkinZ0eybyTask();
            NewVersionPlugin.engine.onSkinDragonRexTask();
            NewVersionPlugin.engine.onL_MasterCraftingTask();
            NewVersionPlugin.engine.onSkinMineblockerTask();
            NewVersionPlugin.engine.onSkinFrankyTask();
            NewVersionPlugin.engine.onSkinAlexTask();
            NewVersionPlugin.engine.onSkinZomiTask();
            NewVersionPlugin.engine.onSkinLephuTask();
            NewVersionPlugin.engine.onSkinFoxxoTask();
            NewVersionPlugin.engine.onSkinPixelTask();
            NewVersionPlugin.engine.onSkinDevByTimoTask();
        }
    }

    @EventHandler
    public void onEngineClose(InventoryCloseEvent event) {
        if (event.getView().getTitle().equals("NVP Crafting Table")) {
            NewVersionPluginCraftingEngine.cancelCraftingTask(NewVersionPlugin.engine.taskIDRubyPickaxe);
            NewVersionPluginCraftingEngine.cancelCraftingTask(NewVersionPlugin.engine.onSkinDragonRexId);
            NewVersionPluginCraftingEngine.cancelCraftingTask(NewVersionPlugin.engine.onSkinZ0eybyId);
            NewVersionPluginCraftingEngine.cancelCraftingTask(NewVersionPlugin.engine.L_MasterTaskID);
            NewVersionPluginCraftingEngine.cancelCraftingTask(NewVersionPlugin.engine.mineblockerTaskID);
            NewVersionPluginCraftingEngine.cancelCraftingTask(NewVersionPlugin.engine.frankyTaskID);
            NewVersionPluginCraftingEngine.cancelCraftingTask(NewVersionPlugin.engine.alexTaskID);
            NewVersionPluginCraftingEngine.cancelCraftingTask(NewVersionPlugin.engine.zomiTaskID);
            NewVersionPluginCraftingEngine.cancelCraftingTask(NewVersionPlugin.engine.lephuTaskID);
            NewVersionPluginCraftingEngine.cancelCraftingTask(NewVersionPlugin.engine.foxxoTaskID);
            NewVersionPluginCraftingEngine.cancelCraftingTask(NewVersionPlugin.engine.pixelTaskID);
            NewVersionPluginCraftingEngine.cancelCraftingTask(NewVersionPlugin.engine.devByTimoTaskID);
        }
    }

    @EventHandler
    public void onDamageSkin(EntityDamageByEntityEvent event) {
        if (!event.getDamager().getType().equals(EntityType.PLAYER))
            return;
        Player player = (Player) event.getDamager();
        if (player.hasPermission("NewVersionPlugin.npc")) {
            if (player.getInventory().getItemInMainHand().getType().equals(Material.BEDROCK)) {
                if (event.getEntity().getType().equals(EntityType.ARMOR_STAND)) {
                    event.getEntity().remove();
                    player.sendMessage(NewVersionPlugin.getPrefix() + "§6The §3NPC §6was successful removed");
                }
            }
        }
    }

    @EventHandler
    public void onSkinDragonRexEntityClickEvent(PlayerInteractAtEntityEvent event) {
        Player player = event.getPlayer();
        Entity entity = event.getRightClicked();
        if (entity.getType().equals(EntityType.ARMOR_STAND)) {
            if (entity.getName().equals("DragonRex Skin")) {
                event.setCancelled(true);
            }
            if (entity.getName().equals("Z0eyby Skin")) {
                event.setCancelled(true);
            }
            if (entity.getName().equals("L__Master Skin")) {
                event.setCancelled(true);
            }
            if (entity.getName().equals("Mineblocker Skin")) {
                event.setCancelled(true);
            }
            if (entity.getName().equals("Franky Skin")) {
                event.setCancelled(true);
            }
            if (entity.getName().equals("alex Skin")) {
                event.setCancelled(true);
            }
            if (entity.getName().equals("zomi Skin")) {
                event.setCancelled(true);
            }
            if (entity.getName().equals("lephu Skin")) {
                event.setCancelled(true);
            }
            if (entity.getName().equals("foxxo Skin")) {
                event.setCancelled(true);
            }
            if (entity.getName().equals("pixel Skin")) {
                event.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onNVP_Crafting_TableClickEvent(PlayerInteractAtEntityEvent event) {
        Player player = event.getPlayer();
        Entity entity = event.getRightClicked();
        if (entity.getType().equals(EntityType.ARMOR_STAND)) {
            if (entity.getName().equals("NVP_Crafting_Table")) {
                DragonApi.openUi(player, NewVersionPlugin.getInvLoader().getNVP_Crafting_Table());
            }
        }
    }

    @EventHandler
    public void onNVP_Crafting_TableInvClickEvent(InventoryClickEvent event) {
        Player player = (Player) event.getWhoClicked();
        if (!event.getView().getTitle().equals("NVP Crafting Table"))
            return;
        if (event.getCurrentItem() == null)
            return;
        if (event.getCurrentItem().getType().equals(Material.GRAY_STAINED_GLASS_PANE))
            event.setCancelled(true);
        if (event.getCurrentItem().getItemMeta().getDisplayName().equals("Recipe Book")){
            player.closeInventory();
            DragonApi.openUi(player, NewVersionPlugin.getRecipeBookInv().getRecipeBook());
        }
    }

}