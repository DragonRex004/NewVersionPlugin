package de.dragonrexx.newversionplugin.customblocks;

import de.dragonrexx.newversionplugin.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

public class CustomBlocks {

    private int ModelData;
    private String ItemName;
    private org.bukkit.Material Material;
    private org.bukkit.inventory.ItemStack ItemStack;
    private org.bukkit.inventory.meta.ItemMeta ItemMeta;

    public void createCustomBlock(String itemName, int modelData, Material material) {
        this.ModelData = modelData;
        this.ItemName = itemName;
        this.Material = material;
        this.ItemStack = new ItemStack(this.Material);
        this.ItemMeta = this.ItemStack.getItemMeta();
        this.ItemMeta.setCustomModelData(this.ModelData);
        this.ItemMeta.setDisplayName(this.ItemName);
        this.ItemStack.setItemMeta(this.ItemMeta);
    }

    public void setCustomCraftingShapedRecipe(Material slot1, Material slot2, Material slot3, Material slot4, Material slot5, Material slot6, Material slot7, Material slot8, Material slot9, ItemStack resultItem) {
        ShapedRecipe shapedRecipe = new ShapedRecipe(resultItem);
        shapedRecipe.shape("ABC", "DEF", "GHI");
        shapedRecipe.setIngredient('A', slot1);
        shapedRecipe.setIngredient('B', slot2);
        shapedRecipe.setIngredient('C', slot3);
        shapedRecipe.setIngredient('D', slot4);
        shapedRecipe.setIngredient('E', slot5);
        shapedRecipe.setIngredient('F', slot6);
        shapedRecipe.setIngredient('G', slot7);
        shapedRecipe.setIngredient('H', slot8);
        shapedRecipe.setIngredient('I', slot9);
        Bukkit.addRecipe(shapedRecipe);
    }

    public void setCustomCraftingShapelessRecipe(Material slot1, Material slot2, Material slot3, Material slot4, Material slot5, Material slot6, Material slot7, Material slot8, Material slot9, ItemStack resultItem) {
        ShapelessRecipe shapelessRecipe = new ShapelessRecipe(resultItem);
        shapelessRecipe.addIngredient(slot1);
        shapelessRecipe.addIngredient(slot2);
        shapelessRecipe.addIngredient(slot3);
        shapelessRecipe.addIngredient(slot4);
        shapelessRecipe.addIngredient(slot5);
        shapelessRecipe.addIngredient(slot6);
        shapelessRecipe.addIngredient(slot7);
        shapelessRecipe.addIngredient(slot8);
        shapelessRecipe.addIngredient(slot9);
        Bukkit.addRecipe(shapelessRecipe);
    }

    public void spawnCustomBlock(Player player, String blockname, int modelData, int loss, String blockId){
        Block block = player.getTargetBlock(null, 100);
        Location loc = block.getLocation().getBlock().getRelative(0, 1, 0).getLocation();
        Location loc2 = loc.toCenterLocation().subtract(0, 0.5, 0);
        ArmorStand armorStand = (ArmorStand) player.getWorld().spawnEntity(loc2, EntityType.ARMOR_STAND);
        FallingBlock fallingBlock = player.getWorld().spawnFallingBlock(loc2, Material.BARRIER, (byte) 0);
        armorStand.setInvisible(true);
        armorStand.setBasePlate(false);
        armorStand.setGravity(false);
        armorStand.setCustomName(blockId);
        armorStand.getEquipment().setItem(EquipmentSlot.HEAD, new ItemBuilder(Material.FEATHER).setName(blockname).setCustomModelData(modelData).build());
        if(player.getGameMode().equals(GameMode.SURVIVAL)) {
            player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - loss);
        }
    }

    public void spawnCustomStatue(Player player, String statueName, int modelData, int loss){
        Block block = player.getTargetBlock(null, 100);
        Location loc = block.getLocation().getBlock().getRelative(0, 1, 0).getLocation();
        Location loc2 = loc.toCenterLocation().subtract(0, 0.5, 0).setDirection(player.getLocation().getDirection());
        ArmorStand armorStand = (ArmorStand) player.getWorld().spawnEntity(loc2, EntityType.ARMOR_STAND);
        armorStand.setInvisible(true);
        armorStand.setBasePlate(false);
        armorStand.setGravity(false);
        armorStand.setCustomName(statueName);
        armorStand.setCustomNameVisible(true);
        armorStand.getEquipment().setItem(EquipmentSlot.HEAD, new ItemBuilder(Material.EMERALD).setName(statueName).setCustomModelData(modelData).build());
        if (player.getGameMode().equals(GameMode.SURVIVAL)) {
            player.getInventory().getItemInMainHand().setAmount(player.getInventory().getItemInMainHand().getAmount() - loss);
        }
    }

    public void setModelData(int modelData) {
        ModelData = modelData;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public void setMaterial(org.bukkit.Material material) {
        Material = material;
    }

    public int getModelData() {
        return ModelData;
    }

    public org.bukkit.Material getMaterial() {
        return Material;
    }

    public String getItemName() {
        return ItemName;
    }

    public org.bukkit.inventory.meta.ItemMeta getItemMeta() {
        return ItemMeta;
    }

    public org.bukkit.inventory.ItemStack getItemStack() {
        return ItemStack;
    }

    public void setItemStack(org.bukkit.inventory.ItemStack itemStack) {
        ItemStack = itemStack;
    }

    public void setItemMeta(org.bukkit.inventory.meta.ItemMeta itemMeta) {
        ItemMeta = itemMeta;
    }
}
