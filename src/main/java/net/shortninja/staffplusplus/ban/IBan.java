package net.shortninja.staffplusplus.ban;

import net.shortninja.staffplusplus.appeals.Appealable;

import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.UUID;

public interface IBan extends Appealable {

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

    Optional<String> getTemplate();
}
