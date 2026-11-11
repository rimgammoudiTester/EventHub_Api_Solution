package eventHubApiPages.authentificationApis;
import configUtility.propertyReader.PropertyReader;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojoClasses.userPojo.UserPojo;
import java.util.Map;

import static configUtility.propertyReader.PropertyReader.getPropertyFromConfigFile;
import static configUtility.propertyReader.PropertyReader.readPropertyNameFromConfigFile;
import static io.restassured.RestAssured.given;
import static utility.constants.apiConstants.ApiConstants.BASE_URI;

public class AuthentificationApis {

    /**
     * Author
     * Rim Gammoudi
     *
     */





    PropertyReader propertyReader;
   // String tokenValue=;
    public RequestSpecification setUpBaseUriOfAuthentificatedApi()
    {
        readPropertyNameFromConfigFile();
        return given().baseUri(getPropertyFromConfigFile(BASE_URI));

    }

    public Response login(String loginEndpoint, UserPojo payload) {
        return setUpBaseUriOfAuthentificatedApi().contentType(ContentType.JSON).body(payload).post(loginEndpoint).then().extract().response();
    }

    public Response getTheAuthentificationUser(String authEndpoint,Map<String,String>headers) {
        return setUpBaseUriOfAuthentificatedApi().headers(headers).contentType(ContentType.JSON).get(authEndpoint).then().extract().response();
    }

    public Response getTheAuthentificationUserWithoutToken(String authEndpoint) {
        return setUpBaseUriOfAuthentificatedApi().contentType(ContentType.JSON).get(authEndpoint);
    }




}
