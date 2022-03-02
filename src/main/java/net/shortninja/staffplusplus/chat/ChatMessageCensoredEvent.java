package net.shortninja.staffplusplus.chat;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ChatMessageCensoredEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final String serverName;
    private final Player player;
    private final String censoredMessage;
    private final String originalMessage;

    public ChatMessageCensoredEvent(String serverName, Player player, String censoredMessage, String originalMessage) {
        this.serverName = serverName;
        this.player = player;
        this.censoredMessage = censoredMessage;
        this.originalMessage = originalMessage;
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

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
