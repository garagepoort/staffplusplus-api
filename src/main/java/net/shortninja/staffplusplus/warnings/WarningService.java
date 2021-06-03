package net.shortninja.staffplusplus.warnings;

import java.util.List;

public interface WarningService {

    long getWarnCount(WarningFilters warningFilters);

    int getTotalScore(String playerName);

    List<? extends IWarning> findWarnings(WarningFilters warningFilters, int offset, int amount);
}
