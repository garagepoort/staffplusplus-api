package net.shortninja.staffplusplus.staffmode;

import net.shortninja.staffplusplus.vanish.VanishType;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IModeData {

    UUID getUuid();

    ItemStack[] getPlayerInventory();

    Optional<Location> getPreviousLocation();

    boolean hasFlight();

    GameMode getGameMode();

    VanishType getVanishType();

    float getXp();

    int getFireTicks();

    List<PotionEffect> getPotionEffects();
}
