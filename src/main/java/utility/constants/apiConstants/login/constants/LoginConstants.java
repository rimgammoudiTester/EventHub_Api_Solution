package utility.constants.apiConstants.login.constants;

public class LoginConstants {


    public static final String LOGIN_ENDPOINT="getAuthenticatedUser";

    /** User credentinals **/

    public static final String USER_EMAIL="email";
    public static final String USER_PASSWORD="password";

    /** Login User Endpoint **/
    public static final String LOGIN_USER_ENDPOINT="loginEndPoint";

    /** Wrong user's credentials **/
    public static final String WRONG_USER_EMAIL="fakeEmail@gmail.com";
    public static final String WRONG_USER_PASSWORD="wrongPassword";

    /** login 's response properties**/
    public static final String TOKEN_PROPERTY="token";
    public static final String USER_OBJECT_JSON_PROPERTY="user";
    public static final String USER_EMAIL_PROPERTY=USER_OBJECT_JSON_PROPERTY+"."+"email";




    /** login 's response value**/
    public static final String USER_NOT_FOUND_CODE="User not found";
    public static final String INVALID_CREDENTIALS_CODE="Invalid credentials";







}
