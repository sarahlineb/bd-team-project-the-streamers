package dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dynamoDB.Playlist;
import models.UndergroundGenreModel;
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

    public UndergroundGenreModel getUndergroundPlaylist(String genreKey) {
        UndergroundGenreModel undergroundGenreModel = this.dynamoDBMapper.load(UndergroundGenreModel.class, genreKey);
        if (undergroundGenreModel == null) {
            throw new InvalidPlaylistIdException("Playlist Does Not Exist, Bitch" + undergroundGenreModel);
        }
        return undergroundGenreModel;
    }

}
