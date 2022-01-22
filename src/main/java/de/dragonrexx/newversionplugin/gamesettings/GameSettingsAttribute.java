package de.dragonrexx.newversionplugin.gamesettings;

import de.dragonrexx.newversionplugin.NewVersionPlugin;

public class GameSettingsAttribute {
    //Attributes
    private static boolean BreakProtection = NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.BreakProtection");
    private static boolean Chat = NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.Chat");
    private static boolean PlaceProtection = NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.PlaceProtection");
    private static boolean Pvp = NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.PvP");
    private static boolean Food = NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.Food");
    private static boolean BlockPhysics = NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.BlockPhysics");
    private static boolean Explosions = NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.Explosions");
    private static boolean EntitySpawn = NewVersionPlugin.gameSettingsConfig.getBoolean("GameSettings.EntitySpawn");

    //Setter
    public static void setBreakProtection(boolean breakProtection){
        BreakProtection = breakProtection;
    }
    public static void setChat(boolean chat) {
        Chat = chat;
    }
    public static void setPlaceProtection(boolean placeProtection){
        PlaceProtection = placeProtection;
    }
    public static void setPvp(boolean pvp){
        Pvp = pvp;
    }
    public static void setFood(boolean food) {
        Food = food;
    }
    public static void setBlockPhysics(boolean blockPysics) {
        BlockPhysics = blockPysics;
    }
    public static void setExplosions(boolean explosions) {Explosions = explosions;}
    public static void setEntitySpawn(boolean entitySpawn) {EntitySpawn = entitySpawn;}

    //Getter
    public static boolean isBreakProtection(){
        return BreakProtection;
    }
    public static boolean isChat() {
        return Chat;
    }
    public static boolean isPlaceProtection(){
        return PlaceProtection;
    }
    public static boolean isPvp(){
        return Pvp;
    }
    public static boolean isFood() {
        return Food;
    }
    public static boolean isBlockPhysics() {
        return BlockPhysics;
    }
    public static boolean isExplosions() {return Explosions;}
    public static boolean isEntitySpawn() {return EntitySpawn;}
}
