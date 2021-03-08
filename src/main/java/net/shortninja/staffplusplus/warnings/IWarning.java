package net.shortninja.staffplusplus.warnings;

import net.shortninja.staffplusplus.Actionable;
import net.shortninja.staffplusplus.appeals.Appealable;

import java.time.ZonedDateTime;
import java.util.UUID;

public interface IWarning extends Actionable, Appealable {

    int getId();

    String getTargetName();

    UUID getTargetUuid();

    String getIssuerName();

    UUID getIssuerUuid();

    String getReason();

    int getScore();

    String getSeverity();

    ZonedDateTime getCreationDate();

    String getServerName();
}
