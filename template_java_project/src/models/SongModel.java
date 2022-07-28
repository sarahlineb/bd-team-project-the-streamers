package models;
import java.util.Objects;

public class SongModel {
    private String trackNumber;
    private String genreKey;
    private String artist;
    private String songTitle;

    public SongModel() {}

    public SongModel (Builder builder) {
        this.trackNumber = builder.trackNumber;
        this.genreKey = builder.genreKey;
        this.artist = builder.artist;
        this.songTitle = builder.songTitle;
    }

    public String getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(String trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getGenreKey() {
        return genreKey;
    }

    public void setGenreKey(String genreKey) {
        this.genreKey = genreKey;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SongModel songModel = (SongModel) o;
        return Objects.equals(trackNumber, songModel.trackNumber) && Objects.equals(genreKey, songModel.genreKey) && Objects.equals(artist, songModel.artist) && Objects.equals(songTitle, songModel.songTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trackNumber, genreKey, artist, songTitle);
    }

    @Override
    public String toString() {
        return "SongModel{" +
                "trackNumber='" + trackNumber + '\'' +
                ", genreKey='" + genreKey + '\'' +
                ", artist='" + artist + '\'' +
                ", songTitle='" + songTitle + '\'' +
                '}';
    }

    public static Builder builder() { return new Builder(); }

    public static final class Builder {
        private String trackNumber;
        private String genreKey;
        private String artist;
        private String songTitle;

        private Builder withTrackNumber (String trackNumberToUse) {
            this.trackNumber = trackNumberToUse;
            return this;
        }

        private Builder withGenreKey (String genreKeyToUse) {
            this.genreKey = genreKeyToUse;
            return this;
        }

        private Builder withArtist (String artistToUse) {
            this.artist = artistToUse;
            return this;
        }

        private Builder withSongTitle (String songTitleToUse) {
            this.songTitle = songTitleToUse;
            return this;
        }
    }
}
