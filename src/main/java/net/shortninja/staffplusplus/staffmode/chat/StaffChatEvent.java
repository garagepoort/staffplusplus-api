package net.shortninja.staffplusplus.staffmode.chat;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class StaffChatEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final Player player;
    private final String serverName;
    private final String message;

    public StaffChatEvent(Player player, String serverName, String message) {
        this.player = player;
        this.serverName = serverName;
        this.message = message;
    }

    public Player getPlayer() {
        return player;
    }

    public String getServerName() {
        return serverName;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
