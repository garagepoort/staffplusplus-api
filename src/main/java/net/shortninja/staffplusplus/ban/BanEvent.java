package net.shortninja.staffplusplus.ban;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BanEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IBan ban;
    private final String banMessage;

    public BanEvent(IBan ban, String banMessage) {
        this.ban = ban;
        this.banMessage = banMessage;
    }

    public String getBanMessage() {
        return banMessage;
    }

    public IBan getBan() {
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
