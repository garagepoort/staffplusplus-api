package net.shortninja.staffplusplus;

import java.util.UUID;

public interface Actionable {

    int getId();

    String getActionableType();

    UUID getTargetUuid();
}
