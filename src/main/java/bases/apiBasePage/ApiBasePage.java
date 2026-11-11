package bases.apiBasePage;
import configUtility.propertyReader.PropertyReader;
import eventHubApiPages.authentificationApis.AuthentificationApis;
import io.restassured.response.Response;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pojoClasses.userPojo.UserPojo;

import java.util.HashMap;
import static configUtility.propertyReader.PropertyReader.getPropertyFromConfigFile;
import static configUtility.propertyReader.PropertyReader.readPropertyNameFromConfigFile;
import static utility.constants.apiConstants.ApiConstants.LOGIN;
import static utility.constants.uiConstants.loginConstants.USER_EMAIL;
import static utility.constants.uiConstants.loginConstants.USER_PASSWORD;

public class ApiBasePage {
    public static final Log log = LogFactory.getLog(ApiBasePage.class);

    /**
     * @Author Rim Gammoudi
     */
    public static String token;
    AuthentificationApis authentif;
    UserPojo userPojo;
    PropertyReader propertyReader;


    //Method useful to generate access Token
    @BeforeClass()
    public void generateToken() {
        authentif=new AuthentificationApis();
        readPropertyNameFromConfigFile();
        userPojo=new UserPojo(getPropertyFromConfigFile(USER_EMAIL),getPropertyFromConfigFile(USER_PASSWORD));
        Response res =authentif.login(getPropertyFromConfigFile(LOGIN),userPojo);
        token = res.path("token");
    }
    //Method useful to set up the headers for apis

    public HashMap<String, String> intializeTheHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Authorization", "Bearer " + token);
        headers.put("Content-Type", "application/json");
        return headers;
    }

    @AfterClass
    public void killTheToken() {

        if (!token.isEmpty()) {

            log.info("the token is killed ");
        }
    }


}
