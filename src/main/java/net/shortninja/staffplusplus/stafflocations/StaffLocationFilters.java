package net.shortninja.staffplusplus.stafflocations;

import net.shortninja.staffplusplus.common.SqlFilter;
import net.shortninja.staffplusplus.common.SqlFilters;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class StaffLocationFilters extends SqlFilters {

    public StaffLocationFilters(List<SqlFilter> sqlFilters) {
        super(sqlFilters);
    }

    public static class StaffLocationFiltersBuilder {

        private List<SqlFilter> sqlFilters = new ArrayList<>();

        public StaffLocationFiltersBuilder id(int id) {
            this.sqlFilters.add(new SqlFilter<>(id, Types.INTEGER, "sp_staff_locations.id"));
            return this;
        }
        
        public StaffLocationFiltersBuilder name(String name) {
            this.sqlFilters.add(new SqlFilter<>("%" + name + "%", Types.VARCHAR, "sp_staff_locations.name", " LIKE "));
            return this;
        }

        public StaffLocationFiltersBuilder creator(String creator) {
            this.sqlFilters.add(new SqlFilter<>("%" + creator + "%", Types.VARCHAR, "sp_staff_locations.creator_name", " LIKE "));
            return this;
        }

        public StaffLocationFiltersBuilder createdAfter(long timestamp) {
            this.sqlFilters.add(new SqlFilter<>(timestamp, Types.BIGINT, "sp_staff_locations.creation_timestamp", ">="));
            return this;
        }

        public StaffLocationFilters build() {
            return new StaffLocationFilters(sqlFilters);
        }
    }
}
