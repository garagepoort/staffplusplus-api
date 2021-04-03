package net.shortninja.staffplusplus.investigate;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class InvestigationNoteDeletedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IInvestigation investigation;
    private final IInvestigationNote investigationNote;

    public InvestigationNoteDeletedEvent(IInvestigation investigation, IInvestigationNote investigationNote) {
        this.investigation = investigation;
        this.investigationNote = investigationNote;
    }

    public IInvestigationNote getInvestigationNote() {
        return investigationNote;
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
