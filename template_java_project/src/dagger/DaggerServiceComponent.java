package dagger;

import activity.GeneratePlaylistActivity;
import dao.GenreDao;
import dao.PlaylistDao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;


@Generated(
        value = "dagger.internal.codegen.ComponentProcessor",
        comments = "https://google.github.io/dagger"
)
public final class DaggerServiceComponent implements ServiceComponent {
    private Provider<DynamoDBMapper> dynamoDBMapperProvider;

    private DaggerServiceComponent(Builder builder) {
        initialize(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceComponent create() {
        return new Builder().build();
    }

    private PlaylistDao getPlaylistDao() {
        return new PlaylistDao(dynamoDBMapperProvider.get());
    }

    private GenreDao getGenreDao() {
        return new GenreDao(dynamoDBMapperProvider.get());
    }

    private void initialize(final Builder builder) {
        this.dynamoDBMapperProvider =
                DoubleCheck.provider(MapperDependency.create(builder.daoModule));
    }

    @Override
    public GeneratePlaylistActivity provideGeneratePlaylistActivity() {
        return new GeneratePlaylistActivity(getPlaylistDao());
    }

    public static final class Builder {
        private DaoModule daoModule;

        private Builder() {
        }

        public ServiceComponent build() {
            if (daoModule == null) {
                this.daoModule = new DaoModule();
            }
            return new DaggerServiceComponent(this);
        }

        public Builder daoModule(DaoModule daoModule) {
            this.daoModule = Preconditions.checkNotNull(daoModule);
            return this;
        }
    }
}


