package eventHubUiPages.authentificationPages;
import genericUiKeywords.GenericUiKeyWords;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Authentifications extends GenericUiKeyWords {

    /**
     * Author
     * Rim Gammoudi
     */
    //public Page page;

    //Locators for login page
    public Authentifications(WebDriver driver)
    {
        super(driver);
    }

    private final By emailLocator = By.xpath("#email");
    private final By passwordLocator = By.xpath("#password");
    private final By signInButton = By.xpath("#login-btn");
    private final By registerLink = By.xpath("Register");



//Methods for login page

    //Method uesful to login

    public void login(String emailOfUser,String passwordOfUser)
    {
        fillInWebElement(emailLocator,emailOfUser);
        fillInWebElement(passwordLocator,passwordOfUser);
        clickInElement(signInButton);
        //page.waitForTimeout(2000);
        reloadThePage();

    }
    //Method useful to accesss register

    public void acessToRegister()
    {

    }



}
