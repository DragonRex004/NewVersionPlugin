package de.dragonrexx.newversionplugin.utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class ItemBuilder {

    private ItemStack item;
    private ItemMeta itemMeta;

    public ItemBuilder(Material material) {
        item = new ItemStack(material, 1);
        itemMeta = item.getItemMeta();
    }

    public ItemBuilder setName(String name) {
        itemMeta.setDisplayName(name);
        return this;
    }

    public ItemBuilder setAmount(int amount) {
        item.setAmount(amount);
        return this;
    }

    public ItemBuilder setLore(String ... lore) {
        itemMeta.setLore(Arrays.asList(lore));
        return this;
    }


    public ItemBuilder addEnchant(Enchantment enchantment, int level, boolean see) {
        itemMeta.addEnchant(enchantment, level, see);
        return this;
    }

    public ItemBuilder setUnbreakable() {
        itemMeta.setUnbreakable(true);
        return this;
    }

    /**
     * Diese Methode setzt eine Custom Model Data auf ein Item
     * @param data
     * @return nachdem die Data gesetzt wird der ItemBuilder zurückgegeben
     */
    public ItemBuilder setCustomModelData(int data) {
        itemMeta.setCustomModelData(data);
        return this;
    }

    public ItemBuilder setLocalizedName(String name){
        itemMeta.setLocalizedName(name);
        return this;
    }

    public ItemStack build() {
        item.setItemMeta(itemMeta);
        return item;
    }
}


