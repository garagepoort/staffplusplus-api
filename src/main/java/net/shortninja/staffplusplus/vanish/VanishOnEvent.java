package net.shortninja.staffplusplus.vanish;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class VanishOnEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final VanishType type;
    private final Player player;

    public VanishOnEvent(VanishType type, Player player) {
        this.type = type;
        this.player = player;
    }

    public VanishType getType() {
        return type;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
