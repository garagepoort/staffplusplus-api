package net.shortninja.staffplusplus.mute;

import java.util.List;

public interface MuteService {

    long getTotalMuteCount();

    long getActiveMuteCount();

    List<? extends IMute> getAllPaged(int offset, int amount);
}
