package dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dynamoDB.Playlist;
import exceptions.InvalidPlaylistIdException;

import javax.inject.Inject;

public class PlaylistDao {
    private final DynamoDBMapper dynamoDBMapper;

    @Inject
    public PlaylistDao(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public Playlist getPlaylist(String playlistId) {
        Playlist playlist = this.dynamoDBMapper.load(Playlist.class, playlistId);
        if (playlist == null) {
            throw new InvalidPlaylistIdException("Playlist Does Not Exist, Bitch" + playlistId);
        }
        return playlist;
    }
}
