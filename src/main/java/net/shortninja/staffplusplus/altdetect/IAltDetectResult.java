package net.shortninja.staffplusplus.altdetect;

import java.util.List;
import java.util.UUID;

public interface IAltDetectResult {


    UUID getPlayerCheckedUuid();

    String getPlayerCheckedName();

    UUID getPlayerMatchedUuid();

    String getPlayerMatchedName();

    AltDetectTrustLevel getAltDetectTrustLevel();

    List<AltDetectResultType> getAltDetectResultTypes();

    boolean isIpMatched();
}
