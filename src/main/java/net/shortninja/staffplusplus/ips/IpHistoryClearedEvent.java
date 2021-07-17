package net.shortninja.staffplusplus.ips;

import net.shortninja.staffplusplus.session.SppPlayer;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class IpHistoryClearedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final CommandSender issuer;
    private final SppPlayer target;

    public IpHistoryClearedEvent(CommandSender issuer, SppPlayer target) {
        this.issuer = issuer;
        this.target = target;
    }

    public CommandSender getIssuer() {
        return issuer;
    }

    public SppPlayer getTarget() {
        return target;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
