package net.shortninja.staffplusplus.session;

import java.util.UUID;

public interface IPlayerSession {
    UUID getUuid();

    String getName();

    boolean isInStaffMode();

    boolean inStaffChatMode();

    boolean isFrozen();

    boolean isVanished();

    boolean isMuted();
}
