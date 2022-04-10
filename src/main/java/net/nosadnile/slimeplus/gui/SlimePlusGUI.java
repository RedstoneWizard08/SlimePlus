package net.nosadnile.slimeplus.gui;

import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

import net.nosadnile.slimeplus.events.SlimePlusInventoryClickEvent;

public class SlimePlusGUI implements InventoryHolder {
    @Override
    public Inventory getInventory() {
        return null;
    }

    /**
     * Handler for when the inventory is clicked.
     * @param e The event data.
     */
    public void onInventoryClick(SlimePlusInventoryClickEvent e) {}
}
