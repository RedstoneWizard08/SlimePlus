package net.nosadnile.slimeplus.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import net.nosadnile.slimeplus.categories.SlimePlusDefaultCategory;
import net.nosadnile.slimeplus.recipes.SlimePlusRecipe;

public class TestingItem {
    public static SlimefunItemStack TESTING_ITEM_STACK = new SlimefunItemStack("testing_item", Material.DIAMOND, "&2Testing Item", "&2Pretty cool Testing Item");
    public static SlimePlusRecipe TESTING_ITEM_RECIPE = new SlimePlusRecipe(
        new ItemStack(Material.STICK, 1), null, null, null,
        null, null, null, null, null, true, false, true
    );

    public static SlimefunItem TESTING_ITEM = new SlimefunItem(
        SlimePlusDefaultCategory.CATEGORY_GROUP, TESTING_ITEM_STACK,
        RecipeType.ENHANCED_CRAFTING_TABLE, TESTING_ITEM_RECIPE.get()
    );

    public static void register(SlimefunAddon ADDON) {
        TESTING_ITEM.register(ADDON);
    }
}
