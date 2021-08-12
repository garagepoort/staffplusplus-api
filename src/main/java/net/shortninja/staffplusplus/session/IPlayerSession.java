package net.shortninja.staffplusplus.session;

import java.util.Optional;
import java.util.UUID;

public interface IPlayerSession {

    UUID getUuid();

    String getName();

    boolean isFrozen();

    void setProtected(boolean aProtected);

    boolean isProtected();

    Optional<String> getActiveStaffChatChannel();

    void setActiveStaffChatChannel(String channel);

    void setUnderInvestigation(boolean underInvestigation);

    void setMuted(boolean muted);

    boolean isUnderInvestigation();

    boolean isMuted();

    boolean isVanished();
}
