package requests;

import java.util.Objects;

public class GeneratePlaylistRequest {
    private String playlistId;

    public GeneratePlaylistRequest() {}

    public GeneratePlaylistRequest(Builder builder) {
        this.playlistId = builder.playlistId;
    }

    public String getPlaylistId() {
        return playlistId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeneratePlaylistRequest that = (GeneratePlaylistRequest) o;
        return Objects.equals(playlistId, that.playlistId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playlistId);
    }

    @Override
    public String toString() {
        return "GeneratePlaylistRequest{" +
                "playlistId='" + playlistId + '\'' +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String playlistId;

        private Builder() {

        }

        public Builder withPlaylistId(String playlistIdToUse) {
            this.playlistId = playlistIdToUse;
            return this;
        }

        public GeneratePlaylistRequest build() { return new GeneratePlaylistRequest(this); }
    }
}
