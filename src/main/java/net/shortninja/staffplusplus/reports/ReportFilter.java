package net.shortninja.staffplusplus.reports;

public class ReportFilter<T> {

    private T value;
    private int sqlType;
    private String sqlColumn;
    private String operator = "=";

    public ReportFilter(T value, int sqlType, String sqlColumn) {
        this.value = value;
        this.sqlType = sqlType;
        this.sqlColumn = sqlColumn;
    }
    public ReportFilter(T value, int sqlType, String sqlColumn, String operator) {
        this.value = value;
        this.sqlType = sqlType;
        this.sqlColumn = sqlColumn;
        this.operator = operator;
    }

    public T getValue() {
        return value;
    }

    public String getSqlColumn() {
        return sqlColumn;
    }

    public int getSqlType() {
        return sqlType;
    }

    public String getOperator() {
        return operator;
    }
}
