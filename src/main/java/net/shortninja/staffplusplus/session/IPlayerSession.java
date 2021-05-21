package net.shortninja.staffplusplus.session;

import java.util.Optional;
import java.util.UUID;

public interface IPlayerSession {
    UUID getUuid();

    String getName();

    boolean isInStaffMode();

    Optional<String> getActiveStaffChatChannel();

    boolean isFrozen();

    boolean isVanished();

    boolean isMuted();
}
