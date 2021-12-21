package net.shortninja.staffplusplus.mute.appeals;

import net.shortninja.staffplusplus.mute.IMute;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MuteAppealedEvent extends Event {


    private static final HandlerList HANDLERS = new HandlerList();

    private final IMute mute;

    public MuteAppealedEvent(IMute mute) {
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
