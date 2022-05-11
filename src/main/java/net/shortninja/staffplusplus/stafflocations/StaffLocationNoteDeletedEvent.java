package net.shortninja.staffplusplus.stafflocations;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class StaffLocationNoteDeletedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Player deletedBy;
    private final IStaffLocation staffLocation;
    private final IStaffLocationNote staffLocationNote;

    public StaffLocationNoteDeletedEvent(Player deletedBy, IStaffLocation staffLocation, IStaffLocationNote staffLocationNote) {
        this.deletedBy = deletedBy;
        this.staffLocation = staffLocation;
        this.staffLocationNote = staffLocationNote;
    }

    public Player getDeletedBy() {
        return deletedBy;
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
