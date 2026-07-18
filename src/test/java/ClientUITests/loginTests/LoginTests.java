package ClientUITests.loginTests;

import bases.uiBase.UiBase;
import org.assertj.core.api.Assertions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class LoginTests extends UiBase {
    /**@Author
     * Rim Gammoudi
     */


    @DataProvider
    public Object[][] getTheLinksOfLoginPage() {

        return new Object[][]{
                {}

        };
    }




    @DataProvider
    public Object[][] getAuthentificationCredentinals()
    {

        return  new Object[][]
                {
                        {}
                };
    }

    //Method useful to establish authentification
    @Test(description="Test for verifying the login functionnality with both correct and wrong data  ",dataProvider ="getAuthentificationCredentinals")
    public void authentifyUser(String email,String password)
    {
        if(email.equalsIgnoreCase("")&&password.equalsIgnoreCase(""))
        {
            log.info("Verifying that user is successfully authetificated");

            Assertions.assertThat(page.url().equalsIgnoreCase("url"));
        }
        else if (!(email.equalsIgnoreCase("") && password.equalsIgnoreCase("")))
        {
            log.info("Verifying that user is not authetificated and the credentianls are wrong");

            Assertions.assertThat(false);

        }
        else if(!email.equalsIgnoreCase("") && password.equalsIgnoreCase(""))
        {
            log.info("Verifying that the email is incorrect");

            Assertions.assertThat(false);

        }
        else if(email.equalsIgnoreCase("") && (!password.equalsIgnoreCase("")))
        {
            log.info("Verifying that the password is incorrect");

            Assertions.assertThat(false);

        }

    }


    @Test(dataProvider = "getTheLinksOfLoginPage", description ="")
    public void verifyLinksAcccessTheAdequatePage() {

        log.info("Verifying that the links are sucessfullt directing to the correct page");

    }


}
