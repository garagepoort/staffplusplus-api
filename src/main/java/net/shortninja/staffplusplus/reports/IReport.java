package net.shortninja.staffplusplus.reports;

import org.bukkit.Location;

import java.time.ZonedDateTime;
import java.util.Optional;
import java.util.UUID;

public interface IReport {

    int getId();

    String getReporterName();

    UUID getReporterUuid();

    String getStaffName();

    UUID getStaffUuid();

    UUID getCulpritUuid();

    String getCulpritName();

    String getReason();

    ReportStatus getReportStatus();

    ZonedDateTime getCreationDate();

    String getCloseReason();

    String getServerName();

    Optional<Location> getLocation();
}
