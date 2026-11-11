package apiTests.healthApiTests;
import eventHubApiPages.healthApis.HealthApis;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import static configUtility.propertyReader.PropertyReader.getPropertyFromConfigFile;
import static utility.constants.apiConstants.ApiConstants.HEALTH_ENDPOINT;
import static utility.constants.apiConstants.ApiConstants.SUCCESS_CODE;
import static utility.constants.apiConstants.HealthApiConstants.*;

public class HealthApiTests extends HealthApis {


    // extract the health check
    @Test(description = "getHealthCheck")
    public void extractHealthCheck() {
        String status;
        String dbStatus;
        String time;
        Response res = getHealthCheck(getPropertyFromConfigFile(HEALTH_ENDPOINT));
        Assertions.assertThat(res.getStatusCode()).isEqualTo(SUCCESS_CODE);
        status = res.path(STATUS);
        dbStatus = res.path(DB_STATUS);
        time = res.path(TIMES_TAMP);
        Assertions.assertThat(status).isEqualTo("ok");
        Assertions.assertThat(dbStatus).isEqualTo("connected");
       // Assertions.assertThat(time).isEqualTo(actualDate());

    }
}
