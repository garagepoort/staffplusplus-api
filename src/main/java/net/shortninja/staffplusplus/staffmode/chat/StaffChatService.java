package net.shortninja.staffplusplus.staffmode.chat;

public interface StaffChatService {
    void sendMessage(String message);

    void sendMessage(String channel, String message);
}
