package net.nosadnile.slimeplus;

import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import net.nosadnile.slimeplus.items.ItemController;

public class SlimePlus extends JavaPlugin implements SlimefunAddon {
    public static SlimePlus INSTANCE;

    @Override
    public void onEnable() {
        INSTANCE = this;
        ItemController.registerAllItems(this);
    }

    @Override
    public void onDisable() {
        INSTANCE = null;
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
