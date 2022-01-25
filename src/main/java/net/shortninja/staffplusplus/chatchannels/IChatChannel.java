package net.shortninja.staffplusplus.chatchannels;

import java.util.Set;
import java.util.UUID;

public interface IChatChannel {

    int getId();

    String getName();

    String getChannelId();

    String getServerName();

    String getPrefix();

    String getLine();

    Set<UUID> getMembers();

    ChatChannelType getType();
}
