package net.nosadnile.slimeplus.events;

import java.util.List;

import org.bukkit.entity.HumanEntity;
import org.bukkit.event.Event.Result;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;

public class SlimePlusInventoryClickEvent {
    private InventoryAction action;
    private ClickType click;
    private Inventory clickedInventory;
    private ItemStack currentItem;
    private ItemStack cursor;
    private String eventName;
    private int hotbarButton;
    private Inventory inventory;
    private int rawSlot;
    private Result result;
    private int slot;
    private SlotType slotType;
    private InventoryView view;
    private List<HumanEntity> viewers;
    private HumanEntity whoClicked;

    public SlimePlusInventoryClickEvent(InventoryAction action, ClickType click, Inventory clickedInventory, ItemStack currentItem, ItemStack cursor, String eventName, int hotbarButton, Inventory inventory, int rawSlot, Result result, int slot, SlotType slotType, InventoryView view, List<HumanEntity> viewers, HumanEntity whoClicked) {
        this.action = action;
        this.click = click;
        this.clickedInventory = clickedInventory;
        this.currentItem = currentItem;
        this.cursor = cursor;
        this.eventName = eventName;
        this.hotbarButton = hotbarButton;
        this.inventory = inventory;
        this.rawSlot = rawSlot;
        this.result = result;
        this.slot = slot;
        this.slotType = slotType;
        this.view = view;
        this.viewers = viewers;
        this.whoClicked = whoClicked;
    }

    public InventoryAction getAction() {
        return this.action;
    }

    public ClickType getClick() {
        return this.click;
    }

    public Inventory getClickedInventory() {
        return this.clickedInventory;
    }

    public ItemStack getCurrentItem() {
        return this.currentItem;
    }

    public ItemStack getCursor() {
        return this.cursor;
    }

    public String getEventName() {
        return this.eventName;
    }

    public int getHotbarButton() {
        return this.hotbarButton;
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public int getRawSlot() {
        return this.rawSlot;
    }

    public Result getResult() {
        return this.result;
    }

    public int getSlot() {
        return this.slot;
    }

    public SlotType getSlotType() {
        return this.slotType;
    }

    public InventoryView getView() {
        return this.view;
    }

    public List<HumanEntity> getViewers() {
        return this.viewers;
    }

    public HumanEntity getWhoClicked() {
        return this.whoClicked;
    }
}