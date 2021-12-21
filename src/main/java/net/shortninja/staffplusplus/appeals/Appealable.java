package net.shortninja.staffplusplus.appeals;

import java.util.Optional;

public interface Appealable {

    int getId();

    Optional<? extends IAppeal> getAppeal();

    void setAppeal(IAppeal appeal);

    AppealableType getType();

    String getServerName();
}
