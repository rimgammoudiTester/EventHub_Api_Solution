package utility.frontUtility;

import com.microsoft.playwright.Page;
import eventHubUiPages.authentificationPages.Authentifications;
//import eventHubUiPages.disconnection.Disconnection;
import org.testng.annotations.BeforeClass;

public class AuthentificationAndDisconnectionUtility extends Authentifications {
    /**@author
     * Rim Gammoudi
     */
    //Utility class problem ****
    Authentifications authentificationClass;
    //Disconnection disconnectionClass;

    public AuthentificationAndDisconnectionUtility(Page page) {
        super(page);
    }

    @BeforeClass()
    public void intializeAuthetificationAndDisconnectionClasses()
    {
        authentificationClass=new Authentifications(page);
        //disconnectionClass=new Disconnection(page);

    }

    //Method useful to perform login

    public  void login(String emailUser,String passwordUser)
    {
        authentificationClass.login(emailUser,passwordUser);

    }

     //Method useful to disconnect from website
    public  void disconnectFromWebsite()
    {

      //disconnectionClass.disconnect();
    }
}
