package net.thanon.bedWand;

import org.bukkit.Color;
import org.bukkit.GameRule;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.data.type.TNT;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Listener implements org.bukkit.event.Listener {
    @EventHandler
    public void onPlayerUse(PlayerInteractEvent e) {
        if(e.getAction().equals(Action.RIGHT_CLICK_AIR)) {
            Player p = e.getPlayer();
            ItemStack i = p.getInventory().getItemInMainHand();
            if(i.getItemMeta().getDisplayName().equals(org.bukkit.Color.RED + "xQc's wand")) {
                if(e.getPlayer().getServer().getServerTickManager().getTickRate() == 20) {
                    e.getPlayer().getServer().getServerTickManager().setTickRate(9999);
                } else {
                    e.getPlayer().getServer().getServerTickManager().setTickRate(20);
                }
            }
        }
        if(e.getAction().equals(Action.RIGHT_CLICK_AIR) && e.getPlayer().isSneaking()) {
            Player p = e.getPlayer();
            ItemStack i = p.getInventory().getItemInMainHand();
            if(i.getItemMeta().getDisplayName().equals(Color.RED + "xQc's wand")) {
                if(!e.getPlayer().getServer().getServerTickManager().isFrozen()) {
                    e.getPlayer().getServer().getServerTickManager().setFrozen(true);
                } else {
                    e.getPlayer().getServer().getServerTickManager().setFrozen(false);
                }
            }
        }
        if(e.getAction().equals(Action.LEFT_CLICK_AIR)) {
            if(e.getPlayer().getWorld().getEnvironment() != World.Environment.NORMAL) {
                e.getPlayer().getWorld().spawn(e.getPlayer().getLocation(), TNTPrimed.class);
            } else {
                e.getPlayer().getWorld().setTime(3000);
            }
        }
    }
}
