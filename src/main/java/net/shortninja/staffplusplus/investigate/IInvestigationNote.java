package net.shortninja.staffplusplus.investigate;

import java.time.ZonedDateTime;
import java.util.UUID;

public interface IInvestigationNote {

    int getInvestigationId();

    String getNote();

    UUID getNotedByUuid();

    String getNotedByName();

    Long getCreationTimestamp();

    ZonedDateTime getCreationDate();

}
