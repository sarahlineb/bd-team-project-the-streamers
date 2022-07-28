package dynamoDB;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import models.MainstreamSongModel;
import models.MainstreamTrackModel;

import java.util.List;

@DynamoDBTable(tableName = "StreamersPlaylists")
public class Playlist {
    private String playlistId;
    private int songCount;
    private List<MainstreamSongModel> songInfo;

    @DynamoDBHashKey(attributeName = "playlist_id")
    public String getPlaylistId() {
        return playlistId;
    }

    @DynamoDBAttribute(attributeName = "song_count")
    public int getSongCount() {
        return songCount;
    }

    @DynamoDBAttribute(attributeName = "song_info")
    public List<MainstreamSongModel> getSongInfo() {
        System.out.println(songInfo);
        return songInfo;
    }
}
