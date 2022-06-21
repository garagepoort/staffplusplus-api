package net.shortninja.staffplusplus.ban;

import net.shortninja.staffplusplus.common.ISqlFilter;
import net.shortninja.staffplusplus.common.OrSqlFilter;
import net.shortninja.staffplusplus.common.SqlFilter;
import net.shortninja.staffplusplus.common.SqlFilters;
import net.shortninja.staffplusplus.session.SppPlayer;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class BanFilters extends SqlFilters {

    public BanFilters(List<ISqlFilter> sqlFilters) {
        super(sqlFilters);
    }

    public static class BanFiltersBuilder {

        private final List<ISqlFilter> sqlFilters = new ArrayList<>();

        public BanFiltersBuilder id(int id) {
            this.sqlFilters.add(new SqlFilter<>(id, Types.INTEGER, "sp_banned_players.ID"));
            return this;
        }
        
        public BanFiltersBuilder active() {
            this.sqlFilters.add(new OrSqlFilter<>(
                new SqlFilter<>(null, Types.BIGINT, "sp_banned_players.end_timestamp"),
                new SqlFilter<>(System.currentTimeMillis(), Types.BIGINT, "sp_banned_players.end_timestamp", ">")
            ));
            return this;
        }

        public BanFiltersBuilder notActive() {
            this.sqlFilters.add(new SqlFilter<>(System.currentTimeMillis(), Types.BIGINT, "sp_banned_players.end_timestamp", "<="));
            return this;
        }

        public BanFiltersBuilder target(SppPlayer target) {
            this.sqlFilters.add(new SqlFilter<>(target.getId().toString(), Types.VARCHAR, "sp_banned_players.player_uuid"));
            return this;
        }

        public BanFiltersBuilder targetName(String targetName) {
            this.sqlFilters.add(new SqlFilter<>(targetName, Types.VARCHAR, "sp_banned_players.player_name"));
            return this;
        }

        public BanFiltersBuilder issuer(SppPlayer issuer) {
            this.sqlFilters.add(new SqlFilter<>(issuer.getId().toString(), Types.VARCHAR, "sp_banned_players.issuer_uuid"));
            return this;
        }

        public BanFiltersBuilder issuerName(String issuerName) {
            this.sqlFilters.add(new SqlFilter<>(issuerName, Types.VARCHAR, "sp_banned_players.issuer_name"));
            return this;
        }

        public BanFiltersBuilder server(String server) {
            this.sqlFilters.add(new SqlFilter<>(server, Types.VARCHAR, "sp_banned_players.server_name"));
            return this;
        }

        public BanFiltersBuilder createdAfter(long timestamp) {
            this.sqlFilters.add(new SqlFilter<>(timestamp, Types.BIGINT, "sp_banned_players.creation_timestamp", ">="));
            return this;
        }

        public BanFilters build() {
            return new BanFilters(sqlFilters);
        }
    }
}
