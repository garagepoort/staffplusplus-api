package net.shortninja.staffplusplus.reports;

import java.util.List;

public interface ReportService {

    long getReportCount(ReportFilters reportFilter);

    List<? extends IReport> findReports(ReportFilters reportFilters, int offset, int amount);
}
