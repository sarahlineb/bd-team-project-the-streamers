package activity;

import com.amazonaws.services.lambda.runtime.Context;
import dao.GenreDao;
import dao.PlaylistDao;
import models.MainstreamSongModel;
import dynamoDB.Playlist;
import models.PlaylistModel;
import models.UndergroundGenreModel;
import models.UndergroundSongModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import requests.GeneratePlaylistRequest;
import results.GeneratePlaylistResult;

import java.util.*;

public class GeneratePlaylistActivity implements RequestHandler <GeneratePlaylistRequest, GeneratePlaylistResult> {
    private final Logger log = LogManager.getLogger();
    private final PlaylistDao playlistDao;
    private final GenreDao genreDao;

    public GeneratePlaylistActivity(PlaylistDao playlistDao, GenreDao genreDao) {
        this.playlistDao = playlistDao;
        this.genreDao = genreDao;
    }


    @Override
    public GeneratePlaylistResult handleRequest(GeneratePlaylistRequest generatePlaylistRequest, Context context) {
        log.info("Received Generate Playlist Request {}", generatePlaylistRequest);
        String requestedId = generatePlaylistRequest.getPlaylistId();
        Playlist playlist = playlistDao.getPlaylist(requestedId);
        List<MainstreamSongModel> newPlaylist = playlist.getSongInfo();
        Map<String, Integer> genreCount = new HashMap<>();
        for (int i = 0; i< newPlaylist.size(); i++) {
            String genreKey = newPlaylist.get(i).getGenreKey();
            if (genreCount.containsKey(genreKey)) {
                genreCount.put(genreKey, genreCount.get(genreKey)+1);
            } else {
                genreCount.put(genreKey, 1);
            }
        }
        UndergroundGenreModel undergroundGenreModel;
        List<UndergroundSongModel> undergroundPlaylist = new ArrayList<>();
        for(String genreKey : genreCount.keySet()) {
            undergroundGenreModel = genreDao.getUndergroundPlaylist(genreKey);
            for(int i = 0; i < genreCount.get(genreKey); i++) {
                undergroundPlaylist = undergroundGenreModel.getSongInfo();
                Collections.shuffle(undergroundPlaylist);
                List<UndergroundSongModel> newGeneratedList = new ArrayList<>();
                newGeneratedList.add(undergroundPlaylist);
            }
        }

        return GeneratePlaylistResult.builder()
                .withPlaylistModel(PlaylistModel.builder()
                        .withPlaylistId(playlist.getPlaylistId())
                        .build())
                .build();
    }
}
