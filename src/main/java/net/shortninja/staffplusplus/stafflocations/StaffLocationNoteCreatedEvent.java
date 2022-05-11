package net.shortninja.staffplusplus.stafflocations;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class StaffLocationNoteCreatedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IStaffLocation staffLocation;
    private final IStaffLocationNote staffLocationNote;

    public StaffLocationNoteCreatedEvent(IStaffLocation staffLocation, IStaffLocationNote staffLocationNote) {
        this.staffLocation = staffLocation;
        this.staffLocationNote = staffLocationNote;
    }

    public IStaffLocationNote getStaffLocationNote() {
        return staffLocationNote;
    }

    public IStaffLocation getStaffLocation() {
        return staffLocation;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
