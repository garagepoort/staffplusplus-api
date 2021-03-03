package net.shortninja.staffplusplus;

import java.util.UUID;

public interface IStaffPlus {

    static IStaffPlus get() {
        throw new UnsupportedOperationException("Not implemented!");
    }

    boolean isPlayerVanished(UUID playerUuid);

}
