package net.shortninja.staffplusplus.mute;

import net.shortninja.staffplusplus.ban.BanFilters;
import net.shortninja.staffplusplus.common.ISqlFilter;
import net.shortninja.staffplusplus.common.OrSqlFilter;
import net.shortninja.staffplusplus.common.SqlFilter;
import net.shortninja.staffplusplus.common.SqlFilters;
import net.shortninja.staffplusplus.session.SppPlayer;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class MuteFilters extends SqlFilters {

    public MuteFilters(List<ISqlFilter> sqlFilters) {
        super(sqlFilters);
    }

    public static class MuteFiltersBuilder {

        private final List<ISqlFilter> sqlFilters = new ArrayList<>();

        public MuteFiltersBuilder id(int id) {
            this.sqlFilters.add(new SqlFilter<>(id, Types.INTEGER, "sp_muted_players.ID"));
            return this;
        }

        public MuteFiltersBuilder active() {
            this.sqlFilters.add(new OrSqlFilter<>(
                    new SqlFilter<>(null, Types.BIGINT, "sp_muted_players.end_timestamp"),
                    new SqlFilter<>(System.currentTimeMillis(), Types.BIGINT, "sp_muted_players.end_timestamp", ">")
            ));
            return this;
        }

        public MuteFiltersBuilder notActive() {
            this.sqlFilters.add(new SqlFilter<>(System.currentTimeMillis(), Types.BIGINT, "sp_muted_players.end_timestamp", "<="));
            return this;
        }

        public MuteFiltersBuilder target(SppPlayer target) {
            this.sqlFilters.add(new SqlFilter<>(target.getId().toString(), Types.VARCHAR, "sp_muted_players.player_uuid"));
            return this;
        }

        public MuteFiltersBuilder targetName(String targetName) {
            this.sqlFilters.add(new SqlFilter<>(targetName, Types.VARCHAR, "sp_muted_players.player_name"));
            return this;
        }

        public MuteFiltersBuilder issuer(SppPlayer issuer) {
            this.sqlFilters.add(new SqlFilter<>(issuer.getId().toString(), Types.VARCHAR, "sp_muted_players.issuer_uuid"));
            return this;
        }

        public MuteFiltersBuilder issuerName(String issuerName) {
            this.sqlFilters.add(new SqlFilter<>(issuerName, Types.VARCHAR, "sp_muted_players.issuer_name"));
            return this;
        }

        public MuteFiltersBuilder server(String server) {
            this.sqlFilters.add(new SqlFilter<>(server, Types.VARCHAR, "sp_muted_players.server_name"));
            return this;
        }

        public MuteFiltersBuilder reason(String reason) {
            this.sqlFilters.add(new SqlFilter<>(reason, Types.VARCHAR, "sp_muted_players.reason"));
            return this;
        }

        public MuteFiltersBuilder createdAfter(long timestamp) {
            this.sqlFilters.add(new SqlFilter<>(timestamp, Types.BIGINT, "sp_muted_players.creation_timestamp", ">="));
            return this;
        }

        public MuteFilters build() {
            return new MuteFilters(sqlFilters);
        }
    }
}
