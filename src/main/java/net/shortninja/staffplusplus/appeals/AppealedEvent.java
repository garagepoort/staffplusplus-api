package net.shortninja.staffplusplus.appeals;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AppealedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Appealable appealable;

    public AppealedEvent(Appealable appealable) {
        this.appealable = appealable;
    }

    public Appealable getAppealable() {
        return appealable;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
