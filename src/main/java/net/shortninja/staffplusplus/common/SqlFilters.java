package net.shortninja.staffplusplus.common;

import java.util.List;

public class SqlFilters {

    protected List<SqlFilter> sqlFilters;

    protected SqlFilters(List<SqlFilter> sqlFilters) {
        this.sqlFilters = sqlFilters;
    }

    public List<SqlFilter> getSqlFilters() {
        return sqlFilters;
    }
}
