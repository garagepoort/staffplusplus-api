package net.shortninja.staffplusplus.session;

import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class SppInteractor {

    private final UUID id;
    private final String username;
    private CommandSender commandSender;

    public SppInteractor(UUID id, String username, CommandSender commandSender) {
        this.id = id;
        this.username = username;
        this.commandSender = commandSender;
    }

    @Deprecated
    public SppInteractor(UUID id, String username) {
        this.id = id;
        this.username = username;
    }

    public boolean isBukkitPlayer() {
        return commandSender instanceof OfflinePlayer;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Optional<CommandSender> getCommandSender() {
        return Optional.ofNullable(commandSender);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SppInteractor sppPlayer = (SppInteractor) o;
        return id.equals(sppPlayer.id) &&
            username.equals(sppPlayer.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username);
    }
}
