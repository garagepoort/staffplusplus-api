package net.shortninja.staffplusplus.session;

import org.bukkit.GameMode;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.UUID;

public class SppPlayer extends SppInteractor {

    private final boolean online;
    private Player player;
    private OfflinePlayer offlinePlayer;

    public SppPlayer(UUID id, String username, OfflinePlayer offlinePlayer) {
        super(id, username);
        this.online = false;
        this.offlinePlayer = offlinePlayer;
    }

    public SppPlayer(UUID id, String username, Player player) {
        super(id, username, player);
        this.online = true;
        this.player = player;
        this.offlinePlayer = player;
    }

    public boolean isOnline() {
        return online;
    }

    public OfflinePlayer getOfflinePlayer() {
        return offlinePlayer;
    }

    public Player getPlayer() {
        if (!online) {
            throw new RuntimeException("Cannot retrieve bukkit player. Player is offline");
        }
        return player;
    }

    public void turnNightVisionOn() {
        player.removePotionEffect(PotionEffectType.NIGHT_VISION);
        player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, Integer.MAX_VALUE, 128, false, false));
    }

    public void turnNightVisionOff() {
        player.removePotionEffect(PotionEffectType.NIGHT_VISION);
    }

    public void setGameMode(GameMode gameMode) {
        player.setGameMode(gameMode);
    }
}
