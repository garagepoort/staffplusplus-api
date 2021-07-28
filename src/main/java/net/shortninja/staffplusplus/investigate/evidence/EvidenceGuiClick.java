package net.shortninja.staffplusplus.investigate.evidence;

import org.bukkit.entity.Player;

public interface EvidenceGuiClick {

    String getType();

    String getAction(Player player, int evidenceId, String backAction);
}
