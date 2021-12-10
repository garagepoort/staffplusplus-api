package net.shortninja.staffplusplus.playernotes;

import net.shortninja.staffplusplus.session.SppInteractor;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerNoteCreatedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IPlayerNote playerNote;
    private final SppInteractor sender;

    public PlayerNoteCreatedEvent(IPlayerNote playerNote, SppInteractor sender) {
        this.playerNote = playerNote;
        this.sender = sender;
    }

    public IPlayerNote getPlayerNote() {
        return playerNote;
    }

    public SppInteractor getSender() {
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
