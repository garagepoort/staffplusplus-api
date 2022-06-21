package net.shortninja.staffplusplus.common;

import java.util.List;

public class SqlFilters {

    protected List<ISqlFilter> sqlFilters;

    protected SqlFilters(List<ISqlFilter> sqlFilters) {
        this.sqlFilters = sqlFilters;
    }

    public List<ISqlFilter> getSqlFilters() {
        return sqlFilters;
    }
}
