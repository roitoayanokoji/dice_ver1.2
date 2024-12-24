package com.github.roitoayanokoji.dice_ver12;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class DiceResultLog implements CommandExecutor {

    private final Dice_ver12 plugin;

    public DiceResultLog(Dice_ver12 plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if (command.getName().equalsIgnoreCase("dice")){

            //接続している時のダイス結果のログを残す。
            return true;
        }
        return false;
    }
}
