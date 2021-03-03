package net.shortninja.staffplusplus.mute;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class UnmuteEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IMute mute;

    public UnmuteEvent(IMute mute) {
        this.mute = mute;
    }

    public IMute getMute() {
        return mute;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
