package net.shortninja.staffplusplus.freeze;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerUnFrozenEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final CommandSender issuer;
    private final Player target;

    public PlayerUnFrozenEvent(CommandSender issuer, Player target) {
        this.issuer = issuer;
        this.target = target;
    }

    public PlayerUnFrozenEvent(boolean isAsync, CommandSender issuer, Player target) {
        super(isAsync);
        this.issuer = issuer;
        this.target = target;
    }

    public CommandSender getIssuer() {
        return issuer;
    }

    public Player getTarget() {
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
