package net.shortninja.staffplusplus.chat;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class NameChangeEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final String serverName;
    private final Player player;
    private final String oldName;
    private final String newName;

    public NameChangeEvent(String serverName, Player player, String oldName, String newName) {
        super(true);
        this.serverName = serverName;
        this.player = player;
        this.oldName = oldName;
        this.newName = newName;
    }

    public String getServerName() {
        return serverName;
    }

    public Player getPlayer() {
        return player;
    }

    public String getOldName() {
        return oldName;
    }

    public String getNewName() {
        return newName;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
