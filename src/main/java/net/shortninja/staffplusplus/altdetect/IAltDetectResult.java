package net.shortninja.staffplusplus.altdetect;

import java.util.UUID;

public interface IAltDetectResult {


    UUID getPlayerCheckedUuid();

    String getPlayerCheckedName();

    UUID getPlayerMatchedUuid();

    String getPlayerMatchedName();

    AltDetectTrustLevel getAltDetectTrustLevel();
}
