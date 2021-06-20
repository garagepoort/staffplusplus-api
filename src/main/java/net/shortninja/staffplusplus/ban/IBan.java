package net.shortninja.staffplusplus.ban;

import java.time.ZonedDateTime;
import java.util.UUID;

public interface IBan {

    int getId();

    Long getCreationTimestamp();

    ZonedDateTime getCreationDate();

    String getReason();

    String getTargetName();

    UUID getTargetUuid();

    String getIssuerName();

    UUID getIssuerUuid();

    String getUnbannedByName();

    UUID getUnbannedByUuid();

    Long getEndTimestamp();

    ZonedDateTime getEndDate();

    String getUnbanReason();

    String getHumanReadableDuration();

    String getServerName();

    boolean isSilentBan();

    boolean isSilentUnban();
}
