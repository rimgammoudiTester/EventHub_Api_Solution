package ClientUITests.registartionTests;

import bases.uiBase.UiBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTests extends UiBase {
    /**@Author
     * Rim Gammoudi
     */

    @DataProvider
    public Object[][] getTheWrongRegistrationData() {

        return new Object[][]{
                {}

        };
    }

    @DataProvider
    public Object[][] getTheLinksOfRegistrationPage() {

        return new Object[][]{
                {}

        };
    }


    @Test(description = "Test resgistartion with correct email and correct password")
    public void registerUserWithCorrectData() {
     System.out.println("hello hello hello guys");

    }

    @Test(dataProvider = "getTheWrongLoginData", description = "")
    public void registerUserWithIncorrectData() {


    }

    @Test(dataProvider = "getTheLinksOfLoginPage", description = "")
    public void verifyLinksAcccessTheAdequatePage() {


    }


}
