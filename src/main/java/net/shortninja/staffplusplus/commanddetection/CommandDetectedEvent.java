package net.shortninja.staffplusplus.commanddetection;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class CommandDetectedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Player player;
    private final String command;
    private final World world;
    private final Long timestamp;

    public CommandDetectedEvent(Player player, String command, World world, Long timestamp) {
        this.player = player;
        this.command = command;
        this.world = world;
        this.timestamp = timestamp;
    }

    public Player getPlayer() {
        return player;
    }

    public String getCommand() {
        return command;
    }

    public World getWorld() {
        return world;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
