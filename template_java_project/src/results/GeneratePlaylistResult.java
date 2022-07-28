package results;

import models.PlaylistModel;

public class GeneratePlaylistResult {
    private PlaylistModel playlistModel;

    public GeneratePlaylistResult (Builder builder) {
        this.playlistModel = builder.playlistModel;
    }

    public static Builder builder() {return new Builder();}

    public static final class Builder {
        private PlaylistModel playlistModel;

        public Builder withPlaylistModel(PlaylistModel playlistModelToUse) {
            this.playlistModel = playlistModelToUse;
            return this;
        }

        public GeneratePlaylistResult build() {return new GeneratePlaylistResult(this);}
    }
}
