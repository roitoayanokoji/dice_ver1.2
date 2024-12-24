package com.github.roitoayanokoji.dice_ver12;

import org.bukkit.plugin.java.JavaPlugin;

public final class Dice_ver12 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("OnEnable");

        getCommand("dice").setExecutor(new DiceCommandExecutor(this));
        getCommand("dice").setExecutor(new DiceResultLog(this));
        getCommand("dice").setExecutor(new DiceHelp(this));

        //１つのクラスに複数のCommandExecutorを使用すると最後のに上書きされるためDiceHelpしか機能しない。

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("OnDisable");
    }
}
