package net.shortninja.staffplusplus.investigate;

import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.UUID;

public interface IInvestigation {

    int getId();

    Long getCreationTimestamp();

    ZonedDateTime getCreationDate();

    Optional<Long> getConclusionTimestamp();

    Optional<ZonedDateTime> getConclusionDate();

    String getInvestigatorName();

    UUID getInvestigatorUuid();

    Optional<String> getInvestigatedName();

    Optional<UUID> getInvestigatedUuid();

    String getServerName();

    InvestigationStatus getStatus();
}
