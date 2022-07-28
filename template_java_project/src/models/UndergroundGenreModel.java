package models;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

import java.util.Map;
import java.util.Set;

@DynamoDBTable(tableName = "Genre")
public class UndergroundGenreModel {
    private String genre;
    private String genreKey;
    private Set<String> songInfo;
    //public static final Map<String, String>

    @DynamoDBHashKey(attributeName = "genre")
    public String getGenre() {
        return genre;
    }

    @DynamoDBAttribute(attributeName = "genre_key")
    public String getGenreKey() {
        return genreKey;
    }

    @DynamoDBAttribute(attributeName = "song_info")
    public Set<String> getSongInfo() {
        return songInfo;
    }
}
