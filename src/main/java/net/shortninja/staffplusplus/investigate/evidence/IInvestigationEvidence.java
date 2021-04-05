package net.shortninja.staffplusplus.investigate.evidence;

import java.time.ZonedDateTime;
import java.util.UUID;

public interface IInvestigationEvidence {

    int getInvestigationId();

    int getEvidenceId();

    String getEvidenceType();

    UUID getLinkedByUuid();

    String getLinkedByName();

    String getDescription();

    Long getCreationTimestamp();

    ZonedDateTime getCreationDate();

}
