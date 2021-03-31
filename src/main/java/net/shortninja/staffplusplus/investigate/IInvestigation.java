package net.shortninja.staffplusplus.investigate;

import java.util.Optional;
import java.util.UUID;

public interface IInvestigation {

    int getId();

    Long getCreationDate();

    Optional<Long> getConclusionDate();

    String getInvestigatorName();

    UUID getInvestigatorUuid();

    String getInvestigatedName();

    UUID getInvestigatedUuid();

    String getServerName();

    InvestigationStatus getStatus();
}
