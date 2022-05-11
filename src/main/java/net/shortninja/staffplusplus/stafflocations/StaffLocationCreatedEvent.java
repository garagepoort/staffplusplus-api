package net.shortninja.staffplusplus.stafflocations;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class StaffLocationCreatedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IStaffLocation staffLocation;

    public StaffLocationCreatedEvent(IStaffLocation staffLocation) {
        this.staffLocation = staffLocation;
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
