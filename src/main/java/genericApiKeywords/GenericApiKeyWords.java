/*package genericApiKeywords;

import bases.apiBasePage.ApiBasePage;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.Map;

import static configUtility.propertyReader.PropertyReader.getPropertyFromConfigFile;
import static io.restassured.RestAssured.given;
import static utility.constants.apiConstants.ApiConstants.BASE_URI;

public class GenericApiKeyWords extends ApiBasePage {
    /**
     * @Author Rim Gammoudi
     *
     */
    /*RequestSpecification req = given();
    HashMap<String, String> headers = new HashMap<>();

    @BeforeClass
    public RequestSpecification setupHeaders() {

        return req = req.baseUri(getPropertyFromConfigFile(BASE_URI)).headers(intializeTheHeaders());
    }

    //Method useful to extract object by query param given
    public Response extractObjectByQueryParam(Map<String, Object> queryParamToSend, String endPoint) {

        return req.queryParams(queryParamToSend).get(endPoint).then().extract().response();

    }

    //Method useful to extract object by path parameter
    public Response extractObjectByPathParameter(String pathParameterName, Object pathParameter, String endPoint) {

        return req.pathParam(pathParameterName, pathParameter).get(endPoint).then().extract().response();

    }

    //Method useful to extract object list
    public Response extractObject(String endPoint) {

        return req.get(endPoint).then().extract().response();

    }

    //Method useful to create object
    public Response createObject(Object payload, String endPoint) {

        return req.body(payload).post(endPoint).then().extract().response();

    }

    //Method useful to delete  object By path parameter
    public Response deleteObjectByPathParameter(String pathParameterName, Object pathParameter, String endPoint) {

        return req.pathParam(pathParameterName, pathParameter).delete(endPoint).then().extract().response();

    }

    //Method useful to update object By path parameter
    public Response updateObjectByPathParameter(String pathParameterName, Object pathParameter, String endPoint) {

        return req.pathParam(pathParameterName, pathParameter).delete(endPoint).then().extract().response();

    }


}*/
