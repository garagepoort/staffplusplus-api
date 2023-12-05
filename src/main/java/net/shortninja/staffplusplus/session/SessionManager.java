package net.shortninja.staffplusplus.session;

import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.UUID;

public interface SessionManager {

    @Deprecated
    IPlayerSession get(UUID uuid);

    IPlayerSession get(Player player);

    Collection<? extends IPlayerSession> getAll();

    Collection<? extends IPlayerSession> getOnlineStaffMembers();

    boolean has(UUID uuid);
}
