package eventHubApiPages.configApis;
import genericApiKeywords.GenericApiKeyWords;
import io.restassured.response.Response;

public class ConfigApis extends GenericApiKeyWords {
    /**
     * @Author Rim Gammoudi
     *
     */
    public Response getConfig(String configEndpoint) {
        return extractObject(configEndpoint);
    }
}
