package net.nosadnile.slimeplus.recipes;

import org.bukkit.inventory.ItemStack;

public class SlimePlusRecipe {
    private ItemStack ITEM_1;
    private ItemStack ITEM_2;
    private ItemStack ITEM_3;
    private ItemStack ITEM_4;
    private ItemStack ITEM_5;
    private ItemStack ITEM_6;
    private ItemStack ITEM_7;
    private ItemStack ITEM_8;
    private ItemStack ITEM_9;
    private boolean IS_UNLOCKED;
    private boolean IS_HIDDEN;
    private boolean IS_SHAPELESS;

    public SlimePlusRecipe(ItemStack ITEM_1, ItemStack ITEM_2, ItemStack ITEM_3, ItemStack ITEM_4, ItemStack ITEM_5, ItemStack ITEM_6, ItemStack ITEM_7, ItemStack ITEM_8, ItemStack ITEM_9) {
        this.ITEM_1 = ITEM_1;
        this.ITEM_2 = ITEM_2;
        this.ITEM_3 = ITEM_3;
        this.ITEM_4 = ITEM_4;
        this.ITEM_5 = ITEM_5;
        this.ITEM_6 = ITEM_6;
        this.ITEM_7 = ITEM_7;
        this.ITEM_8 = ITEM_8;
        this.ITEM_9 = ITEM_9;
        this.IS_UNLOCKED = true;
        this.IS_HIDDEN = false;
        this.IS_SHAPELESS = false;
    }

    public SlimePlusRecipe(ItemStack ITEM_1, ItemStack ITEM_2, ItemStack ITEM_3, ItemStack ITEM_4, ItemStack ITEM_5, ItemStack ITEM_6, ItemStack ITEM_7, ItemStack ITEM_8, ItemStack ITEM_9, boolean IS_UNLOCKED) {
        this.ITEM_1 = ITEM_1;
        this.ITEM_2 = ITEM_2;
        this.ITEM_3 = ITEM_3;
        this.ITEM_4 = ITEM_4;
        this.ITEM_5 = ITEM_5;
        this.ITEM_6 = ITEM_6;
        this.ITEM_7 = ITEM_7;
        this.ITEM_8 = ITEM_8;
        this.ITEM_9 = ITEM_9;
        this.IS_UNLOCKED = IS_UNLOCKED;
        this.IS_HIDDEN = false;
        this.IS_SHAPELESS = false;
    }

    public SlimePlusRecipe(ItemStack ITEM_1, ItemStack ITEM_2, ItemStack ITEM_3, ItemStack ITEM_4, ItemStack ITEM_5, ItemStack ITEM_6, ItemStack ITEM_7, ItemStack ITEM_8, ItemStack ITEM_9, boolean IS_UNLOCKED, boolean IS_HIDDEN) {
        this.ITEM_1 = ITEM_1;
        this.ITEM_2 = ITEM_2;
        this.ITEM_3 = ITEM_3;
        this.ITEM_4 = ITEM_4;
        this.ITEM_5 = ITEM_5;
        this.ITEM_6 = ITEM_6;
        this.ITEM_7 = ITEM_7;
        this.ITEM_8 = ITEM_8;
        this.ITEM_9 = ITEM_9;
        this.IS_UNLOCKED = IS_UNLOCKED;
        this.IS_HIDDEN = IS_HIDDEN;
        this.IS_SHAPELESS = false;
    }

    public SlimePlusRecipe(ItemStack ITEM_1, ItemStack ITEM_2, ItemStack ITEM_3, ItemStack ITEM_4, ItemStack ITEM_5, ItemStack ITEM_6, ItemStack ITEM_7, ItemStack ITEM_8, ItemStack ITEM_9, boolean IS_UNLOCKED, boolean IS_HIDDEN, boolean IS_SHAPELESS) {
        this.ITEM_1 = ITEM_1;
        this.ITEM_2 = ITEM_2;
        this.ITEM_3 = ITEM_3;
        this.ITEM_4 = ITEM_4;
        this.ITEM_5 = ITEM_5;
        this.ITEM_6 = ITEM_6;
        this.ITEM_7 = ITEM_7;
        this.ITEM_8 = ITEM_8;
        this.ITEM_9 = ITEM_9;
        this.IS_UNLOCKED = IS_UNLOCKED;
        this.IS_HIDDEN = IS_HIDDEN;
        this.IS_SHAPELESS = IS_SHAPELESS;
    }

    public SlimePlusRecipe(ItemStack[] ITEMS) {
        this.ITEM_1 = ITEMS[0];
        this.ITEM_2 = ITEMS[1];
        this.ITEM_3 = ITEMS[2];
        this.ITEM_4 = ITEMS[3];
        this.ITEM_5 = ITEMS[4];
        this.ITEM_6 = ITEMS[5];
        this.ITEM_7 = ITEMS[6];
        this.ITEM_8 = ITEMS[7];
        this.ITEM_9 = ITEMS[8];
        this.IS_UNLOCKED = true;
        this.IS_HIDDEN = false;
        this.IS_SHAPELESS = false;
    }

    public SlimePlusRecipe(ItemStack[] ITEMS, boolean IS_UNLOCKED) {
        this.ITEM_1 = ITEMS[0];
        this.ITEM_2 = ITEMS[1];
        this.ITEM_3 = ITEMS[2];
        this.ITEM_4 = ITEMS[3];
        this.ITEM_5 = ITEMS[4];
        this.ITEM_6 = ITEMS[5];
        this.ITEM_7 = ITEMS[6];
        this.ITEM_8 = ITEMS[7];
        this.ITEM_9 = ITEMS[8];
        this.IS_UNLOCKED = IS_UNLOCKED;
        this.IS_HIDDEN = false;
        this.IS_SHAPELESS = false;
    }

    public SlimePlusRecipe(ItemStack[] ITEMS, boolean IS_UNLOCKED, boolean IS_HIDDEN) {
        this.ITEM_1 = ITEMS[0];
        this.ITEM_2 = ITEMS[1];
        this.ITEM_3 = ITEMS[2];
        this.ITEM_4 = ITEMS[3];
        this.ITEM_5 = ITEMS[4];
        this.ITEM_6 = ITEMS[5];
        this.ITEM_7 = ITEMS[6];
        this.ITEM_8 = ITEMS[7];
        this.ITEM_9 = ITEMS[8];
        this.IS_UNLOCKED = IS_UNLOCKED;
        this.IS_HIDDEN = IS_HIDDEN;
        this.IS_SHAPELESS = false;
    }

    public SlimePlusRecipe(ItemStack[] ITEMS, boolean IS_UNLOCKED, boolean IS_HIDDEN, boolean IS_SHAPELESS) {
        this.ITEM_1 = ITEMS[0];
        this.ITEM_2 = ITEMS[1];
        this.ITEM_3 = ITEMS[2];
        this.ITEM_4 = ITEMS[3];
        this.ITEM_5 = ITEMS[4];
        this.ITEM_6 = ITEMS[5];
        this.ITEM_7 = ITEMS[6];
        this.ITEM_8 = ITEMS[7];
        this.ITEM_9 = ITEMS[8];
        this.IS_UNLOCKED = IS_UNLOCKED;
        this.IS_HIDDEN = IS_HIDDEN;
        this.IS_SHAPELESS = IS_SHAPELESS;
    }

    public ItemStack[] get() {
        return new ItemStack[] { ITEM_1, ITEM_2, ITEM_3, ITEM_4, ITEM_5, ITEM_6, ITEM_7, ITEM_8, ITEM_9 };
    }

    public ItemStack getFirstItem() {
        return ITEM_1;
    }

    public ItemStack getSecondItem() {
        return ITEM_2;
    }

    public ItemStack getThirdItem() {
        return ITEM_3;
    }

    public ItemStack getFourthItem() {
        return ITEM_4;
    }

    public ItemStack getFifthItem() {
        return ITEM_5;
    }

    public ItemStack getSixthItem() {
        return ITEM_6;
    }

    public ItemStack getSeventhItem() {
        return ITEM_7;
    }

    public ItemStack getEighthItem() {
        return ITEM_8;
    }

    public ItemStack getNinthItem() {
        return ITEM_9;
    }

    public SlimePlusRecipe setFirstItem(ItemStack ITEM_1) {
        this.ITEM_1 = ITEM_1;
        return this;
    }

    public SlimePlusRecipe setSecondItem(ItemStack ITEM_2) {
        this.ITEM_2 = ITEM_2;
        return this;
    }

    public SlimePlusRecipe setThirdItem(ItemStack ITEM_3) {
        this.ITEM_3 = ITEM_3;
        return this;
    }

    public SlimePlusRecipe setFourthItem(ItemStack ITEM_4) {
        this.ITEM_4 = ITEM_4;
        return this;
    }

    public SlimePlusRecipe setFifthItem(ItemStack ITEM_5) {
        this.ITEM_5 = ITEM_5;
        return this;
    }

    public SlimePlusRecipe setSixthItem(ItemStack ITEM_6) {
        this.ITEM_6 = ITEM_6;
        return this;
    }

    public SlimePlusRecipe setSeventhItem(ItemStack ITEM_7) {
        this.ITEM_7 = ITEM_7;
        return this;
    }

    public SlimePlusRecipe setEighthItem(ItemStack ITEM_8) {
        this.ITEM_8 = ITEM_8;
        return this;
    }

    public SlimePlusRecipe setNinthItem(ItemStack ITEM_9) {
        this.ITEM_9 = ITEM_9;
        return this;
    }

    public boolean isUnlocked() {
        return IS_UNLOCKED;
    }

    public boolean isHidden() {
        return IS_HIDDEN;
    }

    public boolean isShapeless() {
        return IS_SHAPELESS;
    }

    public SlimePlusRecipe setUnlocked(boolean IS_UNLOCKED) {
        this.IS_UNLOCKED = IS_UNLOCKED;
        return this;
    }

    public SlimePlusRecipe setHidden(boolean IS_HIDDEN) {
        this.IS_HIDDEN = IS_HIDDEN;
        return this;
    }

    public SlimePlusRecipe setShapeless(boolean IS_SHAPELESS) {
        this.IS_SHAPELESS = IS_SHAPELESS;
        return this;
    }
}
