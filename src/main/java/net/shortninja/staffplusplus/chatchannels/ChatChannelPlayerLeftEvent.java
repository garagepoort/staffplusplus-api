package net.shortninja.staffplusplus.chatchannels;

import net.shortninja.staffplusplus.session.SppPlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ChatChannelPlayerLeftEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final SppPlayer player;
    private final IChatChannel channel;

    public ChatChannelPlayerLeftEvent(SppPlayer player, IChatChannel channel) {
        this.player = player;
        this.channel = channel;
    }

    public SppPlayer getPlayer() {
        return player;
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
