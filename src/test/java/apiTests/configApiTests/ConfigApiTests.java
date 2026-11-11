package apiTests.configApiTests;
import eventHubApiPages.configApis.ConfigApis;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import static configUtility.propertyReader.PropertyReader.getPropertyFromConfigFile;
import static utility.constants.apiConstants.ApiConstants.SUCCESS_CODE;
import static utility.constants.apiConstants.ConfigApiConstants.CONFIG_ENDPOINT;
import static utility.constants.apiConstants.ConfigApiConstants.SHOW_EXPLORE_LINKS;

public class ConfigApiTests extends ConfigApis {

    /**
     * @Author Rim Gammoudi
     */

    //Method useful to extract the config
    @Test()
    public void extractTheConfigList() {
        Response res;
        boolean showExploreLinksValue;
        res = getConfig(getPropertyFromConfigFile(CONFIG_ENDPOINT));
        showExploreLinksValue=res.path(SHOW_EXPLORE_LINKS);
        Assertions.assertThat(res.getStatusCode()).isEqualTo(SUCCESS_CODE);
        log.info("The config api is returning  : " + SUCCESS_CODE);
        Assertions.assertThat(showExploreLinksValue).isFalse();
        log.info("The showExploreLinksValue is successfully returning false: ");
    }
}
