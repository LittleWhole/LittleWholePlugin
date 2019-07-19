package com.littlewhole.littlewholeplugin.commands;

import org.bukkit.Color;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandFly implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (p.getAllowFlight() == true) {
                p.setAllowFlight(false);
                p.sendMessage("§bFlight disabled!");
            } else {
                p.setAllowFlight(true);
                p.sendMessage("§bFlight enabled!");
            }
        }

        return true;
    }
}
