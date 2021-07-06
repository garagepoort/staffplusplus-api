package net.shortninja.staffplusplus.ban;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class IpUnbanEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IIpBan ban;

    public IpUnbanEvent(IIpBan ban) {
        this.ban = ban;
    }

    public IIpBan getBan() {
        return ban;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
