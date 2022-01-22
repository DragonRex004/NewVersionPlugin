package de.dragonrexx.newversionplugin.customblocks.craftingengine;

import de.dragonrexx.newversionplugin.utils.DragonApi;
import de.dragonrexx.newversionplugin.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class NewVersionPluginRecipeBookInv {
    private Inventory RecipeBook = Bukkit.createInventory(null, 6*9, "Recipe Book");
    private Inventory SelectedItemDisplay = Bukkit.createInventory(null, 6*9, "Recipe Book Page");

    public void create(){
        DragonApi.FillBigChestMargins(RecipeBook, Material.GRAY_STAINED_GLASS_PANE);
        DragonApi.FillBigChestMargins(SelectedItemDisplay, Material.GRAY_STAINED_GLASS_PANE);
        SelectedItemDisplay.setItem(37, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        SelectedItemDisplay.setItem(38, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        SelectedItemDisplay.setItem(39, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        SelectedItemDisplay.setItem(40, new ItemBuilder(Material.BARRIER).setName("Back to the Recipe Book Menu").setLocalizedName("Back 1").build());
        SelectedItemDisplay.setItem(41, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        SelectedItemDisplay.setItem(42, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        SelectedItemDisplay.setItem(43, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        SelectedItemDisplay.setItem(31, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        SelectedItemDisplay.setItem(22, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        SelectedItemDisplay.setItem(13, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
        RecipeBook.setItem(10, new ItemBuilder(Material.DIAMOND_PICKAXE).setCustomModelData(1001).setName("Ruby Pickaxe").build());
        RecipeBook.setItem(11, new ItemBuilder(Material.EMERALD).setName("Skin DragonRex").setCustomModelData(10002).build());
        RecipeBook.setItem(12, new ItemBuilder(Material.EMERALD).setName("Skin Z0eyby").setCustomModelData(10003).build());
        RecipeBook.setItem(13, new ItemBuilder(Material.EMERALD).setName("Skin L__Master").setCustomModelData(10004).build());
        RecipeBook.setItem(14, new ItemBuilder(Material.EMERALD).setName("Skin Mineblocker").setCustomModelData(10005).build());
        RecipeBook.setItem(15, new ItemBuilder(Material.EMERALD).setName("Skin Franky").setCustomModelData(10006).build());
        RecipeBook.setItem(16, new ItemBuilder(Material.EMERALD).setName("Skin Alex").setCustomModelData(10007).build());
        RecipeBook.setItem(19, new ItemBuilder(Material.EMERALD).setName("Skin Zomi").setCustomModelData(10008).build());
        RecipeBook.setItem(20, new ItemBuilder(Material.EMERALD).setName("Skin Lephu").setCustomModelData(10009).build());
        RecipeBook.setItem(21, new ItemBuilder(Material.EMERALD).setName("Skin Foxxo").setCustomModelData(10010).build());
        RecipeBook.setItem(22, new ItemBuilder(Material.EMERALD).setName("Skin Pixel").setCustomModelData(10011).build());
    }

    public Inventory getRecipeBook() {
        return RecipeBook;
    }

    public Inventory getSelectedItemDisplay() {
        return SelectedItemDisplay;
    }
}
