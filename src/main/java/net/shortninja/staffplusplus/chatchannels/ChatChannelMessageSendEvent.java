package net.shortninja.staffplusplus.chatchannels;

import net.shortninja.staffplusplus.session.SppInteractor;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ChatChannelMessageSendEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final SppInteractor sender;
    private final String message;
    private final IChatChannel channel;

    public ChatChannelMessageSendEvent(SppInteractor sender, String message, IChatChannel channel) {
        this.sender = sender;
        this.message = message;
        this.channel = channel;
    }

    public String getMessage() {
        return message;
    }

    public SppInteractor getSender() {
        return sender;
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
