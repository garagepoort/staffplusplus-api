package net.shortninja.staffplusplus.stafflocations;

import org.bukkit.Location;

import java.util.UUID;

public interface IStaffLocation {

    int getId();

    String getName();

    Location getLocation();

    String getCreatorName();

    UUID getCreatorUuid();

    String getServerName();

    long getCreationTimestamp();
}
