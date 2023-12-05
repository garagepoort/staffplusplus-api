package net.shortninja.staffplusplus.joinmessages;

import org.bukkit.entity.Player;

import java.util.Optional;

public interface JoinMessageService {
    Optional<? extends IJoinMessageGroup> getJoinMessageGroup(Player player);
}
