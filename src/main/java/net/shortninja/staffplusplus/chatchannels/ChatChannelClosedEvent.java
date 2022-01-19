package net.shortninja.staffplusplus.chatchannels;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ChatChannelClosedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IChatChannel channel;

    public ChatChannelClosedEvent(IChatChannel channel) {
        this.channel = channel;
    }

    public IChatChannel getChannel() {
        return channel;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
