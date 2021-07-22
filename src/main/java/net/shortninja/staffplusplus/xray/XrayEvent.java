package net.shortninja.staffplusplus.xray;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.Optional;

public class XrayEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Player player;
    private final int amount;
    private final Long duration;
    private final Material type;
    private final int lightLevel;
    private final Location location;
    private final String serverName;

    public XrayEvent(Player player, int amount, Long duration, Material type, int lightLevel, Location location, String serverName) {
        this.player = player;
        this.amount = amount;
        this.duration = duration;
        this.type = type;
        this.lightLevel = lightLevel;
        this.location = location;
        this.serverName = serverName;
    }

    public static HandlerList getHANDLERS() {
        return HANDLERS;
    }

    public Player getPlayer() {
        return player;
    }

    public int getAmount() {
        return amount;
    }

    public Optional<Long> getDuration() {
        return Optional.ofNullable(duration);
    }

    public Material getType() {
        return type;
    }

    public int getLightLevel() {
        return lightLevel;
    }

    public Location getLocation() {
        return location;
    }

    public String getServerName() {
        return serverName;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
