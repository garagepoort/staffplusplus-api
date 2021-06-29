package net.shortninja.staffplusplus.reports;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ReopenReportEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    /**
     * Report in question
     */
    private final IReport report;
    private final String reopenedByName;

    public ReopenReportEvent(IReport report, String reopenedByName) {
        this.report = report;
        this.reopenedByName = reopenedByName;
    }

    public String getReopenedByName() {
        return reopenedByName;
    }

    public IReport getReport() {
        return report;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
