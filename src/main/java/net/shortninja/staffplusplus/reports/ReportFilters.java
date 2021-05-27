package net.shortninja.staffplusplus.reports;

import net.shortninja.staffplusplus.session.SppPlayer;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ReportFilters {

    private List<ReportFilter> reportFilters;

    private ReportFilters(List<ReportFilter> reportFilters) {
        this.reportFilters = reportFilters;
    }

    public List<ReportFilter> getReportFilters() {
        return reportFilters;
    }

    public static class ReportFiltersBuilder {

        private List<ReportFilter> reportFilters = new ArrayList<>();

        public ReportFiltersBuilder id(int id) {
            this.reportFilters.add(new ReportFilter<>(id, Types.INTEGER, "sp_reports.id"));
            return this;
        }
        
        public ReportFiltersBuilder reportStatus(ReportStatus reportStatus) {
            this.reportFilters.add(new ReportFilter<>(reportStatus.name(), Types.VARCHAR, "sp_reports.status"));
            return this;
        }

        public ReportFiltersBuilder anyOfReportStatus(List<ReportStatus> reportStatuses) {
            this.reportFilters.add(new ReportFilter<>(reportStatuses.stream().map(Enum::name).collect(Collectors.toList()), Types.VARCHAR, "sp_reports.status"));
            return this;
        }

        public ReportFiltersBuilder culprit(SppPlayer culprit) {
            this.reportFilters.add(new ReportFilter<>(culprit.getId().toString(), Types.VARCHAR, "sp_reports.player_uuid"));
            return this;
        }

        public ReportFiltersBuilder reporter(SppPlayer reporter) {
            this.reportFilters.add(new ReportFilter<>(reporter.getId().toString(), Types.VARCHAR, "sp_reports.reporter_uuid"));
            return this;
        }

        public ReportFiltersBuilder reportName(String reporterName) {
            this.reportFilters.add(new ReportFilter<>(reporterName, Types.VARCHAR, "sp_reports.reporter_name"));
            return this;
        }

        public ReportFiltersBuilder assignee(SppPlayer assignee) {
            this.reportFilters.add(new ReportFilter<>(assignee.getId().toString(), Types.VARCHAR, "sp_reports.staff_uuid"));
            return this;
        }

        public ReportFiltersBuilder assigneeName(String assignee) {
            this.reportFilters.add(new ReportFilter<>(assignee, Types.VARCHAR, "sp_reports.staff_name"));
            return this;
        }

        public ReportFiltersBuilder type(String type) {
            this.reportFilters.add(new ReportFilter<>(type, Types.VARCHAR, "sp_reports.type"));
            return this;
        }

        public ReportFiltersBuilder server(String server) {
            this.reportFilters.add(new ReportFilter<>(server, Types.VARCHAR, "sp_reports.server_name"));
            return this;
        }

        public ReportFiltersBuilder culpritName(String culpritName) {
            this.reportFilters.add(new ReportFilter<>(culpritName, Types.VARCHAR, "sp_reports.player_name"));
            return this;
        }

        public ReportFiltersBuilder createdAfter(long timestamp) {
            this.reportFilters.add(new ReportFilter<>(timestamp, Types.BIGINT, "sp_reports.timestamp", ">="));
            return this;
        }

        public ReportFilters build() {
            return new ReportFilters(reportFilters);
        }
    }
}
