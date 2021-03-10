package net.shortninja.staffplusplus;

import net.shortninja.staffplusplus.session.SessionManager;
import net.shortninja.staffplusplus.staffmode.chat.StaffChatService;

public interface IStaffPlus {

    static IStaffPlus get() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    StaffChatService getStaffChatService();

    SessionManager getSessionManager();
}
