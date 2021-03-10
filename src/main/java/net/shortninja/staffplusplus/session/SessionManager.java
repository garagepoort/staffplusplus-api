package net.shortninja.staffplusplus.session;

import java.util.UUID;

public interface SessionManager {

    IPlayerSession get(UUID uuid);
}
