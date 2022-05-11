package net.shortninja.staffplusplus.stafflocations;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class StaffLocationDeletedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IStaffLocation staffLocation;
    private final Player deletedByPlayer;

    public StaffLocationDeletedEvent(IStaffLocation staffLocation, Player deletedByPlayer) {
        this.staffLocation = staffLocation;
        this.deletedByPlayer = deletedByPlayer;
    }

    public IStaffLocation getStaffLocation() {
        return staffLocation;
    }

    public Player getDeletedByPlayer() {
        return deletedByPlayer;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
