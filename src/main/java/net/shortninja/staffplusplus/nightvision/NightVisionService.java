package net.shortninja.staffplusplus.nightvision;

import org.bukkit.entity.Player;

public interface NightVisionService {

    void turnOnNightVision(String initiator, Player player);

    void turnOffNightVision(String initiator, Player player);
}
