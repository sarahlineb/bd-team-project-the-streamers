package dagger;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import dynamoDB.DynamoDBClientProvider;

//Having Trouble With These Imports Below
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class DaoModule {

    @Provides
    @Singleton
    public DynamoDBMapper provideDynamoDBMapper() {
        return new DynamoDBMapper(DynamoDBClientProvider.getDynamoDBClient(Regions.US_WEST_2));
    }
}
