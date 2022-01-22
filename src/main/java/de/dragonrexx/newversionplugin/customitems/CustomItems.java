package de.dragonrexx.newversionplugin.customitems;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomItems {

    private int ModelData;
    private String ItemName;
    private Material Material;
    private ItemStack ItemStack;
    private ItemMeta ItemMeta;
    private Enchantment Enchantment;
    private Enchantment Enchantment1;
    private int Level;
    private int Level1;
    private boolean AddEnchant;

    public void createCustomItem(String itemName, int modelData, Material material, Enchantment enchantment, Enchantment enchantment1, int level, int level1, boolean addEnchant) {
        this.ModelData = modelData;
        this.ItemName = itemName;
        this.Material = material;
        this.Enchantment = enchantment;
        this.Enchantment1 = enchantment1;
        this.Level = level;
        this.Level1 = level1;
        this.AddEnchant = addEnchant;
        this.ItemStack = new ItemStack(this.Material);
        this.ItemMeta = this.ItemStack.getItemMeta();
        this.ItemMeta.setCustomModelData(this.ModelData);
        this.ItemMeta.setDisplayName(this.ItemName);
        if(addEnchant){
            this.ItemMeta.addEnchant(Enchantment, Level, true);
            this.ItemMeta.addEnchant(Enchantment1, Level1, true);
        }
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



    public void setModelData(int modelData) {
        ModelData = modelData;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public void setMaterial(org.bukkit.Material material) {
        Material = material;
    }

    public void setEnchantment(org.bukkit.enchantments.Enchantment enchantment) {
        Enchantment = enchantment;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public void setEnchantment1(org.bukkit.enchantments.Enchantment enchantment1) {
        Enchantment1 = enchantment1;
    }

    public void setLevel1(int level1) {
        Level1 = level1;
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

    public org.bukkit.enchantments.Enchantment getEnchantment() {
        return Enchantment;
    }

    public org.bukkit.enchantments.Enchantment getEnchantment1() {
        return Enchantment1;
    }

    public int getLevel1() {
        return Level1;
    }

    public int getLevel() {
        return Level;
    }

    public void setItemStack(org.bukkit.inventory.ItemStack itemStack) {
        ItemStack = itemStack;
    }

    public void setItemMeta(org.bukkit.inventory.meta.ItemMeta itemMeta) {
        ItemMeta = itemMeta;
    }
}
