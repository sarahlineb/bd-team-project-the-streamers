package dagger;

import activity.GeneratePlaylistActivity;

import javax.inject.Singleton;

@Component (modules = {DaoModule.class})
@Singleton

public interface ServiceComponent {
    GeneratePlaylistActivity provideGeneratePlaylistActivity();
}
