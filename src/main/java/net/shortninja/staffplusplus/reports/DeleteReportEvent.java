package net.shortninja.staffplusplus.reports;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class DeleteReportEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    /**
     * Report in question
     */
    private final IReport report;

    public DeleteReportEvent(IReport report) {
        this.report = report;
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
