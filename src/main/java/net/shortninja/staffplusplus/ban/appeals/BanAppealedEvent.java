package net.shortninja.staffplusplus.ban.appeals;

import net.shortninja.staffplusplus.ban.IBan;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BanAppealedEvent extends Event {


    private static final HandlerList HANDLERS = new HandlerList();

    private final IBan ban;

    public BanAppealedEvent(IBan ban) {
        this.ban = ban;
    }

    public IBan getBan() {
        return ban;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
