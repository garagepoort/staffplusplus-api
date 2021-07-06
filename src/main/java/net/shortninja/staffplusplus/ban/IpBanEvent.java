package net.shortninja.staffplusplus.ban;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.Optional;

public class IpBanEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    private final IIpBan ban;
    private String kickTemplate;

    public IpBanEvent(IIpBan ban, String kickTemplate) {
        this.ban = ban;
        this.kickTemplate = kickTemplate;
    }

    public IIpBan getBan() {
        return ban;
    }

    public Optional<String> getKickTemplate() {
        return Optional.ofNullable(kickTemplate);
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
