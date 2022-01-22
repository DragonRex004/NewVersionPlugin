package de.dragonrexx.newversionplugin.customblocks.craftingengine;

import de.dragonrexx.newversionplugin.NewVersionPlugin;
import de.dragonrexx.newversionplugin.utils.ItemBuilder;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;

public class NewVersionPluginCraftingEngine {

    public int taskIDRubyPickaxe;
    public int onSkinDragonRexId;
    public int onSkinZ0eybyId;
    public int L_MasterTaskID;
    public int mineblockerTaskID;
    public int frankyTaskID;
    public int alexTaskID;
    public int zomiTaskID;
    public int lephuTaskID;
    public int foxxoTaskID;
    public int pixelTaskID;
    public int devByTimoTaskID;

    public static void cancelCraftingTask(int TaskId){Bukkit.getScheduler().cancelTask(TaskId);}

    public void onRubyPickaxeTask(){
        taskIDRubyPickaxe = Bukkit.getScheduler().scheduleSyncRepeatingTask(NewVersionPlugin.getInstance(), new Runnable() {
            @Override
            public void run() {
                //----RubyPickaxeCraftingRecipe----
                Inventory inventory = NewVersionPlugin.getInvLoader().getNVP_Crafting_Table();

                if(inventory.getItem(10) == null)
                    return;
                if(!(inventory.getItem(10).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(11) == null)
                    return;
                if(!(inventory.getItem(11).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(12) == null)
                    return;
                if(!(inventory.getItem(12).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(20) == null)
                    return;
                if(!(inventory.getItem(20).getType().equals(Material.STICK)))
                    return;
                if(inventory.getItem(29) == null)
                    return;
                if(!(inventory.getItem(29).getType().equals(Material.STICK)))
                    return;

                inventory.setItem(24, new ItemBuilder(Material.DIAMOND_PICKAXE).setCustomModelData(1001).setName("Ruby Pickaxe").build());
                inventory.getItem(10).setAmount(inventory.getItem(10).getAmount() -1);
                inventory.getItem(11).setAmount(inventory.getItem(11).getAmount() -1);
                inventory.getItem(12).setAmount(inventory.getItem(12).getAmount() -1);
                inventory.getItem(20).setAmount(inventory.getItem(20).getAmount() -1);
                inventory.getItem(29).setAmount(inventory.getItem(29).getAmount() -1);
            }
        }, 0, 20);
    }

    public void onSkinDragonRexTask(){
        onSkinDragonRexId = Bukkit.getScheduler().scheduleSyncRepeatingTask(NewVersionPlugin.getInstance(), new Runnable() {
            @Override
            public void run() {
                //----SkinDragonRexCraftingRecipe----
                Inventory inventory = NewVersionPlugin.getInvLoader().getNVP_Crafting_Table();

                if(inventory.getItem(11) == null)
                    return;
                if(!(inventory.getItem(11).getType().equals(Material.ENDER_EYE)))
                    return;
                if(inventory.getItem(19) == null)
                    return;
                if(!(inventory.getItem(19).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(20) == null)
                    return;
                if(!(inventory.getItem(20).getType().equals(Material.COAL_BLOCK)))
                    return;
                if(inventory.getItem(21) == null)
                    return;
                if(!(inventory.getItem(21).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(29) == null)
                    return;
                if(!(inventory.getItem(29).getType().equals(Material.COAL_BLOCK)))
                    return;

                inventory.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin DragonRex").setCustomModelData(10002).build());
                inventory.getItem(11).setAmount(inventory.getItem(11).getAmount() -1);
                inventory.getItem(19).setAmount(inventory.getItem(19).getAmount() -1);
                inventory.getItem(20).setAmount(inventory.getItem(20).getAmount() -1);
                inventory.getItem(21).setAmount(inventory.getItem(21).getAmount() -1);
                inventory.getItem(29).setAmount(inventory.getItem(29).getAmount() -1);
            }
        }, 0, 20);
    }

    public void onSkinZ0eybyTask(){
        onSkinDragonRexId = Bukkit.getScheduler().scheduleSyncRepeatingTask(NewVersionPlugin.getInstance(), new Runnable() {
            @Override
            public void run() {
                //----SkinDragonRexCraftingRecipe----
                Inventory inventory = NewVersionPlugin.getInvLoader().getNVP_Crafting_Table();

                if(inventory.getItem(11) == null)
                    return;
                if(!(inventory.getItem(11).getType().equals(Material.AMETHYST_SHARD)))
                    return;
                if(inventory.getItem(19) == null)
                    return;
                if(!(inventory.getItem(19).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(20) == null)
                    return;
                if(!(inventory.getItem(20).getType().equals(Material.COAL_BLOCK)))
                    return;
                if(inventory.getItem(21) == null)
                    return;
                if(!(inventory.getItem(21).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(29) == null)
                    return;
                if(!(inventory.getItem(29).getType().equals(Material.COAL_BLOCK)))
                    return;

                inventory.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin Z0eyby").setCustomModelData(10003).build());
                inventory.getItem(11).setAmount(inventory.getItem(11).getAmount() -1);
                inventory.getItem(19).setAmount(inventory.getItem(19).getAmount() -1);
                inventory.getItem(20).setAmount(inventory.getItem(20).getAmount() -1);
                inventory.getItem(21).setAmount(inventory.getItem(21).getAmount() -1);
                inventory.getItem(29).setAmount(inventory.getItem(29).getAmount() -1);
            }
        }, 0, 20);
    }

    public void onL_MasterCraftingTask(){
        L_MasterTaskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(NewVersionPlugin.getInstance(), new Runnable() {
            @Override
            public void run() {
                //----L_MasterCraftingTask----
                Inventory inventory = NewVersionPlugin.getInvLoader().getNVP_Crafting_Table();

                if(inventory.getItem(11) == null)
                    return;
                if(!(inventory.getItem(11).getType().equals(Material.EMERALD)))
                    return;
                if(inventory.getItem(19) == null)
                    return;
                if(!(inventory.getItem(19).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(20) == null)
                    return;
                if(!(inventory.getItem(20).getType().equals(Material.COAL_BLOCK)))
                    return;
                if(inventory.getItem(21) == null)
                    return;
                if(!(inventory.getItem(21).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(29) == null)
                    return;
                if(!(inventory.getItem(29).getType().equals(Material.COAL_BLOCK)))
                    return;

                inventory.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin L__Master").setCustomModelData(10004).build());
                inventory.getItem(11).setAmount(inventory.getItem(11).getAmount() -1);
                inventory.getItem(19).setAmount(inventory.getItem(19).getAmount() -1);
                inventory.getItem(20).setAmount(inventory.getItem(20).getAmount() -1);
                inventory.getItem(21).setAmount(inventory.getItem(21).getAmount() -1);
                inventory.getItem(29).setAmount(inventory.getItem(29).getAmount() -1);
            }
        }, 0, 20);
    }

    public void onSkinMineblockerTask(){
        mineblockerTaskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(NewVersionPlugin.getInstance(), new Runnable() {
            @Override
            public void run() {
                //----Minblocker-Crafting-Task----
                Inventory inventory = NewVersionPlugin.getInvLoader().getNVP_Crafting_Table();

                if(inventory.getItem(11) == null)
                    return;
                if(!(inventory.getItem(11).getType().equals(Material.COAL)))
                    return;
                if(inventory.getItem(19) == null)
                    return;
                if(!(inventory.getItem(19).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(20) == null)
                    return;
                if(!(inventory.getItem(20).getType().equals(Material.COAL_BLOCK)))
                    return;
                if(inventory.getItem(21) == null)
                    return;
                if(!(inventory.getItem(21).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(29) == null)
                    return;
                if(!(inventory.getItem(29).getType().equals(Material.COAL_BLOCK)))
                    return;

                inventory.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin Mineblocker").setCustomModelData(10005).build());
                inventory.getItem(11).setAmount(inventory.getItem(11).getAmount() -1);
                inventory.getItem(19).setAmount(inventory.getItem(19).getAmount() -1);
                inventory.getItem(20).setAmount(inventory.getItem(20).getAmount() -1);
                inventory.getItem(21).setAmount(inventory.getItem(21).getAmount() -1);
                inventory.getItem(29).setAmount(inventory.getItem(29).getAmount() -1);
            }
        }, 0, 20);
    }

    public void onSkinFrankyTask(){
        frankyTaskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(NewVersionPlugin.getInstance(), new Runnable() {
            @Override
            public void run() {
                //----Franky-Crafting-Task----
                Inventory inventory = NewVersionPlugin.getInvLoader().getNVP_Crafting_Table();

                if(inventory.getItem(11) == null)
                    return;
                if(!(inventory.getItem(11).getType().equals(Material.LAPIS_LAZULI)))
                    return;
                if(inventory.getItem(19) == null)
                    return;
                if(!(inventory.getItem(19).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(20) == null)
                    return;
                if(!(inventory.getItem(20).getType().equals(Material.COAL_BLOCK)))
                    return;
                if(inventory.getItem(21) == null)
                    return;
                if(!(inventory.getItem(21).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(29) == null)
                    return;
                if(!(inventory.getItem(29).getType().equals(Material.COAL_BLOCK)))
                    return;

                inventory.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin Franky").setCustomModelData(10006).build());
                inventory.getItem(11).setAmount(inventory.getItem(11).getAmount() -1);
                inventory.getItem(19).setAmount(inventory.getItem(19).getAmount() -1);
                inventory.getItem(20).setAmount(inventory.getItem(20).getAmount() -1);
                inventory.getItem(21).setAmount(inventory.getItem(21).getAmount() -1);
                inventory.getItem(29).setAmount(inventory.getItem(29).getAmount() -1);
            }
        }, 0, 20);
    }

    public void onSkinAlexTask(){
        alexTaskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(NewVersionPlugin.getInstance(), new Runnable() {
            @Override
            public void run() {
                //----Alex-Crafting-Task----
                Inventory inventory = NewVersionPlugin.getInvLoader().getNVP_Crafting_Table();

                if(inventory.getItem(11) == null)
                    return;
                if(!(inventory.getItem(11).getType().equals(Material.DIAMOND)))
                    return;
                if(inventory.getItem(19) == null)
                    return;
                if(!(inventory.getItem(19).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(20) == null)
                    return;
                if(!(inventory.getItem(20).getType().equals(Material.COAL_BLOCK)))
                    return;
                if(inventory.getItem(21) == null)
                    return;
                if(!(inventory.getItem(21).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(29) == null)
                    return;
                if(!(inventory.getItem(29).getType().equals(Material.COAL_BLOCK)))
                    return;

                inventory.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin Alex").setCustomModelData(10007).build());
                inventory.getItem(11).setAmount(inventory.getItem(11).getAmount() -1);
                inventory.getItem(19).setAmount(inventory.getItem(19).getAmount() -1);
                inventory.getItem(20).setAmount(inventory.getItem(20).getAmount() -1);
                inventory.getItem(21).setAmount(inventory.getItem(21).getAmount() -1);
                inventory.getItem(29).setAmount(inventory.getItem(29).getAmount() -1);
            }
        }, 0, 20);
    }

    public void onSkinZomiTask(){
        zomiTaskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(NewVersionPlugin.getInstance(), new Runnable() {
            @Override
            public void run() {
                //----Zomi-Crafting-Task----
                Inventory inventory = NewVersionPlugin.getInvLoader().getNVP_Crafting_Table();

                if(inventory.getItem(11) == null)
                    return;
                if(!(inventory.getItem(11).getType().equals(Material.REDSTONE)))
                    return;
                if(inventory.getItem(19) == null)
                    return;
                if(!(inventory.getItem(19).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(20) == null)
                    return;
                if(!(inventory.getItem(20).getType().equals(Material.COAL_BLOCK)))
                    return;
                if(inventory.getItem(21) == null)
                    return;
                if(!(inventory.getItem(21).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(29) == null)
                    return;
                if(!(inventory.getItem(29).getType().equals(Material.COAL_BLOCK)))
                    return;

                inventory.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin Zomi").setCustomModelData(10008).build());
                inventory.getItem(11).setAmount(inventory.getItem(11).getAmount() -1);
                inventory.getItem(19).setAmount(inventory.getItem(19).getAmount() -1);
                inventory.getItem(20).setAmount(inventory.getItem(20).getAmount() -1);
                inventory.getItem(21).setAmount(inventory.getItem(21).getAmount() -1);
                inventory.getItem(29).setAmount(inventory.getItem(29).getAmount() -1);
            }
        }, 0, 20);
    }

    public void onSkinLephuTask(){
        lephuTaskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(NewVersionPlugin.getInstance(), new Runnable() {
            @Override
            public void run() {
                //----Lephu-Crafting-Task----
                Inventory inventory = NewVersionPlugin.getInvLoader().getNVP_Crafting_Table();

                if(inventory.getItem(11) == null)
                    return;
                if(!(inventory.getItem(11).getType().equals(Material.IRON_INGOT)))
                    return;
                if(inventory.getItem(19) == null)
                    return;
                if(!(inventory.getItem(19).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(20) == null)
                    return;
                if(!(inventory.getItem(20).getType().equals(Material.COAL_BLOCK)))
                    return;
                if(inventory.getItem(21) == null)
                    return;
                if(!(inventory.getItem(21).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(29) == null)
                    return;
                if(!(inventory.getItem(29).getType().equals(Material.COAL_BLOCK)))
                    return;

                inventory.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin Lephu").setCustomModelData(10009).build());
                inventory.getItem(11).setAmount(inventory.getItem(11).getAmount() -1);
                inventory.getItem(19).setAmount(inventory.getItem(19).getAmount() -1);
                inventory.getItem(20).setAmount(inventory.getItem(20).getAmount() -1);
                inventory.getItem(21).setAmount(inventory.getItem(21).getAmount() -1);
                inventory.getItem(29).setAmount(inventory.getItem(29).getAmount() -1);
            }
        }, 0, 20);
    }

    public void onSkinFoxxoTask(){
        foxxoTaskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(NewVersionPlugin.getInstance(), new Runnable() {
            @Override
            public void run() {
                //----Foxxo-Crafting-Task----
                Inventory inventory = NewVersionPlugin.getInvLoader().getNVP_Crafting_Table();

                if(inventory.getItem(11) == null)
                    return;
                if(!(inventory.getItem(11).getType().equals(Material.COPPER_INGOT)))
                    return;
                if(inventory.getItem(19) == null)
                    return;
                if(!(inventory.getItem(19).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(20) == null)
                    return;
                if(!(inventory.getItem(20).getType().equals(Material.COAL_BLOCK)))
                    return;
                if(inventory.getItem(21) == null)
                    return;
                if(!(inventory.getItem(21).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(29) == null)
                    return;
                if(!(inventory.getItem(29).getType().equals(Material.COAL_BLOCK)))
                    return;

                inventory.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin Foxxo").setCustomModelData(10010).build());
                inventory.getItem(11).setAmount(inventory.getItem(11).getAmount() -1);
                inventory.getItem(19).setAmount(inventory.getItem(19).getAmount() -1);
                inventory.getItem(20).setAmount(inventory.getItem(20).getAmount() -1);
                inventory.getItem(21).setAmount(inventory.getItem(21).getAmount() -1);
                inventory.getItem(29).setAmount(inventory.getItem(29).getAmount() -1);
            }
        }, 0, 20);
    }

    public void onSkinPixelTask(){
        pixelTaskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(NewVersionPlugin.getInstance(), new Runnable() {
            @Override
            public void run() {
                //----Pixel-Crafting-Task----
                Inventory inventory = NewVersionPlugin.getInvLoader().getNVP_Crafting_Table();

                if(inventory.getItem(11) == null)
                    return;
                if(!(inventory.getItem(11).getType().equals(Material.GOLD_INGOT)))
                    return;
                if(inventory.getItem(19) == null)
                    return;
                if(!(inventory.getItem(19).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(20) == null)
                    return;
                if(!(inventory.getItem(20).getType().equals(Material.COAL_BLOCK)))
                    return;
                if(inventory.getItem(21) == null)
                    return;
                if(!(inventory.getItem(21).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(29) == null)
                    return;
                if(!(inventory.getItem(29).getType().equals(Material.COAL_BLOCK)))
                    return;

                inventory.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin Pixel").setCustomModelData(10011).build());
                inventory.getItem(11).setAmount(inventory.getItem(11).getAmount() -1);
                inventory.getItem(19).setAmount(inventory.getItem(19).getAmount() -1);
                inventory.getItem(20).setAmount(inventory.getItem(20).getAmount() -1);
                inventory.getItem(21).setAmount(inventory.getItem(21).getAmount() -1);
                inventory.getItem(29).setAmount(inventory.getItem(29).getAmount() -1);
            }
        }, 0, 20);
    }

    public void onSkinDevByTimoTask(){
        devByTimoTaskID = Bukkit.getScheduler().scheduleSyncRepeatingTask(NewVersionPlugin.getInstance(), new Runnable() {
            @Override
            public void run() {
                //----DevByTimo-Crafting-Task----
                Inventory inventory = NewVersionPlugin.getInvLoader().getNVP_Crafting_Table();

                if(inventory.getItem(11) == null)
                    return;
                if(!(inventory.getItem(11).getType().equals(Material.QUARTZ)))
                    return;
                if(inventory.getItem(19) == null)
                    return;
                if(!(inventory.getItem(19).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(20) == null)
                    return;
                if(!(inventory.getItem(20).getType().equals(Material.COAL_BLOCK)))
                    return;
                if(inventory.getItem(21) == null)
                    return;
                if(!(inventory.getItem(21).getItemMeta().getCustomModelData() == 10001))
                    return;
                if(inventory.getItem(29) == null)
                    return;
                if(!(inventory.getItem(29).getType().equals(Material.COAL_BLOCK)))
                    return;

                inventory.setItem(24, new ItemBuilder(Material.EMERALD).setName("Skin DevByTimo").setCustomModelData(10012).build());
                inventory.getItem(11).setAmount(inventory.getItem(11).getAmount() -1);
                inventory.getItem(19).setAmount(inventory.getItem(19).getAmount() -1);
                inventory.getItem(20).setAmount(inventory.getItem(20).getAmount() -1);
                inventory.getItem(21).setAmount(inventory.getItem(21).getAmount() -1);
                inventory.getItem(29).setAmount(inventory.getItem(29).getAmount() -1);
            }
        }, 0, 20);
    }
}
