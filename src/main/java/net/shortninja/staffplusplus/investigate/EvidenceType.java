package net.shortninja.staffplusplus.investigate;

public enum EvidenceType {
    MUTE("Mute"),
    BAN("Ban"),
    REPORT("Report"),
    WARNING("Warning"),
    KICK("Kicks");

    private final String guiTitle;

    EvidenceType(String guiTitle) {
        this.guiTitle = guiTitle;
    }

    public String getGuiTitle() {
        return guiTitle;
    }
}
