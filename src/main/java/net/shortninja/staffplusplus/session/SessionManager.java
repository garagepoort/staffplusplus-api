package net.shortninja.staffplusplus.session;

import java.util.Collection;
import java.util.UUID;

public interface SessionManager {

    IPlayerSession get(UUID uuid);

    Collection<? extends IPlayerSession> getAll();

    Collection<? extends IPlayerSession> getOnlineStaffMembers();
}
