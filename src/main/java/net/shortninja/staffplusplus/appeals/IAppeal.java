package net.shortninja.staffplusplus.appeals;

import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.UUID;

public interface IAppeal {

    int getId();

    int getAppealableId();

    UUID getAppealerUuid();

    String getAppealerName();

    String getResolverName();

    UUID getResolverUuid();

    Optional<String> getResolveReason();

    AppealStatus getStatus();

    String getReason();

    Long getCreationTimestamp();

    ZonedDateTime getCreationDate();

    AppealableType getType();
}
