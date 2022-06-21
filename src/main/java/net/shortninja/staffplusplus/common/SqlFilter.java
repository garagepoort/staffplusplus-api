package net.shortninja.staffplusplus.common;

public class SqlFilter<T> implements ISqlFilter{

    private final T value;
    private final int sqlType;
    private final String sqlColumn;
    private String operator = "=";

    public SqlFilter(T value, int sqlType, String sqlColumn) {
        this.value = value;
        this.sqlType = sqlType;
        this.sqlColumn = sqlColumn;
    }
    public SqlFilter(T value, int sqlType, String sqlColumn, String operator) {
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
