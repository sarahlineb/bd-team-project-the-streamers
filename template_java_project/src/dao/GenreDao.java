package dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dynamoDB.Playlist;
import dynamoDB.UndergroundGenreModel;
import exceptions.InvalidPlaylistIdException;

import javax.inject.Inject;
import javax.naming.directory.InvalidAttributesException;

public class GenreDao {

    private final DynamoDBMapper dynamoDBMapper;

    @Inject
    public GenreDao(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public UndergroundGenreModel undergroundGenreModel (String genre, String genreKey) throws InvalidAttributesException {
        UndergroundGenreModel undergroundGenreModel = dynamoDBMapper.load(UndergroundGenreModel.class, genre, genreKey);

        if(undergroundGenreModel == null) {
            throw new InvalidAttributesException("Invalid Input");
        }

        return undergroundGenreModel;
    }

    public Playlist getPlaylist(String playlistId) {
        Playlist playlist = this.dynamoDBMapper.load(Playlist.class, playlistId);
        if (playlist == null) {
            throw new InvalidPlaylistIdException("Playlist Does Not Exist, Bitch" + playlistId);
        }
        return playlist;
    }
}
