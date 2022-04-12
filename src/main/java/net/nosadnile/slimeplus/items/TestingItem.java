package net.nosadnile.slimeplus.items;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Wither;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.slimefun4.api.events.PlayerRightClickEvent;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.*;
import io.github.thebusybiscuit.slimefun4.core.handlers.BlockUseHandler;
import io.github.thebusybiscuit.slimefun4.core.handlers.ItemUseHandler;
import net.nosadnile.slimeplus.categories.SlimePlusDefaultCategory;
import net.nosadnile.slimeplus.recipes.SlimePlusRecipe;

public class TestingItem extends SlimefunItem implements Soulbound, WitherProof {
    public static SlimefunItemStack TESTING_ITEM_STACK = new SlimefunItemStack("testing_item", Material.DIAMOND_BLOCK, "&2Testing Item", "&2Pretty cool Testing Item");
    public static SlimePlusRecipe TESTING_ITEM_RECIPE = new SlimePlusRecipe(
        new ItemStack(Material.STICK, 1), null, null, null,
        null, null, null, null, null, true, false, true
    );

    public static SlimefunItem TESTING_ITEM = new TestingItem(
        SlimePlusDefaultCategory.CATEGORY_GROUP, TESTING_ITEM_STACK,
        RecipeType.ENHANCED_CRAFTING_TABLE, TESTING_ITEM_RECIPE.get()
    );

    public TestingItem(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
        super(itemGroup, item, recipeType, recipe);
    }

    @Override
    public void preRegister() {
        BlockUseHandler blockUseHandler = this::onBlockRightClick;
        addItemHandler(blockUseHandler);

        ItemUseHandler itemUseHandler = this::onItemUseRightClick;
        addItemHandler(itemUseHandler);
    }

    private void onBlockRightClick(PlayerRightClickEvent e) {
        e.cancel();
    }

    private void onItemUseRightClick(PlayerRightClickEvent e) {
        e.getPlayer().giveExpLevels(1);
    }

    @Override
    public void onAttack(Block block, Wither wither) {
        
    }
}
