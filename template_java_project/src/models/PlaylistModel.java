package models;

import dynamoDB.MainstreamTrackModel;
import java.util.List;
import java.util.Objects;

public class PlaylistModel {
    private String playlistId;
    private int songCount;
    private List<MainstreamTrackModel> songInfo;

    public PlaylistModel() {}

    public PlaylistModel(Builder builder) {
        this.playlistId = builder.playlistId;
        this.songCount = builder.songCount;
        this.songInfo = builder.songInfo;
    }

    public String getPlaylistId() {
        return playlistId;
    }

    public int getSongCount() {
        return songCount;
    }

    public List<MainstreamTrackModel> getSongInfo() {
        return songInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaylistModel that = (PlaylistModel) o;
        return songCount == that.songCount &&
                playlistId.equals(that.playlistId) &&
                songInfo.equals(that.songInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playlistId, songCount, songInfo);
    }

    @Override
    public String toString() {
        return "PlaylistModel{" +
                "playlistId='" + playlistId + '\'' +
                ", songCount=" + songCount +
                ", songInfo=" + songInfo +
                '}';
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {
        private String playlistId;
        private int songCount;
        private List<MainstreamTrackModel> songInfo;

        public Builder withPlaylistId(String playlistIdToUse) {
            this.playlistId = playlistIdToUse;
            return this;
        }

        public Builder withSongCount(int songCountToUse) {
            this.songCount = songCountToUse;
            return this;
        }

        public Builder withSongInfo(List<MainstreamTrackModel> songInfoToUse) {
            this.songInfo = songInfoToUse;
            return this;
        }

        public PlaylistModel build() {return new PlaylistModel(this);}
    }

}
