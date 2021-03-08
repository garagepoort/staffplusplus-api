package net.shortninja.staffplusplus.appeals;

import net.shortninja.staffplusplus.warnings.AppealStatus;

import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.UUID;

public interface IAppeal {

    int getId();

    UUID getAppealerUuid();

    String getAppealerName();

    String getResolverName();

    UUID getResolverUuid();

    Optional<String> getResolveReason();

    AppealStatus getStatus();

    String getReason();

    Long getCreationTimestamp();

    ZonedDateTime getCreationDate();
}
