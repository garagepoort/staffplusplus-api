package net.shortninja.staffplusplus.stafflocations;

import java.time.ZonedDateTime;
import java.util.UUID;

public interface IStaffLocationNote {

    int getLocationId();

    String getNote();

    UUID getNotedByUuid();

    String getNotedByName();

    Long getCreationTimestamp();

    ZonedDateTime getCreationDate();

}
