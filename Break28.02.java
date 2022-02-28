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
import org.bukkit.enchantments.Enchantment;

import javax.tools.Tool;


public class Break implements Listener {




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
            if (blockBroken.getType() == Material.COPPER_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack copper = new ItemStack(Material.COPPER_INGOT, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), copper);
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
                ItemStack redstone = new ItemStack(Material.REDSTONE, 3);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), redstone);
            }
            if (blockBroken.getType() == Material.LAPIS_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack dye = new ItemStack(Material.LAPIS_LAZULI, 3);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), dye);
            }
            if (blockBroken.getType() == Material.NETHER_GOLD_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack nether_gold = new ItemStack(Material.GOLD_NUGGET, 3);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), nether_gold);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_COAL_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_coal = new ItemStack(Material.COAL, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_coal);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_DIAMOND_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_diamond = new ItemStack(Material.DIAMOND, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_diamond);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_REDSTONE_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_redstone = new ItemStack(Material.REDSTONE, 3);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_redstone);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_LAPIS_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_lapis = new ItemStack(Material.LAPIS_LAZULI, 3);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_lapis);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_EMERALD_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_emerald = new ItemStack(Material.EMERALD, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_emerald);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_IRON_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_iron = new ItemStack(Material.IRON_INGOT, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_iron);
            }

            if (blockBroken.getType() == Material.EMERALD_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack emerald = new ItemStack(Material.EMERALD, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), emerald);
            }
            if (blockBroken.getType() == Material.ANCIENT_DEBRIS) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack scrap = new ItemStack(Material.NETHERITE_SCRAP, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), scrap);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_GOLD_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deepslate_gold = new ItemStack(Material.GOLD_INGOT, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deepslate_gold);
            }
            if (blockBroken.getType() == Material.NETHER_QUARTZ_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack nether_quartz_ore = new ItemStack(Material.QUARTZ, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), nether_quartz_ore);
            }

        }
        if (targetplayer.getGameMode() == GameMode.CREATIVE) {
            if (blockBroken.getType() == Material.DIAMOND_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack diamond_ore = new ItemStack(Material.DIAMOND_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), diamond_ore);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_GOLD_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deepslate_gold_ore = new ItemStack(Material.DEEPSLATE_GOLD_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deepslate_gold_ore);
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
                ItemStack redstone_ore = new ItemStack(Material.REDSTONE_ORE, 3);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), redstone_ore);
            }
            if (blockBroken.getType() == Material.LAPIS_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack dye_ore = new ItemStack(Material.LAPIS_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), dye_ore);
            }
            if (blockBroken.getType() == Material.NETHER_GOLD_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack nether_gold_ore = new ItemStack(Material.NETHER_GOLD_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), nether_gold_ore);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_COAL_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_coal_ore = new ItemStack(Material.DEEPSLATE_COAL_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_coal_ore);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_DIAMOND_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_diamond_ore = new ItemStack(Material.DEEPSLATE_DIAMOND_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_diamond_ore);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_REDSTONE_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_redstone_ore= new ItemStack(Material.DEEPSLATE_REDSTONE_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_redstone_ore);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_LAPIS_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_lapis_ore = new ItemStack(Material.DEEPSLATE_LAPIS_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_lapis_ore);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_EMERALD_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_emerald_ore = new ItemStack(Material.DEEPSLATE_EMERALD_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_emerald_ore);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_IRON_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_iron_ore = new ItemStack(Material.DEEPSLATE_IRON_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_iron_ore);
            }
            if (blockBroken.getType() == Material.EMERALD_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack emerald_ore = new ItemStack(Material.EMERALD_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), emerald_ore);
            }
            if (blockBroken.getType() == Material.ANCIENT_DEBRIS) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack scrap_ore = new ItemStack(Material.ANCIENT_DEBRIS, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), scrap_ore);
            }
            if (blockBroken.getType() == Material.COPPER_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack copper_ore = new ItemStack(Material.COPPER_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), copper_ore);
            }
            if (blockBroken.getType() == Material.NETHER_QUARTZ_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack nether_quartz_ore = new ItemStack(Material.NETHER_QUARTZ_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), nether_quartz_ore);
            }

        }

    }
    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        ItemStack stack = event.getPlayer().getInventory().getItemInMainHand();

        if (stack == null || stack.getType().name().contains("AIR")) return;
        if (stack.getType().name().contains("PICKAXE")) return;

        if (hasEnchant(stack, Enchantment.SILK_TOUCH)) {
            Block blockBroken = event.getBlock();
            Player targetplayer = event.getPlayer();
            if (blockBroken.getType() == Material.DIAMOND_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack diamond_ore_p = new ItemStack(Material.DIAMOND_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), diamond_ore_p);
            }

            if (blockBroken.getType() == Material.DEEPSLATE_GOLD_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deepslate_gold_ore_p = new ItemStack(Material.DEEPSLATE_GOLD_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deepslate_gold_ore_p);
            }
            if (blockBroken.getType() == Material.IRON_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack iron_ore_p = new ItemStack(Material.IRON_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), iron_ore_p);
            }
            if (blockBroken.getType() == Material.GOLD_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack gold_ore_p = new ItemStack(Material.GOLD_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), gold_ore_p);
            }
            if (blockBroken.getType() == Material.COAL_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack coal_ore_p = new ItemStack(Material.COAL_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), coal_ore_p);
            }
            if (blockBroken.getType() == Material.REDSTONE_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack redstone_ore_p = new ItemStack(Material.REDSTONE_ORE, 3);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), redstone_ore_p);
            }
            if (blockBroken.getType() == Material.LAPIS_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack dye_ore_p = new ItemStack(Material.LAPIS_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), dye_ore_p);
            }
            if (blockBroken.getType() == Material.NETHER_GOLD_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack nether_gold_ore_p = new ItemStack(Material.NETHER_GOLD_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), nether_gold_ore_p);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_COAL_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_coal_ore_p = new ItemStack(Material.DEEPSLATE_COAL_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_coal_ore_p);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_DIAMOND_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_diamond_ore_p = new ItemStack(Material.DEEPSLATE_DIAMOND_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_diamond_ore_p);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_REDSTONE_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_redstone_ore_p= new ItemStack(Material.DEEPSLATE_REDSTONE_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_redstone_ore_p);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_LAPIS_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_lapis_ore_p = new ItemStack(Material.DEEPSLATE_LAPIS_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_lapis_ore_p);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_EMERALD_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_emerald_ore_p = new ItemStack(Material.DEEPSLATE_EMERALD_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_emerald_ore_p);
            }
            if (blockBroken.getType() == Material.COPPER_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack copper_ore_p = new ItemStack(Material.COPPER_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), copper_ore_p);
            }
            if (blockBroken.getType() == Material.DEEPSLATE_IRON_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack deesplate_iron_ore_p = new ItemStack(Material.DEEPSLATE_IRON_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), deesplate_iron_ore_p);
            }
            if (blockBroken.getType() == Material.EMERALD_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack emerald_ore_p = new ItemStack(Material.EMERALD_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), emerald_ore_p);
            }
            if (blockBroken.getType() == Material.ANCIENT_DEBRIS) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack scrap_ore_p = new ItemStack(Material.ANCIENT_DEBRIS, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), scrap_ore_p);
            }
            if (blockBroken.getType() == Material.NETHER_QUARTZ_ORE) {
                event.setCancelled(true);
                blockBroken.setType(Material.AIR);
                ItemStack nether_quartz_p = new ItemStack(Material.NETHER_QUARTZ_ORE, 1);
                blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), nether_quartz_p);
            }

        }

    }

    public static boolean hasEnchant(ItemStack stack, Enchantment ench) {
        if (!stack.hasItemMeta()) return false;

        final ItemMeta meta = stack.getItemMeta();

        return meta.hasEnchant(ench);


    }

}
