package bases.uiBase;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import configUtility.propertyReader.PropertyReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utility.frontUtility.AuthentificationAndDisconnectionUtility;

import static utility.constants.uiConstants.UiConstants.BROWSER;
import static utility.constants.uiConstants.UiConstants.EVENTHUB_WEBSITE;

public class UiBase extends PropertyReader {
    /**
     * @Author Rim Gammoudi
     */
    protected Page page;
    Browser browser;
    //AuthentificationAndDisconnectionUtility authentifcationDisconnection;
    public static Logger log = LogManager.getLogger(UiBase.class);

    @BeforeClass
    public void setUpConfigAndAcessWebPage()  {

        if (!getPropertyFromConfigFile(BROWSER).equalsIgnoreCase("")) {
            Playwright playwright = Playwright.create();
            //authentifcationDisconnection=new AuthentificationAndDisconnectionUtility(page);
            if (getPropertyFromConfigFile(BROWSER).equalsIgnoreCase("CHROME"))
            {
                browser = playwright.chromium().launch(
                        new BrowserType.LaunchOptions().setHeadless(false)
                );
                System.out.println("the project is already running in Chrome : ");



            } else if (getPropertyFromConfigFile(BROWSER).equalsIgnoreCase("FIREFOX")) {

                browser = playwright.firefox().launch();
                log.info("the project is already running in firefox : ");

            } else {
                log.info("Wrong browser entered,give the correct browser");
            }

           page = browser.newPage();
            page.navigate(getPropertyFromConfigFile(EVENTHUB_WEBSITE));
            //page.waitForURL(getPropertyFromConfigFile(EVENTHUB_WEBSITE));
            System.out.println("the url is : " + page.url());

        }
    }


    //Method useful to connect user to his own espace

    public void loginAndAccessEspace(String email,String password)
    {

        //authentifcationDisconnection.login(email, password);
    }


    @AfterClass
    public void disconnect()
    {
        //authentifcationDisconnection.disconnectFromWebsite();
        page.close();
    }



    }

