package net.shortninja.staffplusplus.playernotes;

import net.shortninja.staffplusplus.session.SppPlayer;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerNoteDeletedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IPlayerNote playerNote;
    private final SppPlayer sender;

    public PlayerNoteDeletedEvent(IPlayerNote playerNote, SppPlayer sender) {
        this.playerNote = playerNote;
        this.sender = sender;
    }

    public IPlayerNote getPlayerNote() {
        return playerNote;
    }

    public SppPlayer getSender() {
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
