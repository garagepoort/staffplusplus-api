package net.shortninja.staffplusplus.vanish;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class VanishOnEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final VanishType type;
    private final Player player;
    private final boolean onJoin;

    public VanishOnEvent(VanishType type, Player player, boolean onJoin) {
        this.type = type;
        this.player = player;
        this.onJoin = onJoin;
    }

    public VanishType getType() {
        return type;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean isOnJoin() {
        return onJoin;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
