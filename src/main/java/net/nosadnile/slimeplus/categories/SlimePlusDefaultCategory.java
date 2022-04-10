package net.nosadnile.slimeplus.categories;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import net.nosadnile.slimeplus.SlimePlus;

public class SlimePlusDefaultCategory {
    public static NamespacedKey CATEGORY_ID = new NamespacedKey(SlimePlus.INSTANCE, "default");
    public static CustomItemStack CATEGORY_ITEM = new CustomItemStack(Material.SLIME_BALL, "&2SlimePlus");
    public static ItemGroup CATEGORY_GROUP = new ItemGroup(CATEGORY_ID, CATEGORY_ITEM);
}
