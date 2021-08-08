package net.shortninja.staffplusplus.ban;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BanExtensionEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IBan ban;
    private final long extensionDuration;
    private final CommandSender executor;

    public BanExtensionEvent(IBan ban, long extensionDuration, CommandSender executor) {
        this.ban = ban;
        this.extensionDuration = extensionDuration;
        this.executor = executor;
    }

    public CommandSender getExecutor() {
        return executor;
    }

    public long getExtensionDuration() {
        return extensionDuration;
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
