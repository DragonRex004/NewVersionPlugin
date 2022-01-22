package de.dragonrexx.newversionplugin.customblocks.craftingengine;

import de.dragonrexx.newversionplugin.utils.DragonApi;
import de.dragonrexx.newversionplugin.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class NewVersionPluginCraftingInvLoader {

    private Inventory NVP_Crafting_Table = Bukkit.createInventory(null, 6*9, "NVP Crafting Table");

    public void NVP_Inv_Content(){
        DragonApi.FillBigChestMargins(NVP_Crafting_Table, Material.GRAY_STAINED_GLASS_PANE);
        NVP_Crafting_Table.setItem(37, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        NVP_Crafting_Table.setItem(38, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        NVP_Crafting_Table.setItem(39, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        NVP_Crafting_Table.setItem(40, new ItemBuilder(Material.ENCHANTED_BOOK).setName("Recipe Book").build());
        NVP_Crafting_Table.setItem(41, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        NVP_Crafting_Table.setItem(42, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        NVP_Crafting_Table.setItem(43, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        NVP_Crafting_Table.setItem(13, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        NVP_Crafting_Table.setItem(22, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        NVP_Crafting_Table.setItem(31, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
    }

    public Inventory getNVP_Crafting_Table() {
        return NVP_Crafting_Table;
    }
}
