package net.shortninja.staffplusplus.chatchannels;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ChatChannelCreatedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IChatChannel channel;
    private final String openingMessage;

    public ChatChannelCreatedEvent(IChatChannel channel, String openingMessage) {
        this.channel = channel;
        this.openingMessage = openingMessage;
    }

    public String getOpeningMessage() {
        return openingMessage;
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
