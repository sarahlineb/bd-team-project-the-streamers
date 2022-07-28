package models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "MainstreamTracks")
public class MainstreamTrackModel {
    private String trackNumber;
    private String artist;
    private String genreKey;
    private String songTitle;

    @DynamoDBHashKey(attributeName = "track_number")
    public String getTrackNumber() {
        return trackNumber;
    }

    @DynamoDBAttribute(attributeName = "artist")
    public String getArtist() {
        return artist;
    }

    @DynamoDBAttribute(attributeName = "genre_key")
    public String getGenreKey() {
        return genreKey;
    }

    @DynamoDBAttribute(attributeName = "song_title")
    public String getSongTitle() {
        return songTitle;
    }
}
