package net.shortninja.staffplusplus.staffmode;

import net.shortninja.staffplusplus.vanish.VanishType;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

import java.util.UUID;

public interface IModeData {

    UUID getUuid();

    ItemStack[] getPlayerInventory();

    Location getPreviousLocation();

    boolean hasFlight();

    GameMode getGameMode();

    VanishType getVanishType();

    float getXp();

    int getFireTicks();
}
