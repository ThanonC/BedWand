package net.thanon.bedWand;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.*;

public final class BedWand extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Listener(), this);
        ItemStack stick = new ItemStack(Material.STICK);
        ItemMeta meta = stick.getItemMeta();
        meta.setCustomModelData(2);
        meta.setDisplayName(Color.RED + "xQc's wand");
        stick.setItemMeta(meta);

        NamespacedKey key = new NamespacedKey(this, "custom_recipe");
        ShapedRecipe wand = new ShapedRecipe(key, stick);
        wand.shape("tta", "gsg", "lls");

        wand.setIngredient('t', Material.CYAN_BED);
        wand.setIngredient('a', Material.ACACIA_PLANKS);
        wand.setIngredient('g', Material.GREEN_BED);
        wand.setIngredient('s', Material.STICK);
        wand.setIngredient('l', Material.LIME_BED);

        Bukkit.addRecipe(wand);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
