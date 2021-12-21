package net.shortninja.staffplusplus.appeals;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AppealRejectedEvent extends Event {


    private static final HandlerList HANDLERS = new HandlerList();

    private final IAppeal appeal;

    public AppealRejectedEvent(IAppeal appeal) {
        this.appeal = appeal;
    }

    public IAppeal getAppeal() {
        return appeal;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
