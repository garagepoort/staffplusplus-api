package net.shortninja.staffplusplus.ban;

import net.shortninja.staffplusplus.session.SppPlayer;
import org.bukkit.command.CommandSender;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BanService {

    void unban(CommandSender issuer, SppPlayer playerToUnban, String reason, boolean isSilent);

    void unban(SppPlayer issuer, int banId, String reason);

    long getTotalBanCount();

    long getActiveBanCount();

    void permBan(CommandSender issuer, SppPlayer playerToBan, String reason, String template, boolean isSilent);

    void permBan(CommandSender issuer, SppPlayer playerToBan, String reason, boolean isSilent);

    void tempBan(CommandSender issuer, SppPlayer playerToBan, Long durationInMillis, String reason, String template, boolean isSilent);

    void tempBan(CommandSender issuer, SppPlayer playerToBan, Long durationInMillis, String reason, boolean isSilent);

    void extendBan(CommandSender sender, SppPlayer player, long duration);

    void reduceBan(CommandSender sender, SppPlayer player, long duration);

    Optional<? extends IBan> getBanByBannedUuid(UUID playerUuid);

    IBan getActiveById(int banId);

    IBan getById(int banId);

    List<? extends IBan> getAllPaged(int offset, int amount);

    long getBanCount(BanFilters reportFilter);
}
