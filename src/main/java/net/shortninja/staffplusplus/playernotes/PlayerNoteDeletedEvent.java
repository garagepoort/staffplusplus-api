package net.shortninja.staffplusplus.playernotes;

import org.bukkit.command.CommandSender;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerNoteDeletedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IPlayerNote playerNote;
    private final CommandSender sender;

    public PlayerNoteDeletedEvent(IPlayerNote playerNote, CommandSender sender) {
        this.playerNote = playerNote;
        this.sender = sender;
    }

    public IPlayerNote getPlayerNote() {
        return playerNote;
    }

    public CommandSender getSender() {
        return sender;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
