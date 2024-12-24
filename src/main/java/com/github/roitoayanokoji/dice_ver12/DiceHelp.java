package com.github.roitoayanokoji.dice_ver12;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DiceHelp implements CommandExecutor {

    private final Dice_ver12 plugin;

    public DiceHelp(Dice_ver12 plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (command.getName().equalsIgnoreCase("dice")){

            //DicePluginの説明
            return true;
        }
        return false;
    }
}
