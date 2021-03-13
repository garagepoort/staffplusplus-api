package net.shortninja.staffplusplus.chat;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerMentionedEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();

    private final String serverName;
    private final Player player;
    private final OfflinePlayer mentionedPlayer;
    private final String chatMessage;

    public PlayerMentionedEvent(String serverName, Player player, OfflinePlayer mentionedPlayer, String chatMessage) {
        this.serverName = serverName;
        this.player = player;
        this.mentionedPlayer = mentionedPlayer;
        this.chatMessage = chatMessage;
    }

    public String getServerName() {
        return serverName;
    }

    public Player getPlayer() {
        return player;
    }

    public OfflinePlayer getMentionedPlayer() {
        return mentionedPlayer;
    }

    public String getChatMessage() {
        return chatMessage;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
