package net.shortninja.staffplusplus.ban.appeals;

import net.shortninja.staffplusplus.appeals.IAppeal;
import net.shortninja.staffplusplus.ban.IBan;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BanAppealRejectedEvent extends Event {


    private static final HandlerList HANDLERS = new HandlerList();

    private final IAppeal appeal;
    private final IBan ban;

    public BanAppealRejectedEvent(IAppeal appeal, IBan ban) {
        this.appeal = appeal;
        this.ban = ban;
    }

    public IBan getBan() {
        return ban;
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
