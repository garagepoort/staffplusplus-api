package net.shortninja.staffplusplus.mute;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class MuteExtensionEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IMute mute;
    private final long extensionDuration;
    private final CommandSender executor;

    public MuteExtensionEvent(IMute mute, long extensionDuration, CommandSender executor) {
        this.mute = mute;
        this.extensionDuration = extensionDuration;
        this.executor = executor;
    }

    public CommandSender getExecutor() {
        return executor;
    }

    public long getExtensionDuration() {
        return extensionDuration;
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
