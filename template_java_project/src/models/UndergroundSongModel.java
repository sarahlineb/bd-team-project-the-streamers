package models;

// This builds the Underground Song Models

public class UndergroundSongModel {
    private String artist;
    private String genreId;
    private String songTitle;

    public UndergroundSongModel() {}

    public UndergroundSongModel(Builder builder) {
        this.artist = builder.artist;
        this.genreId = builder.genreId;
        this.songTitle = builder.songTitle;
    }

    public String getGenreId() {
        return genreId;
    }

    public void setGenreId(String genreId) {
        this.genreId = genreId;
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




    public static Builder builder() { return new Builder(); }

    public static final class Builder {
        private String artist;
        private String genreId;
        private String songTitle;

        private Builder withArtist (String artistToUse) {
            this.artist = artistToUse;
            return this;
        }

        private Builder withGenreId (String genreIdToUse) {
            this.genreId = genreIdToUse;
            return this;
        }

        private Builder withSongTitle (String songTitleToUse) {
            this.songTitle = songTitleToUse;
            return this;
        }
    }
}
