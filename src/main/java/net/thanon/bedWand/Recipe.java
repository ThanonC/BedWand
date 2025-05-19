package net.thanon.bedWand;

import io.papermc.paper.datacomponent.item.CustomModelData;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class Recipe {
    public Recipe() {
        ItemStack stick = new ItemStack(Material.STICK);
        ItemMeta meta = stick.getItemMeta();
        meta.setCustomModelData(2);
        stick.setItemMeta(meta);

        ShapedRecipe wand = new ShapedRecipe(stick);
        wand.shape("tta", "gsg", "ll");

        wand.setIngredient('t', Material.CYAN_BED);
        wand.setIngredient('a', Material.ACACIA_PLANKS);
        wand.setIngredient('g', Material.GREEN_BED);
        wand.setIngredient('s', Material.STICK);
        wand.setIngredient('l', Material.LIME_BED);
    }
}
