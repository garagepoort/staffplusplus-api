package net.shortninja.staffplusplus.playernotes;

import java.util.UUID;

public interface IPlayerNote {

    Long getId();

    String getNote();

    UUID getNotedByUuid();

    String getNotedByName();

    String getTargetName();

    UUID getTargetUuid();

    Long getCreationTimestamp();

    boolean isPrivateNote();

    String getServerName();
}
