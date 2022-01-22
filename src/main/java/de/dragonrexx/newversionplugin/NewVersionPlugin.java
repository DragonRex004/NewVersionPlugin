package de.dragonrexx.newversionplugin;

import de.dragonrexx.newversionplugin.commands.ChatColorHelpCmd;
import de.dragonrexx.newversionplugin.commands.HealCmd;
import de.dragonrexx.newversionplugin.commands.permscommand.PermissionCmd;
import de.dragonrexx.newversionplugin.commands.permscommand.PermissionDisplayCmd;
import de.dragonrexx.newversionplugin.customblocks.CustomBlockFunctionListener;
import de.dragonrexx.newversionplugin.customblocks.CustomBlocksRegistry;
import de.dragonrexx.newversionplugin.customblocks.craftingengine.NewVersionPluginCraftingEngine;
import de.dragonrexx.newversionplugin.customblocks.craftingengine.NewVersionPluginCraftingInvLoader;
import de.dragonrexx.newversionplugin.customblocks.craftingengine.NewVersionPluginRecipeBookFunktions;
import de.dragonrexx.newversionplugin.customblocks.craftingengine.NewVersionPluginRecipeBookInv;
import de.dragonrexx.newversionplugin.customitems.CustomItemsFunctionListener;
import de.dragonrexx.newversionplugin.customitems.CustomItemsRegistry;
import de.dragonrexx.newversionplugin.gamesettings.*;
import de.dragonrexx.newversionplugin.listener.ColorChatListener;
import de.dragonrexx.newversionplugin.listener.JoinListener;
import de.dragonrexx.newversionplugin.mysql.MySQL;
import de.dragonrexx.newversionplugin.utils.FileBuilder;
import de.dragonrexx.newversionplugin.utils.PluginSetupInterface;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class NewVersionPlugin extends JavaPlugin implements PluginSetupInterface {
    private static NewVersionPlugin instance;
    private static String prefix = "§b[NewVersionPlugin] ";
    private static GameSettingsUiManager gameSettingsUiManager;
    private static NewVersionPluginCraftingInvLoader invLoader;
    public static FileBuilder gameSettingsConfig = new FileBuilder("plugins//NewVersionPlugin", "config.yml");
    public static FileBuilder mysqlConfig = new FileBuilder("plugins//NewVersionPlugin", "mysql.yml");
    public static NewVersionPluginCraftingEngine engine;
    public static NewVersionPluginRecipeBookInv recipeBookInv;
    public static MySQL mySQL;

    @Override
    public void onEnable() {
        Bukkit.getServer().getConsoleSender().sendMessage( prefix + "§6The Server is Successful Started");
       instance = this;
       gameSettingsUiManager = new GameSettingsUiManager();
       invLoader = new NewVersionPluginCraftingInvLoader();
       engine = new NewVersionPluginCraftingEngine();
       recipeBookInv = new NewVersionPluginRecipeBookInv();
       cmdRegistry();
       listenerRegistry();
       initConfig();
       Bukkit.getServer().getConsoleSender().sendMessage( prefix + "§6The Plugin Config is Successful created");
       initMySQLConfig();
       Bukkit.getServer().getConsoleSender().sendMessage( prefix + "§3[MySQL] §fMySQL Config is Successful created");
       initRecipes();
       gameSettingsUiManager.createUi();
       invLoader.NVP_Inv_Content();
       recipeBookInv.create();
       initMySQL();
    }

    @Override
    public void onDisable() {
        saveNVPConfig();
        Bukkit.getServer().getConsoleSender().sendMessage( prefix + "§6The Plugin Config is Successful saved");
        saveMySQLConfig();
        Bukkit.getServer().getConsoleSender().sendMessage("§3[MySQL] §fMySQL Config is Successful saved");
    }

    @Override
    public void cmdRegistry() {
        getCommand("heal").setExecutor(new HealCmd());
        getCommand("permnwp").setExecutor(new PermissionCmd());
        getCommand("displayperms").setExecutor(new PermissionDisplayCmd());
        getCommand("gamesettings").setExecutor(new GameSettingsUiOpenCmd());
        getCommand("chatcolors").setExecutor(new ChatColorHelpCmd());
    }

    @Override
    public void listenerRegistry() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new JoinListener(), this);
        pluginManager.registerEvents(new ColorChatListener(), this);
        pluginManager.registerEvents(new GameSettingsUiClickListener(), this);
        pluginManager.registerEvents(new GameSettingsAktionsListener(), this);
        pluginManager.registerEvents(new CustomBlockFunctionListener(), this);
        pluginManager.registerEvents(new CustomItemsFunctionListener(), this);
        pluginManager.registerEvents(new NewVersionPluginRecipeBookFunktions(), this);
    }

    public void initRecipes(){
        new CustomItemsRegistry().emeraldPickaxe();
        new CustomItemsRegistry().furnacePickaxe();
        new CustomItemsRegistry().lapisPickaxe();
        new CustomBlocksRegistry().Ruby_Ore();
        new CustomBlocksRegistry().NVP_Crafting_Table();
    }

    public static void initConfig(){
        if(!gameSettingsConfig.exist()) {
            gameSettingsConfig.setValue("GameSettings.BreakProtection", false);
            gameSettingsConfig.setValue("GameSettings.Chat", true);
            gameSettingsConfig.setValue("GameSettings.PlaceProtection", false);
            gameSettingsConfig.setValue("GameSettings.PvP", true);
            gameSettingsConfig.setValue("GameSettings.Food", true);
            gameSettingsConfig.setValue("GameSettings.BlockPhysics", true);
            gameSettingsConfig.setValue("GameSettings.Explosions", true);
            gameSettingsConfig.setValue("GameSettings.EntitySpawn", true);
            gameSettingsConfig.save();
        }
    }

    public static void initMySQLConfig(){
        if(!mysqlConfig.exist()){
            mysqlConfig.setValue("MySQL.Host", "localhost");
            mysqlConfig.setValue("MySQL.Port", 3306);
            mysqlConfig.setValue("MySQL.DataBase", "testdatabase");
            mysqlConfig.setValue("MySQL.User", "Minecraft");
            mysqlConfig.setValue("MySQL.Password", "minecraft");
            mysqlConfig.save();
        }
    }

    public static void saveNVPConfig(){
        if(gameSettingsConfig.exist()){
            gameSettingsConfig.setValue("GameSettings.BreakProtection", GameSettingsAttribute.isBreakProtection());
            gameSettingsConfig.setValue("GameSettings.Chat", GameSettingsAttribute.isChat());
            gameSettingsConfig.setValue("GameSettings.PlaceProtection", GameSettingsAttribute.isPlaceProtection());
            gameSettingsConfig.setValue("GameSettings.PvP", GameSettingsAttribute.isPvp());
            gameSettingsConfig.setValue("GameSettings.Food", GameSettingsAttribute.isFood());
            gameSettingsConfig.setValue("GameSettings.BlockPhysics", GameSettingsAttribute.isBlockPhysics());
            gameSettingsConfig.setValue("GameSettings.Explosions", GameSettingsAttribute.isExplosions());
            gameSettingsConfig.setValue("GameSettings.EntitySpawn", GameSettingsAttribute.isEntitySpawn());
            gameSettingsConfig.save();
        }
    }

    public static void saveMySQLConfig(){
        if(mysqlConfig.exist()){
            mysqlConfig.setValue("MySQL.Host", mySQL.getHost());
            mysqlConfig.setValue("MySQL.Port", mySQL.getPort());
            mysqlConfig.setValue("MySQL.DataBase", mySQL.getDatabase());
            mysqlConfig.setValue("MySQL.User", mySQL.getUser());
            mysqlConfig.setValue("MySQL.Password", mySQL.getPassword());
            mysqlConfig.save();
        }
    }

    public static void initMySQL() {
        mySQL = new MySQL(mysqlConfig.getString("MySQL.Host"), mysqlConfig.getInt("MySQL.Port"),
                mysqlConfig.getString("MySQL.DataBase"), mysqlConfig.getString("MySQL.User"),
                mysqlConfig.getString("MySQL.Password"));
    }

    public static NewVersionPlugin getInstance(){return instance;}
    public static String getPrefix(){return prefix;}
    public static GameSettingsUiManager getGameSettingsUiManager(){return gameSettingsUiManager;}
    public static NewVersionPluginCraftingInvLoader getInvLoader(){return invLoader;}
    public static NewVersionPluginRecipeBookInv getRecipeBookInv(){return recipeBookInv;}
    public static MySQL getMySQL() {return mySQL;}
}
