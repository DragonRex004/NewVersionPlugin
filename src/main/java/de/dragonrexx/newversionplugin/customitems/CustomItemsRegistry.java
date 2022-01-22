package de.dragonrexx.newversionplugin.customitems;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class CustomItemsRegistry {

    public void emeraldPickaxe(){
        CustomItems emeraldPickaxe = new CustomItems();
        emeraldPickaxe.createCustomItem("§a§lEmerald Pickaxe", 1004, Material.DIAMOND_PICKAXE, Enchantment.DIG_SPEED, Enchantment.DURABILITY, 10, 1, true);
        emeraldPickaxe.setCustomCraftingShapedRecipe(Material.EMERALD, Material.EMERALD, Material.EMERALD, Material.AIR, Material.STICK,
                Material.AIR, Material.AIR, Material.STICK, Material.AIR, emeraldPickaxe.getItemStack());
    }

    public void furnacePickaxe() {
        CustomItems furnacePickaxe = new CustomItems();
        furnacePickaxe.createCustomItem("§c§lFurnace Pickaxe", 1003, Material.DIAMOND_PICKAXE, null, null , 0, 0, false);
        furnacePickaxe.setCustomCraftingShapedRecipe(Material.FURNACE, Material.FURNACE, Material.FURNACE, Material.AIR, Material.STICK,
                Material.AIR, Material.AIR, Material.STICK, Material.AIR, furnacePickaxe.getItemStack());
    }

    public void lapisPickaxe() {
        CustomItems lapisPickaxe = new CustomItems();
        lapisPickaxe.createCustomItem("§1§lLapis Pickaxe", 1002, Material.DIAMOND_PICKAXE, Enchantment.DIG_SPEED, Enchantment.LOOT_BONUS_BLOCKS, 5, 10, true);
        lapisPickaxe.setCustomCraftingShapedRecipe(Material.LAPIS_LAZULI, Material.LAPIS_LAZULI, Material.LAPIS_LAZULI, Material.AIR, Material.STICK,
                Material.AIR, Material.AIR, Material.STICK, Material.AIR, lapisPickaxe.getItemStack());
    }
}
