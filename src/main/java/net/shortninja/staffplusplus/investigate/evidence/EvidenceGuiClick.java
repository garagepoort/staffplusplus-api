package net.shortninja.staffplusplus.investigate.evidence;

import net.shortninja.staffplusplus.session.SppPlayer;
import org.bukkit.entity.Player;

public interface EvidenceGuiClick {

    void onClick(Player player, SppPlayer target, int id, Runnable goBack);

    String getType();
}
