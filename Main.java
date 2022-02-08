package com.ccs.core;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin{
@Override
    public void onEnable(){
    System.out.println("cOre created by CyberCraft Studio");
    Bukkit.getServer().getPluginManager().registerEvents(new Break(this), this);}
@Override
    public void onDisable(){


}


}
