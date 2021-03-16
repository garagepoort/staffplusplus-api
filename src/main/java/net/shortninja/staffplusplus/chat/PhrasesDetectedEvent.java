package net.shortninja.staffplusplus.chat;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.List;

public class PhrasesDetectedEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final String serverName;
    private final Player player;
    private final String originalMessage;
    private final List<String> detectedPhrases;

    public PhrasesDetectedEvent(String serverName, Player player, String originalMessage, List<String> detectedPhrases) {
        this.serverName = serverName;
        this.player = player;
        this.originalMessage = originalMessage;
        this.detectedPhrases = detectedPhrases;
    }

    public String getServerName() {
        return serverName;
    }

    public Player getPlayer() {
        return player;
    }

    public String getOriginalMessage() {
        return originalMessage;
    }

    public List<String> getDetectedPhrases() {
        return detectedPhrases;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
