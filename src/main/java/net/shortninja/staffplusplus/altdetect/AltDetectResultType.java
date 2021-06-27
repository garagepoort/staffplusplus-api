package net.shortninja.staffplusplus.altdetect;

public enum AltDetectResultType {

    NAME_SIMILARITY_70(4, "Usernames have a similarity of over 70%"),
    NAME_SIMILARITY_50(3, "Usernames have a similarity of over 50%"),
    NAME_SIMILARITY_30(2, "Usernames have a similarity of over 30%"),
    SAME_IP(1, "Users have same IP address");

    private final int score;
    private final String description;

    AltDetectResultType(int score, String description) {
        this.score = score;
        this.description = description;
    }

    public int getScore() {
        return score;
    }

    public String getDescription() {
        return description;
    }
}
