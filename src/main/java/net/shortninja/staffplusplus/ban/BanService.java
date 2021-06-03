package net.shortninja.staffplusplus.ban;

import java.util.List;

public interface BanService {

    long getTotalBanCount();

    long getActiveBanCount();

    List<? extends IBan> getAllPaged(int offset, int amount);
}
