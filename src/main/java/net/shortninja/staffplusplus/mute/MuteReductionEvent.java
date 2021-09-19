package net.shortninja.staffplusplus.mute;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MuteReductionEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IMute mute;
    private final long reductionDuration;
    private final CommandSender executor;

    public MuteReductionEvent(IMute mute, long reductionDuration, CommandSender executor) {
        this.mute = mute;
        this.reductionDuration = reductionDuration;
        this.executor = executor;
    }

    public CommandSender getExecutor() {
        return executor;
    }

    public long getReductionDuration() {
        return reductionDuration;
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
