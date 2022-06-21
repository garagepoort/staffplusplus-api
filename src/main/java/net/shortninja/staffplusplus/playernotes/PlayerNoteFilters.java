package net.shortninja.staffplusplus.playernotes;

import net.shortninja.staffplusplus.common.ISqlFilter;
import net.shortninja.staffplusplus.common.SqlFilter;
import net.shortninja.staffplusplus.common.SqlFilters;
import net.shortninja.staffplusplus.session.SppPlayer;

import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

public class PlayerNoteFilters extends SqlFilters {

    public PlayerNoteFilters(List<ISqlFilter> sqlFilters) {
        super(sqlFilters);
    }

    public static class PlayerNoteFiltersBuilder {

        private List<ISqlFilter> sqlFilters = new ArrayList<>();

        public PlayerNoteFiltersBuilder id(int id) {
            this.sqlFilters.add(new SqlFilter<>(id, Types.INTEGER, "sp_player_notes.id"));
            return this;
        }

        public PlayerNoteFiltersBuilder isPrivate() {
            this.sqlFilters.add(new SqlFilter<>(true, Types.BOOLEAN, "sp_player_notes.is_private_note"));
            return this;
        }

        public PlayerNoteFiltersBuilder isPublic() {
            this.sqlFilters.add(new SqlFilter<>(false, Types.BOOLEAN, "sp_player_notes.is_private_note"));
            return this;
        }

        public PlayerNoteFiltersBuilder target(SppPlayer target) {
            this.sqlFilters.add(new SqlFilter<>(target.getId().toString(), Types.VARCHAR, "sp_player_notes.target_uuid"));
            return this;
        }

        public PlayerNoteFiltersBuilder notedByName(String notedByName) {
            this.sqlFilters.add(new SqlFilter<>(notedByName, Types.VARCHAR, "sp_player_notes.noted_by_name"));
            return this;
        }

        public PlayerNoteFiltersBuilder note(String note) {
            this.sqlFilters.add(new SqlFilter<>("%" + note + "%", Types.VARCHAR, "sp_player_notes.note", " LIKE "));
            return this;
        }

        public PlayerNoteFiltersBuilder server(String server) {
            this.sqlFilters.add(new SqlFilter<>(server, Types.VARCHAR, "sp_player_notes.server_name"));
            return this;
        }

        public PlayerNoteFiltersBuilder createdAfter(long timestamp) {
            this.sqlFilters.add(new SqlFilter<>(timestamp, Types.BIGINT, "sp_player_notes.creation_timestamp", ">="));
            return this;
        }

        public PlayerNoteFilters build() {
            return new PlayerNoteFilters(sqlFilters);
        }
    }
}
