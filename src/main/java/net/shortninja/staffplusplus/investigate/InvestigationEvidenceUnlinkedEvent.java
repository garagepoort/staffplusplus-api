package net.shortninja.staffplusplus.investigate;

import net.shortninja.staffplusplus.investigate.evidence.IInvestigationEvidence;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class InvestigationEvidenceUnlinkedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IInvestigation investigation;
    private final IInvestigationEvidence investigationEvidence;

    public InvestigationEvidenceUnlinkedEvent(IInvestigation investigation, IInvestigationEvidence investigationEvidence) {
        this.investigation = investigation;
        this.investigationEvidence = investigationEvidence;
    }

    public IInvestigationEvidence getInvestigationEvidence() {
        return investigationEvidence;
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
