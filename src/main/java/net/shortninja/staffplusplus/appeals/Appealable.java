package net.shortninja.staffplusplus.appeals;

import java.util.Optional;

public interface Appealable {

    Optional<? extends IAppeal> getAppeal();
}
