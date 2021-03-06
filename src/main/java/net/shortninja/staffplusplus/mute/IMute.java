package net.shortninja.staffplusplus.mute;

import java.time.ZonedDateTime;
import java.util.UUID;

public interface IMute {

    int getId();

    Long getCreationTimestamp();

    ZonedDateTime getCreationDate();

    String getReason();

    String getTargetName();

    UUID getTargetUuid();

    String getIssuerName();

    UUID getIssuerUuid();

    String getUnmutedByName();

    UUID getUnmutedByUuid();

    Long getEndTimestamp();

    ZonedDateTime getEndDate();

    String getUnmuteReason();

    String getHumanReadableDuration();

    String getServerName();
}
