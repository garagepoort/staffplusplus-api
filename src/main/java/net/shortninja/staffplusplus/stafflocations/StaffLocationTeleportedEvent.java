package net.shortninja.staffplusplus.stafflocations;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class StaffLocationTeleportedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IStaffLocation staffLocation;
    private final Player teleportedPlayer;

    public StaffLocationTeleportedEvent(IStaffLocation staffLocation, Player teleportedPlayer) {
        this.staffLocation = staffLocation;
        this.teleportedPlayer = teleportedPlayer;
    }

    public IStaffLocation getStaffLocation() {
        return staffLocation;
    }

    public Player getTeleportedPlayer() {
        return teleportedPlayer;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
