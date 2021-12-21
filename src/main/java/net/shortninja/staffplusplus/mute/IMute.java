package net.shortninja.staffplusplus.mute;

import net.shortninja.staffplusplus.appeals.Appealable;

import java.time.ZonedDateTime;
import java.util.UUID;

public interface IMute extends Appealable {

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

    boolean isSoftMute();
}
