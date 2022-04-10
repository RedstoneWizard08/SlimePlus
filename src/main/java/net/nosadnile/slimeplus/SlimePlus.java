package net.nosadnile.slimeplus;

import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import net.nosadnile.slimeplus.items.ItemController;
import net.nosadnile.slimeplus.util.MessageUtil;

public class SlimePlus extends JavaPlugin implements SlimefunAddon {
    public static SlimePlus INSTANCE;

    @Override
    public void onEnable() {
        // Set instance
        INSTANCE = this;

        // Log init
        MessageUtil.log("&2[&aSlimePlus&2] &aEnabled!");

        // Register items
        MessageUtil.log("&2[&aSlimePlus&2] &9Registering items...");
        ItemController.registerAllItems(this);
        MessageUtil.log("&2[&aSlimePlus&2] &9Registered items!");
    }

    @Override
    public void onDisable() {
        // Unset instance
        INSTANCE = null;

        // Log deinit
        MessageUtil.log("&2[&aSlimePlus&2] &cDisabled!");
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/RedstoneWizard08/SlimePlus/issues";
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }
}
