package net.shortninja.staffplusplus.warnings;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class WarningCreatedEvent extends Event {


    private static final HandlerList HANDLERS = new HandlerList();

    private final IWarning warning;

    public WarningCreatedEvent(IWarning warning) {
        this.warning = warning;
    }

    public IWarning getWarning() {
        return warning;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
