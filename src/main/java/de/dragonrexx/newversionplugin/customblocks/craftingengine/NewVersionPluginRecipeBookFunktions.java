package de.dragonrexx.newversionplugin.customblocks.craftingengine;

import de.dragonrexx.newversionplugin.NewVersionPlugin;
import de.dragonrexx.newversionplugin.utils.DragonApi;
import de.dragonrexx.newversionplugin.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class NewVersionPluginRecipeBookFunktions implements Listener {

    private Inventory selectedItemDisplay = NewVersionPlugin.getRecipeBookInv().getSelectedItemDisplay();
    private ItemStack ruby = new ItemBuilder(Material.EMERALD).setCustomModelData(10001).setName("Ruby").build();

    @EventHandler
    public void onRecipeBookClickEvent(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        String arg = event.getCurrentItem().getItemMeta().getDisplayName();
        if(event.getCurrentItem() == null)
            return;
       if(event.getView().getTitle().equals("Recipe Book")){

            switch (arg){
                case "Ruby Pickaxe":
                    player.closeInventory();
                    DragonApi.openUi(player, NewVersionPlugin.getRecipeBookInv().getSelectedItemDisplay());
                    selectedItemDisplay.setItem(10, ruby);
                    selectedItemDisplay.setItem(11, ruby);
                    selectedItemDisplay.setItem(12, ruby);
                    selectedItemDisplay.setItem(20, new ItemStack(Material.STICK));
                    selectedItemDisplay.setItem(29, new ItemStack(Material.STICK));
                    selectedItemDisplay.setItem(24, new ItemBuilder(Material.DIAMOND_PICKAXE).setCustomModelData(1001).setName("Ruby Pickaxe").build());
                    break;
                case "Skin DragonRex":
                    player.closeInventory();
                    DragonApi.openUi(player, NewVersionPlugin.getRecipeBookInv().getSelectedItemDisplay());
                    selectedItemDisplay.setItem(11, new ItemStack(Material.ENDER_EYE));
                    selectedItemDisplay.setItem(19, ruby);
                    selectedItemDisplay.setItem(21, ruby);
                    selectedItemDisplay.setItem(20, new ItemStack(Material.COAL_BLOCK));
                    selectedItemDisplay.setItem(29, new ItemStack(Material.COAL_BLOCK));
                    selectedItemDisplay.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin DragonRex").setCustomModelData(10002).build());
                    break;
                case "Skin Z0eyby":
                    player.closeInventory();
                    DragonApi.openUi(player, NewVersionPlugin.getRecipeBookInv().getSelectedItemDisplay());
                    selectedItemDisplay.setItem(11, new ItemStack(Material.AMETHYST_SHARD));
                    selectedItemDisplay.setItem(19, ruby);
                    selectedItemDisplay.setItem(21, ruby);
                    selectedItemDisplay.setItem(20, new ItemStack(Material.COAL_BLOCK));
                    selectedItemDisplay.setItem(29, new ItemStack(Material.COAL_BLOCK));
                    selectedItemDisplay.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin Z0eyby").setCustomModelData(10003).build());
                    break;
                case "Skin L__Master":
                    player.closeInventory();
                    DragonApi.openUi(player, NewVersionPlugin.getRecipeBookInv().getSelectedItemDisplay());
                    selectedItemDisplay.setItem(11, new ItemStack(Material.EMERALD));
                    selectedItemDisplay.setItem(19, ruby);
                    selectedItemDisplay.setItem(21, ruby);
                    selectedItemDisplay.setItem(20, new ItemStack(Material.COAL_BLOCK));
                    selectedItemDisplay.setItem(29, new ItemStack(Material.COAL_BLOCK));
                    selectedItemDisplay.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin L__Master").setCustomModelData(10004).build());
                    break;
                case "Skin Mineblocker":
                    player.closeInventory();
                    DragonApi.openUi(player, NewVersionPlugin.getRecipeBookInv().getSelectedItemDisplay());
                    selectedItemDisplay.setItem(11, new ItemStack(Material.COAL));
                    selectedItemDisplay.setItem(19, ruby);
                    selectedItemDisplay.setItem(21, ruby);
                    selectedItemDisplay.setItem(20, new ItemStack(Material.COAL_BLOCK));
                    selectedItemDisplay.setItem(29, new ItemStack(Material.COAL_BLOCK));
                    selectedItemDisplay.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin Mineblocker").setCustomModelData(10005).build());
                    break;
                case "Skin Franky":
                    player.closeInventory();
                    DragonApi.openUi(player, NewVersionPlugin.getRecipeBookInv().getSelectedItemDisplay());
                    selectedItemDisplay.setItem(11, new ItemStack(Material.LAPIS_LAZULI));
                    selectedItemDisplay.setItem(19, ruby);
                    selectedItemDisplay.setItem(21, ruby);
                    selectedItemDisplay.setItem(20, new ItemStack(Material.COAL_BLOCK));
                    selectedItemDisplay.setItem(29, new ItemStack(Material.COAL_BLOCK));
                    selectedItemDisplay.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin Franky").setCustomModelData(10006).build());
                    break;
                case "Skin Alex":
                    player.closeInventory();
                    DragonApi.openUi(player, NewVersionPlugin.getRecipeBookInv().getSelectedItemDisplay());
                    selectedItemDisplay.setItem(11, new ItemStack(Material.DIAMOND));
                    selectedItemDisplay.setItem(19, ruby);
                    selectedItemDisplay.setItem(21, ruby);
                    selectedItemDisplay.setItem(20, new ItemStack(Material.COAL_BLOCK));
                    selectedItemDisplay.setItem(29, new ItemStack(Material.COAL_BLOCK));
                    selectedItemDisplay.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin Alex").setCustomModelData(10007).build());
                    break;
                case "Skin Zomi":
                    player.closeInventory();
                    DragonApi.openUi(player, NewVersionPlugin.getRecipeBookInv().getSelectedItemDisplay());
                    selectedItemDisplay.setItem(11, new ItemStack(Material.REDSTONE));
                    selectedItemDisplay.setItem(19, ruby);
                    selectedItemDisplay.setItem(21, ruby);
                    selectedItemDisplay.setItem(20, new ItemStack(Material.COAL_BLOCK));
                    selectedItemDisplay.setItem(29, new ItemStack(Material.COAL_BLOCK));
                    selectedItemDisplay.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin Zomi").setCustomModelData(10008).build());
                    break;
            }


           if(event.getCurrentItem().getType().equals(Material.GRAY_STAINED_GLASS_PANE))
               event.setCancelled(true);
       }

       if(event.getView().getTitle().equals("Recipe Book Page")){
            if(event.getCurrentItem().getType().equals(Material.BARRIER)){
                selectedItemDisplay.clear();
                DragonApi.FillBigChestMargins(selectedItemDisplay, Material.GRAY_STAINED_GLASS_PANE);
                selectedItemDisplay.setItem(37, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
                selectedItemDisplay.setItem(38, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
                selectedItemDisplay.setItem(39, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
                selectedItemDisplay.setItem(40, new ItemBuilder(Material.BARRIER).setName("Back to the Recipe Book Menu").setLocalizedName("Back 1").build());
                selectedItemDisplay.setItem(41, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
                selectedItemDisplay.setItem(42, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
                selectedItemDisplay.setItem(43, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
                selectedItemDisplay.setItem(31, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
                selectedItemDisplay.setItem(22, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
                selectedItemDisplay.setItem(13, new ItemStack(Material.GRAY_STAINED_GLASS_PANE));
                player.closeInventory();
                DragonApi.openUi(player, NewVersionPlugin.getRecipeBookInv().getRecipeBook());
            }

            if(event.getCurrentItem() !=null)
                event.setCancelled(true);
       }
    }

}
