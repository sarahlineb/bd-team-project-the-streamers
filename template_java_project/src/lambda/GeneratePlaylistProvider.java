package lambda;

import com.amazonaws.services.lambda.runtime.Context;
import dagger.DaggerServiceComponent;
import dagger.ServiceComponent;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import requests.GeneratePlaylistRequest;
import results.GeneratePlaylistResult;


public class GeneratePlaylistProvider implements RequestHandler<GeneratePlaylistRequest, GeneratePlaylistResult> {
    public GeneratePlaylistProvider() {}

    @Override
    public GeneratePlaylistResult handleRequest(final GeneratePlaylistRequest generatePlaylistRequest, Context context) {
        return serviceComponent().provideGeneratePlaylistActivity().handleRequest(generatePlaylistRequest, context);
    }

    private ServiceComponent serviceComponent() {
        ServiceComponent dagger = DaggerServiceComponent.create();
        return dagger;
    }

}
