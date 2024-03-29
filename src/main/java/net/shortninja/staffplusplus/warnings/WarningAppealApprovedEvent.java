package net.shortninja.staffplusplus.warnings;

import net.shortninja.staffplusplus.appeals.IAppeal;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class WarningAppealApprovedEvent extends Event {


    private static final HandlerList HANDLERS = new HandlerList();

    private final IAppeal appeal;
    private final IWarning warning;

    public WarningAppealApprovedEvent(IAppeal appeal, IWarning warning) {
        this.appeal = appeal;
        this.warning = warning;
    }

    public IAppeal getAppeal() {
        return appeal;
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
