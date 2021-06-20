package net.shortninja.staffplusplus.altdetect;

public enum AltDetectTrustLevel {

    POSITIVE(5),
    FAIRLY_POSITIVE(4),
    POSSIBLE(3),
    NOT_LIKELY(2),
    SAME_IP(1);

    private final int score;

    AltDetectTrustLevel(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    public static AltDetectTrustLevel fromScore(int score) {
        for (AltDetectTrustLevel value : AltDetectTrustLevel.values()) {
            if (value.score == score) {
                return value;
            }
        }
        throw new RuntimeException("AltAccountTrustScore does not support score value [" + score + "]");
    }
}
