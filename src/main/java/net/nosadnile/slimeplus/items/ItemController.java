package net.nosadnile.slimeplus.items;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;

public class ItemController {
    public static void registerAllItems(SlimefunAddon ADDON) {
        TestingItem.TESTING_ITEM.register(ADDON);
    }
}
