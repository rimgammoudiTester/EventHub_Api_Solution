package eventHubApiPages.healthApis;

import genericApiKeywords.GenericApiKeyWords;
import io.restassured.response.Response;

public class HealthApis extends GenericApiKeyWords {
    /**
     * @Author Rim Gammoudi
     *
     */

    public Response getHealthCheck(String healthEndpoint) {
        return extractObject(healthEndpoint);
    }
}
