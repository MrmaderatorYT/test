package com.ccs.core;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import static org.bukkit.Bukkit.getPlayer;
import org.bukkit.enchantments.Enchantment;


public class Break implements Listener {
    private final JavaPlugin plugin;

    public Break(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void BreakP(BlockBreakEvent event) {
        Block blockBroken = event.getBlock();
        Player targetplayer = event.getPlayer();
        if (targetplayer.getGameMode() == GameMode.SURVIVAL) {
            if (blockBroken.getType() == Material.DIAMOND_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack diamond = new ItemStack(Material.DIAMOND, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), diamond);
            }
            if (blockBroken.getType() == Material.IRON_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack iron = new ItemStack(Material.IRON_INGOT, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), iron);
            }
            if (blockBroken.getType() == Material.GOLD_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack gold = new ItemStack(Material.GOLD_INGOT, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), gold);
            }
            if (blockBroken.getType() == Material.COAL_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack coal = new ItemStack(Material.COAL, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), coal);
            }
            if (blockBroken.getType() == Material.REDSTONE_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack redstone = new ItemStack(Material.REDSTONE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), redstone);
            }
            if (blockBroken.getType() == Material.LAPIS_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack dye = new ItemStack(Material.LAPIS_LAZULI, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), dye);
            }

        }
        if (targetplayer.getGameMode() == GameMode.CREATIVE) {
            if (blockBroken.getType() == Material.DIAMOND_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack diamond_ore = new ItemStack(Material.DIAMOND_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), diamond_ore);
            }
            if (blockBroken.getType() == Material.IRON_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack iron_ore = new ItemStack(Material.IRON_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), iron_ore);
            }
            if (blockBroken.getType() == Material.GOLD_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack gold_ore = new ItemStack(Material.GOLD_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), gold_ore);
            }
            if (blockBroken.getType() == Material.COAL_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack coal_ore = new ItemStack(Material.COAL_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), coal_ore);
            }
            if (blockBroken.getType() == Material.REDSTONE_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack redstone_ore = new ItemStack(Material.REDSTONE_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), redstone_ore);
            }
            if (blockBroken.getType() == Material.LAPIS_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack dye_ore = new ItemStack(Material.LAPIS_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), dye_ore);
            }

        }

    }
    @EventHandler
    public void onBlockBreak(BlockBreakEvent e) {
        ItemStack stack = e.getPlayer().getInventory().getItemInMainHand();

        if (stack == null || stack.getType().name().contains("AIR")) return;
        if (!stack.getType().name().contains("PICKAXE")) return;

        if (hasEnchant(stack, Enchantment.SILK_TOUCH)) {
          BlockBreakEvent events =  null;
            Block blockBroken = events.getBlock();
            Player targetplayer = events.getPlayer();
            if (blockBroken.getType() == Material.DIAMOND_ORE) {
                events.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack diamond_ore_p = new ItemStack(Material.DIAMOND_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), diamond_ore_p);
            }
            if (blockBroken.getType() == Material.IRON_ORE) {
                events.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack iron_ore_p = new ItemStack(Material.IRON_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), iron_ore_p);
            }
            if (blockBroken.getType() == Material.GOLD_ORE) {
                events.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack gold_ore_p = new ItemStack(Material.GOLD_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), gold_ore_p);
            }
            if (blockBroken.getType() == Material.COAL_ORE) {
                events.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack coal_ore_p = new ItemStack(Material.COAL_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), coal_ore_p);
            }
            if (blockBroken.getType() == Material.REDSTONE_ORE) {
                events.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack redstone_ore_p = new ItemStack(Material.REDSTONE_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), redstone_ore_p);
            }
            if (blockBroken.getType() == Material.LAPIS_ORE) {
                events.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack dye_ore_p = new ItemStack(Material.LAPIS_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), dye_ore_p);
            }

        }
    }

    public static boolean hasEnchant(ItemStack stack, Enchantment ench) {
        if (!stack.hasItemMeta()) return false;

        final ItemMeta meta = stack.getItemMeta();

        return meta.hasEnchant(ench);
    }

}

