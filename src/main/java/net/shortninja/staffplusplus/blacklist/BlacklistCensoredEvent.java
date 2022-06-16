package net.shortninja.staffplusplus.blacklist;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class BlacklistCensoredEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final String serverName;
    private final Player player;
    private final String censoredMessage;
    private final String originalMessage;
    private final BlacklistType blacklistType;

    public BlacklistCensoredEvent(String serverName, Player player, String censoredMessage, String originalMessage, BlacklistType blacklistType) {
        this.serverName = serverName;
        this.player = player;
        this.censoredMessage = censoredMessage;
        this.originalMessage = originalMessage;
        this.blacklistType = blacklistType;
    }

    public String getServerName() {
        return serverName;
    }

    public Player getPlayer() {
        return player;
    }

    public String getCensoredMessage() {
        return censoredMessage;
    }

    public String getOriginalMessage() {
        return originalMessage;
    }

    public BlacklistType getBlacklistType() {
        return blacklistType;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
