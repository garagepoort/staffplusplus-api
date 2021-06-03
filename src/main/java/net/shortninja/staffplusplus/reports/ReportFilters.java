package net.shortninja.staffplusplus.reports;

import net.shortninja.staffplusplus.common.SqlFilter;
import net.shortninja.staffplusplus.common.SqlFilters;
import net.shortninja.staffplusplus.session.SppPlayer;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReportFilters extends SqlFilters {

    public ReportFilters(List<SqlFilter> sqlFilters) {
        super(sqlFilters);
    }

    public static class ReportFiltersBuilder {

        private List<SqlFilter> sqlFilters = new ArrayList<>();

        public ReportFiltersBuilder id(int id) {
            this.sqlFilters.add(new SqlFilter<>(id, Types.INTEGER, "sp_reports.id"));
            return this;
        }
        
        public ReportFiltersBuilder reportStatus(ReportStatus reportStatus) {
            this.sqlFilters.add(new SqlFilter<>(reportStatus.name(), Types.VARCHAR, "sp_reports.status"));
            return this;
        }

        public ReportFiltersBuilder anyOfReportStatus(List<ReportStatus> reportStatuses) {
            this.sqlFilters.add(new SqlFilter<>(reportStatuses.stream().map(Enum::name).collect(Collectors.toList()), Types.VARCHAR, "sp_reports.status"));
            return this;
        }

        public ReportFiltersBuilder culprit(SppPlayer culprit) {
            this.sqlFilters.add(new SqlFilter<>(culprit.getId().toString(), Types.VARCHAR, "sp_reports.player_uuid"));
            return this;
        }

        public ReportFiltersBuilder reporter(SppPlayer reporter) {
            this.sqlFilters.add(new SqlFilter<>(reporter.getId().toString(), Types.VARCHAR, "sp_reports.reporter_uuid"));
            return this;
        }

        public ReportFiltersBuilder reportName(String reporterName) {
            this.sqlFilters.add(new SqlFilter<>(reporterName, Types.VARCHAR, "sp_reports.reporter_name"));
            return this;
        }

        public ReportFiltersBuilder assignee(SppPlayer assignee) {
            this.sqlFilters.add(new SqlFilter<>(assignee.getId().toString(), Types.VARCHAR, "sp_reports.staff_uuid"));
            return this;
        }

        public ReportFiltersBuilder assigneeName(String assignee) {
            this.sqlFilters.add(new SqlFilter<>(assignee, Types.VARCHAR, "sp_reports.staff_name"));
            return this;
        }

        public ReportFiltersBuilder type(String type) {
            this.sqlFilters.add(new SqlFilter<>(type, Types.VARCHAR, "sp_reports.type"));
            return this;
        }

        public ReportFiltersBuilder server(String server) {
            this.sqlFilters.add(new SqlFilter<>(server, Types.VARCHAR, "sp_reports.server_name"));
            return this;
        }

        public ReportFiltersBuilder culpritName(String culpritName) {
            this.sqlFilters.add(new SqlFilter<>(culpritName, Types.VARCHAR, "sp_reports.player_name"));
            return this;
        }

        public ReportFiltersBuilder createdAfter(long timestamp) {
            this.sqlFilters.add(new SqlFilter<>(timestamp, Types.BIGINT, "sp_reports.timestamp", ">="));
            return this;
        }

        public ReportFilters build() {
            return new ReportFilters(sqlFilters);
        }
    }
}
