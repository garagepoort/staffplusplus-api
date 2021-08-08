package net.shortninja.staffplusplus.ban;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BanReductionEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IBan ban;
    private final long reductionDuration;
    private final CommandSender executor;

    public BanReductionEvent(IBan ban, long reductionDuration, CommandSender executor) {
        this.ban = ban;
        this.reductionDuration = reductionDuration;
        this.executor = executor;
    }

    public CommandSender getExecutor() {
        return executor;
    }

    public long getReductionDuration() {
        return reductionDuration;
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
