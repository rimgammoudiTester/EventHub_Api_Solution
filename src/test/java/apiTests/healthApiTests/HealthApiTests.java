/*package apiTests.healthApiTests;

/import eventHubApiPages.healthApis.HealthApis;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.function.Predicate;

import static utility.constants.apiConstants.ApiConstants.HEALTH_ENDPOINT;
import static utility.constants.apiConstants.ApiConstants.SUCCESS_CODE;
import static utility.constants.apiConstants.HealthApiConstants.*;

public class HealthApiTests extends HealthApis{



    // extract the health check
    @Test(description ="getHealthCheck")
    public void extractHealthCheck()
    {
        Response res=getHealthCheck(HEALTH_ENDPOINT);
        Assertions.assertThat(res.getStatusCode()).isEqualTo(SUCCESS_CODE);
          JsonPath jsonBody=res.body().jsonPath();
        Assertions.assertThat(jsonBody.get(STATUS)).isEqualTo("ok");
        Assertions.assertThat(jsonBody.get(DB_STATUS)).isEqualTo("connected");
        Assertions.assertThat(jsonBody.get(TIMES_TAMP)).isEqualTo(actualDate());


    }
}*/
