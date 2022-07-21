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
            this.warningFilters.add(new SqlFilter<>(id, Types.INTEGER, "w.id"));
            return this;
        }

        public WarningFiltersBuilder severity(String severity) {
            this.warningFilters.add(new SqlFilter<>(severity, Types.VARCHAR, "w.severity"));
            return this;
        }

        public WarningFiltersBuilder anyOfSeverity(List<String> severities) {
            this.warningFilters.add(new SqlFilter<>(severities, Types.VARCHAR, "w.severity"));
            return this;
        }

        public WarningFiltersBuilder culprit(SppPlayer culprit) {
            this.warningFilters.add(new SqlFilter<>(culprit.getId().toString(), Types.VARCHAR, "w.player_uuid"));
            return this;
        }


        public WarningFiltersBuilder culpritName(String culpritName) {
            this.warningFilters.add(new SqlFilter<>(culpritName, Types.VARCHAR, "w.player_name"));
            return this;
        }

        public WarningFiltersBuilder warnerName(String reporterName) {
            this.warningFilters.add(new SqlFilter<>(reporterName, Types.VARCHAR, "w.warner_name"));
            return this;
        }

        public WarningFiltersBuilder warner(SppPlayer assignee) {
            this.warningFilters.add(new SqlFilter<>(assignee.getId().toString(), Types.VARCHAR, "w.Warner_UUID"));
            return this;
        }

        public WarningFiltersBuilder reason(String reason) {
            this.warningFilters.add(new SqlFilter<>(reason, Types.VARCHAR, "w.Reason"));
            return this;
        }

        public WarningFiltersBuilder server(String server) {
            this.warningFilters.add(new SqlFilter<>(server, Types.VARCHAR, "w.server_name"));
            return this;
        }

        public WarningFiltersBuilder createdAfter(long timestamp) {
            this.warningFilters.add(new SqlFilter<>(timestamp, Types.BIGINT, "w.timestamp", ">="));
            return this;
        }

        public WarningFiltersBuilder expired(boolean expired) {
            this.warningFilters.add(new SqlFilter<>(expired, Types.BOOLEAN, "w.is_expired", "="));
            return this;
        }

        public WarningFilters build() {
            return new WarningFilters(warningFilters);
        }
    }
}
