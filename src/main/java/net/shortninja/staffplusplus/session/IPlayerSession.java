package net.shortninja.staffplusplus.session;

import net.shortninja.staffplusplus.vanish.VanishType;

import java.util.Map;
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

    boolean isInStaffMode();

    VanishType getVanishType();

    void setCanViewStyleIds(boolean canViewStyleIds);

    Map<String, Object> getSettings();

    <T> T getSetting(String key);
}
