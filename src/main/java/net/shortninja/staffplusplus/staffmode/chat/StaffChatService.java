package net.shortninja.staffplusplus.staffmode.chat;

import org.bukkit.entity.Player;

public interface StaffChatService {
    void sendMessage(Player player, String message);

    void sendMessage(String senderName, String message);
}
