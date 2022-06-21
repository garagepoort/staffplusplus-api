package net.shortninja.staffplusplus.warnings;

import net.shortninja.staffplusplus.common.ISqlFilter;
import net.shortninja.staffplusplus.common.SqlFilter;
import net.shortninja.staffplusplus.common.SqlFilters;
import net.shortninja.staffplusplus.session.SppPlayer;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class WarningFilters extends SqlFilters {

    private WarningFilters(List<ISqlFilter> warningFilters) {
        super(warningFilters);
    }

    public static class WarningFiltersBuilder {

        private List<ISqlFilter> warningFilters = new ArrayList<>();

        public WarningFiltersBuilder id(int id) {
            this.warningFilters.add(new SqlFilter<>(id, Types.INTEGER, "sp_warnings.id"));
            return this;
        }

        public WarningFiltersBuilder severity(String severity) {
            this.warningFilters.add(new SqlFilter<>(severity, Types.VARCHAR, "sp_warnings.severity"));
            return this;
        }

        public WarningFiltersBuilder anyOfSeverity(List<String> severities) {
            this.warningFilters.add(new SqlFilter<>(severities, Types.VARCHAR, "sp_warnings.severity"));
            return this;
        }

        public WarningFiltersBuilder culprit(SppPlayer culprit) {
            this.warningFilters.add(new SqlFilter<>(culprit.getId().toString(), Types.VARCHAR, "sp_warnings.player_uuid"));
            return this;
        }


        public WarningFiltersBuilder culpritName(String culpritName) {
            this.warningFilters.add(new SqlFilter<>(culpritName, Types.VARCHAR, "sp_warnings.player_name"));
            return this;
        }

        public WarningFiltersBuilder warnerName(String reporterName) {
            this.warningFilters.add(new SqlFilter<>(reporterName, Types.VARCHAR, "sp_warnings.warner_name"));
            return this;
        }

        public WarningFiltersBuilder warner(SppPlayer assignee) {
            this.warningFilters.add(new SqlFilter<>(assignee.getId().toString(), Types.VARCHAR, "sp_warnings.Warner_UUID"));
            return this;
        }

        public WarningFiltersBuilder reason(String reason) {
            this.warningFilters.add(new SqlFilter<>(reason, Types.VARCHAR, "sp_warnings.Reason"));
            return this;
        }

        public WarningFiltersBuilder server(String server) {
            this.warningFilters.add(new SqlFilter<>(server, Types.VARCHAR, "sp_warnings.server_name"));
            return this;
        }

        public WarningFiltersBuilder createdAfter(long timestamp) {
            this.warningFilters.add(new SqlFilter<>(timestamp, Types.BIGINT, "sp_warnings.timestamp", ">="));
            return this;
        }

        public WarningFiltersBuilder expired(boolean expired) {
            this.warningFilters.add(new SqlFilter<>(expired, Types.BOOLEAN, "sp_warnings.is_expired", "="));
            return this;
        }

        public WarningFilters build() {
            return new WarningFilters(warningFilters);
        }
    }
}
