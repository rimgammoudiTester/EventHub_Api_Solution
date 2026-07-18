/*package bases.apiBasePage;

import io.restassured.response.Response;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;

import static configUtility.propertyReader.PropertyReader.getPropertyFromConfigFile;
import static utility.constants.apiConstants.ApiConstants.LOGIN;

public class ApiBasePage {
    private static final Log log = LogFactory.getLog(ApiBasePage.class);
    /**
     * @Author Rim Gammoudi
     */
   /* public static String token;

    //Method useful to generate access Token
    @BeforeClass()
    public void generateToken(Object authentificationPayload) {
        Response res = login(authentificationPayload, getPropertyFromConfigFile(LOGIN));
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
    public void killTheToken()
    {

       if(! token.isEmpty())
       {
           /**Missing bloc**/

         /*  log.info("the token is killed ");
       }
    }


}*/
