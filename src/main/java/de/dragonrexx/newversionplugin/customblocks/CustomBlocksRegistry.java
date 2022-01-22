package de.dragonrexx.newversionplugin.customblocks;
import org.bukkit.Material;

public class CustomBlocksRegistry {

    public void Ruby_Ore(){
        CustomBlocks rubyore = new CustomBlocks();
        rubyore.createCustomBlock("Ruby Ore", 100000, Material.FEATHER);
        rubyore.setCustomCraftingShapedRecipe(Material.REDSTONE, Material.STONE, Material.REDSTONE, Material.STONE, Material.STONE, Material.STONE, Material.REDSTONE, Material.STONE, Material.REDSTONE, rubyore.getItemStack());
    }

    public void NVP_Crafting_Table(){
        CustomBlocks NVP_Table = new CustomBlocks();
        NVP_Table.createCustomBlock("NewVersionPlugin Crafting Table", 100001, Material.FEATHER);
        NVP_Table.setCustomCraftingShapedRecipe(Material.IRON_INGOT, Material.IRON_INGOT, Material.REDSTONE_TORCH, Material.PISTON, Material.REDSTONE_BLOCK, Material.PISTON, Material.REDSTONE, Material.OBSERVER, Material.COPPER_INGOT, NVP_Table.getItemStack());
    }
}
