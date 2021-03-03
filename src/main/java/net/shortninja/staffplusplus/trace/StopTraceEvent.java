package net.shortninja.staffplusplus.trace;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class StopTraceEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final ITrace trace;

    public StopTraceEvent(ITrace trace) {
        this.trace = trace;
    }

    public ITrace getTrace() {
        return trace;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
