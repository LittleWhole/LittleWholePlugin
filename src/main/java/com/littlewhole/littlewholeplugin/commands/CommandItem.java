package com.littlewhole.littlewholeplugin.commands;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.awt.*;
import java.util.Objects;

import static java.lang.Integer.parseInt;

public class CommandItem implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player p = (Player) sender;
            if (args.length == 1 || args.length == 0) {
                return false;
            }
            if (args.length >= 3) {
                p.sendMessage("§cToo many arguments! This command takes only §b2 §carguments.");
                return true;
            }
            try {
                ItemStack i = new ItemStack(Objects.requireNonNull(Material.getMaterial(args[0].toUpperCase())), parseInt(args[1]));
                p.getInventory().addItem(i);
            }
            catch (NullPointerException npe) {
                p.sendMessage("§cThat item name is invalid!");
            }
            catch (NumberFormatException nfe) {
                p.sendMessage("§cThe number you inputted is too high.");
            }
        }

        return true;
    }

}

