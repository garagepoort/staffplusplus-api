package net.shortninja.staffplusplus.common;

public class OrSqlFilter<T, R> implements ISqlFilter {

    private final SqlFilter<T> left;
    private final SqlFilter<R> right;

    public OrSqlFilter(SqlFilter<T> left, SqlFilter<R> right) {
        this.left = left;
        this.right = right;
    }

    public SqlFilter<T> getLeft() {
        return left;
    }

    public SqlFilter<R> getRight() {
        return right;
    }
}
