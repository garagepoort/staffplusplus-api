package net.shortninja.staffplusplus.staffmode;

import org.bukkit.Location;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.UUID;

public class SwitchStaffModeEvent extends Event {


    private static final HandlerList HANDLERS = new HandlerList();

    private final String playerName;
    private final UUID playerUuid;
    private final Location location;
    private final String serverName;
    private final String fromMode;
    private final String toMode;
    private final IModeData modeData;

    public SwitchStaffModeEvent(String playerName, UUID playerUuid, Location location, String serverName, String fromMode, String toMode, IModeData modeData) {
        this.playerName = playerName;
        this.playerUuid = playerUuid;
        this.location = location;
        this.serverName = serverName;
        this.fromMode = fromMode;
        this.toMode = toMode;
        this.modeData = modeData;
    }

    public String getPlayerName() {
        return playerName;
    }

    public UUID getPlayerUuid() {
        return playerUuid;
    }

    public Location getLocation() {
        return location;
    }

    public String getServerName() {
        return serverName;
    }

    public String getFromMode() {
        return fromMode;
    }

    public String getToMode() {
        return toMode;
    }

    public IModeData getModeData() {
        return modeData;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
