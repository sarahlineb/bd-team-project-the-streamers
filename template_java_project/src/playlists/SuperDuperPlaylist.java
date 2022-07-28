package playlists;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "SuperDuper_Playlist")
public class SuperDuperPlaylist {
    private String trackNumber;
    private String genreKey;
    private String artist;
    private String songTitle;

    @DynamoDBHashKey(attributeName = "track_number")
    public String getTrackNumber() {
        return trackNumber;
    }

    @DynamoDBRangeKey(attributeName = "genre_key")
    public String getGenreKey() {
        return genreKey;
    }

    @DynamoDBAttribute(attributeName = "artist")
    public String getArtist() {
        return artist;
    }

    @DynamoDBAttribute(attributeName = "song_title")
    public String getSongTitle() {
        return songTitle;
    }
}
