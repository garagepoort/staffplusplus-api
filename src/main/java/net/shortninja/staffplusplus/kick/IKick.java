package net.shortninja.staffplusplus.kick;

import java.time.ZonedDateTime;
import java.util.UUID;

public interface IKick {

    int getId();

    Long getCreationTimestamp();

    ZonedDateTime getCreationDate();

    String getReason();

    String getTargetName();

    UUID getTargetUuid();

    String getIssuerName();

    UUID getIssuerUuid();

    String getServerName();
}
