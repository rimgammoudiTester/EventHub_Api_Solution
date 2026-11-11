package apiTests.authentificationApiTests;

import eventHubApiPages.authentificationApis.AuthentificationApis;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pojoClasses.userPojo.UserPojo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static bases.apiBasePage.ApiBasePage.log;
import static configUtility.jsonReader.JsonReader.readJson;
import static configUtility.propertyReader.PropertyReader.getPropertyFromConfigFile;
import static configUtility.propertyReader.PropertyReader.readPropertyNameFromConfigFile;
import static utility.constants.apiConstants.ApiConstants.*;
import static utility.constants.apiConstants.login.constants.LoginConstants.*;
import static utility.constants.apiConstants.login.constants.LoginConstants.USER_PASSWORD;

public class getTheAuthenticatedApiTests extends AuthentificationApis {

    /**
     * Author
     * Rim Gammoudi
     *
     */

    UserPojo userPojo;
    LinkedHashMap<String, Object> loginMap;
    Map<String,String>loginHeader=new HashMap<>();

    boolean success;


    @BeforeClass
    public void initializeTheNecessaryClass() {
        String USER_JSON_PATH = "src/main/models/login.json";
        loginMap = readJson(USER_JSON_PATH);
        readPropertyNameFromConfigFile();
        userPojo = new UserPojo(loginMap.get(USER_EMAIL).toString(), loginMap.get(USER_PASSWORD).toString());
    }

    // Method useful to get The authenticated user
    @Test()
    public void getTheCurrentAuthentificatedUser() {
        Response res,loginResponse;
        String userEmail;
        String  token="";
        System.out.println("hello"+getPropertyFromConfigFile(LOGIN));
        loginResponse =login(getPropertyFromConfigFile(LOGIN),userPojo);
        token = loginResponse.path("token");
        loginHeader.put("Authorization", "Bearer " +token);
        loginHeader.put("Content-Type", "application/json");
        res = getTheAuthentificationUser(getPropertyFromConfigFile(LOGIN_ENDPOINT),loginHeader).then().extract().response();
        System.out.println(res.getBody().prettyPrint());
        Assertions.assertThat(res.getStatusCode()).isEqualTo(SUCCESS_CODE);
        log.info("The current authenticated user api return :" + SUCCESS_CODE);
        success=res.path(SUCCESS_PROPERTY);
        userEmail = res.path(USER_EMAIL_PROPERTY);
        Assertions.assertThat(success).isTrue();
        log.info("The success property of the api response is successfully returning true");
        Assertions.assertThat(userEmail).isEqualTo(userPojo.getEmail());
        log.info("The login api is successfully returning the same Email given ");


    }

    // Method useful to get The authenticated user
    @Test()
    public void returnUnauthorizedErrorCode() {
        Response res;
        res = getTheAuthentificationUserWithoutToken(getPropertyFromConfigFile(LOGIN_ENDPOINT));
        System.out.println(res.getBody().prettyPrint());
        Assertions.assertThat(res.getStatusCode()).isEqualTo(UNAUTHORIZED_CODE);
        log.info("The current authenticated user api return :" +UNAUTHORIZED_CODE);


    }

}
