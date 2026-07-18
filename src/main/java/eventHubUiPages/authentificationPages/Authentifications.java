package eventHubUiPages.authentificationPages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import genericUiKeywords.GenericUiKeyWords;

public class Authentifications extends GenericUiKeyWords {

    /**
     * Author
     * Rim Gammoudi
     */
    //public Page page;

    //Locators for login page
    public Authentifications(Page page)
    {
        super(page);
    }

    private final Locator emailLocator = page.locator("#email");
    private final Locator passwordLocator = page.locator("#password");
    private final Locator signInButton = page.locator("#login-btn");
    private final Locator registerLink = page.getByText("Register");



//Methods for login page

    //Method uesful to login

    public void login(String emailOfUser,String passwordOfUser)
    {
        fillInWebElement(emailLocator,emailOfUser);
        fillInWebElement(passwordLocator,passwordOfUser);
        clickInElement(signInButton);
        page.waitForTimeout(2000);
        reloadThePage();

    }
    //Method uesful to accesss register

    public void acessToRegister()
    {

    }



}
