package net.shortninja.staffplusplus.reports;

public enum ReportStatus {
    OPEN,
    RESOLVED,
    EXPIRED,
    IN_PROGRESS,
    DELETED,
    REJECTED;

    public boolean isClosed() {
        return this == RESOLVED || this == EXPIRED || this == REJECTED || this == DELETED;
    }
}
