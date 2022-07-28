package models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.List;
import java.util.Map;
import java.util.Set;

@DynamoDBTable(tableName = "UndergroundGenreSortedPlaylist")
public class UndergroundGenreModel {
    private String genreKey;
    private List<UndergroundSongModel> songInfo;
    //public static final Map<String, String>

    @DynamoDBHashKey(attributeName = "genre_key")
    public String getGenreKey() {
        return genreKey;
    }

    @DynamoDBAttribute(attributeName = "song_info")
    public List<UndergroundSongModel> getSongInfo() {
        return songInfo;
    }
}
