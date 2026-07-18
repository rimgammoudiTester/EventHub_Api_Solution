package ClientUITests.events;

import bases.uiBase.UiBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EventsTests extends UiBase {

    /**@Author
     * Rim Gammoudi
     */

    @DataProvider
    public Object[][] getTheActionsToPerform() {

        return new Object[][]{
                {}

        };
    }

    @DataProvider
    public Object[][] getFilterInformationsToSearch() {

        return new Object[][]{
                {}

        };
    }


    @Test(description = "search for event by searchbar")
    public void searchForEventBySearchBar() {


    }

    @Test(description = "check if event's buttons access to the right page ", dataProvider = "getTheActionsToPerform")
    public void checkIfEventButtonsAccessToTheRightPage() {


    }

    @Test(description = "search the event By the filter", dataProvider = "getFilterInformationsToSearch")
    public void searchByFilter() {


    }


}
