package net.shortninja.staffplusplus.mute.appeals;

import net.shortninja.staffplusplus.appeals.IAppeal;
import net.shortninja.staffplusplus.mute.IMute;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MuteAppealRejectedEvent extends Event {


    private static final HandlerList HANDLERS = new HandlerList();

    private final IAppeal appeal;
    private final IMute mute;

    public MuteAppealRejectedEvent(IAppeal appeal, IMute mute) {
        this.appeal = appeal;
        this.mute = mute;
    }

    public IMute getMute() {
        return mute;
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
