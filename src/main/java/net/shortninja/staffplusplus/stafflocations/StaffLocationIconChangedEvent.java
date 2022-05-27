package net.shortninja.staffplusplus.stafflocations;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class StaffLocationIconChangedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Player editedBy;
    private final IStaffLocation staffLocation;

    public StaffLocationIconChangedEvent(Player editedBy, IStaffLocation staffLocation) {
        this.editedBy = editedBy;
        this.staffLocation = staffLocation;
    }

    public Player getEditedBy() {
        return editedBy;
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
