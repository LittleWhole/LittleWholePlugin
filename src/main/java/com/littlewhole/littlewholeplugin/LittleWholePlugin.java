package com.littlewhole.littlewholeplugin;

import com.littlewhole.littlewholeplugin.commands.*;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class LittleWholePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("LittleWhole's Plugin has been enabled!");
        this.getCommand("fly").setExecutor(new CommandFly());
        this.getCommand("item").setExecutor(new CommandItem());
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("LittleWhole's Plugin has been disabled!");
    }

    public enum Commands {
        FLY,
        ITEM
    }
}
