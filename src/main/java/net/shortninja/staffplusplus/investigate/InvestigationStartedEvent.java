package net.shortninja.staffplusplus.investigate;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class InvestigationStartedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IInvestigation investigation;

    public InvestigationStartedEvent(IInvestigation investigation) {
        this.investigation = investigation;
    }

    public IInvestigation getInvestigation() {
        return investigation;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
