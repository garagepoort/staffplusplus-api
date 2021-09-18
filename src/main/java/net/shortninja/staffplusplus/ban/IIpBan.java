package net.shortninja.staffplusplus.ban;

import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.UUID;

public interface IIpBan {
    Long getId();

    String getIp();

    void setId(Long id);

    String getIssuerName();

    UUID getIssuerUuid();

    Optional<String> getUnbannedByName();

    Optional<UUID> getUnbannedByUuid();

    boolean isSilentBan();

    boolean isSilentUnban();

    Long getCreationDate();

    Optional<Long> getEndTimestamp();

    Optional<ZonedDateTime> getEndDateTime();

    String getServerName();

    String getHumanReadableDuration();

    boolean isSubnet();

    Optional<String> getTemplate();
}
