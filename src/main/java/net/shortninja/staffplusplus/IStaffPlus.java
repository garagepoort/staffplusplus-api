package net.shortninja.staffplusplus;

import net.shortninja.staffplusplus.ban.BanService;
import net.shortninja.staffplusplus.mute.MuteService;
import net.shortninja.staffplusplus.reports.ReportService;
import net.shortninja.staffplusplus.session.SessionManager;
import net.shortninja.staffplusplus.staffmode.chat.StaffChatService;

public interface IStaffPlus {

    static IStaffPlus get() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    StaffChatService getStaffChatService();

    SessionManager getSessionManager();

    BanService getBanService();

    MuteService getMuteService();

    ReportService getReportService();
}
