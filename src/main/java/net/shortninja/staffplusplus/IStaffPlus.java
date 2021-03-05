package net.shortninja.staffplusplus;

import net.shortninja.staffplusplus.staffmode.chat.StaffChatService;

import java.util.UUID;

public interface IStaffPlus {

    static IStaffPlus get() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    boolean isPlayerVanished(UUID playerUuid);

    StaffChatService getStaffChatService();
}
