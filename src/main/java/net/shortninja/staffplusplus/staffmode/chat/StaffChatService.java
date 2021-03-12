package net.shortninja.staffplusplus.staffmode.chat;

import org.bukkit.command.CommandSender;

public interface StaffChatService {
    void sendMessage(CommandSender sender, String message);

    void sendMessage(String senderName, String message);
}
