package net.shortninja.staffplusplus.investigate;

import java.time.ZonedDateTime;
import java.util.UUID;

public interface IInvestigationEvidence {

    int getInvestigationId();

    int getEvidenceId();

    EvidenceType getEvidenceType();

    UUID getLinkedByUuid();

    String getLinkedByName();

    String getDescription();

    Long getCreationTimestamp();

    ZonedDateTime getCreationDate();

}
