package me.smokesh.task1;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);

    }

    @Override
    public void onDisable() {
    }


    @EventHandler
    public void handle(EntitySpawnEvent event) {
        if (event.getEntity().getType() == EntityType.ZOMBIE) {
            Zombie zombie = (Zombie) event.getEntity();

            zombie.getEquipment().setItemInMainHand(new ItemStack(Material.DIAMOND_SWORD));
            zombie.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
            zombie.getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
            zombie.getEquipment().setBoots(new ItemStack(Material.IRON_BOOTS));
            zombie.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));

            zombie.setCustomName("СУПЕР ЗОМБИ!");
            zombie.setCustomNameVisible(true);
            zombie.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000, 2));
        }
    }
}
