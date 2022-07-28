package activity;

import com.amazonaws.services.lambda.runtime.Context;
import dao.PlaylistDao;
import dynamoDB.Playlist;
import models.PlaylistModel;
import models.SongModel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import requests.GeneratePlaylistRequest;
import results.GeneratePlaylistResult;

public class GeneratePlaylistActivity implements RequestHandler <GeneratePlaylistRequest, GeneratePlaylistResult> {
    private final Logger log = LogManager.getLogger();
    private final PlaylistDao playlistDao;

    public GeneratePlaylistActivity(PlaylistDao playlistDao) {
        this.playlistDao = playlistDao;
    }


    @Override
    public GeneratePlaylistResult handleRequest(GeneratePlaylistRequest generatePlaylistRequest, Context context) {
        log.info("Received Generate Playlist Request {}", generatePlaylistRequest);
        String requestedId = generatePlaylistRequest.getPlaylistId();
        Playlist playlist = playlistDao.getPlaylist(requestedId);
        playlist.getSongInfo();
        for (int i = 0; i< playlist.getSongInfo().size(); i++) {
        }

        return GeneratePlaylistResult.builder()
                .withPlaylistModel(PlaylistModel.builder()
                        .withPlaylistId(playlist.getPlaylistId())
                        .build())
                .build();
    }
}
