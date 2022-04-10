package net.nosadnile.slimeplus.events;

import java.net.http.WebSocket.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import net.nosadnile.slimeplus.gui.SlimePlusGUI;
import net.nosadnile.slimeplus.gui.SlimePlusQuestGUI;

public class InventoryClickEventImpl implements Listener {
    @EventHandler
    public void onInventoryClick(InventoryClickEvent e) {
        Inventory inventory = e.getClickedInventory();
        SlimePlusInventoryClickEvent eventDispatch = new SlimePlusInventoryClickEvent(
                e.getAction(),
                e.getClick(),
                e.getClickedInventory(),
                e.getCurrentItem(),
                e.getCursor(),
                e.getEventName(),
                e.getHotbarButton(),
                e.getInventory(),
                e.getRawSlot(),
                e.getResult(),
                e.getSlot(),
                e.getSlotType(),
                e.getView(),
                e.getViewers(),
                e.getWhoClicked()
        );

        // If it is a SlimePlus GUI, cancel it
        if(inventory instanceof SlimePlusGUI) e.setCancelled(true);
        
        if(inventory instanceof SlimePlusQuestGUI)
            ((SlimePlusQuestGUI) inventory).onInventoryClick(eventDispatch);
    }
}
