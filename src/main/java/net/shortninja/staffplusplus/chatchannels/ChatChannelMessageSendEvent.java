package net.shortninja.staffplusplus.chatchannels;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ChatChannelMessageSendEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final CommandSender sender;
    private final String message;
    private final IChatChannel channel;

    public ChatChannelMessageSendEvent(CommandSender sender, String message, IChatChannel channel) {
        this.sender = sender;
        this.message = message;
        this.channel = channel;
    }

    public String getMessage() {
        return message;
    }

    public CommandSender getSender() {
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
