package ClientUITests.addEventTests;

import bases.uiBase.UiBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddEventsTests extends UiBase {
    /**@Author
     * Rim Gammoudi
     */

    @DataProvider
    public Object[][] getTheErrorMessageForBookingFields() {

        return new Object[][]{
                {}

        };
    }


    @DataProvider
    public Object[][] getTheDetailsOfEvent() {

        return new Object[][]{
                {}

        };
    }


    @Test(description = "Confirm booking with the correct values")
    public void confirmBookingWithTheCorrectValues() {


    }

    @Test(dataProvider = "getTheErrorMessageForBookingFields", description = "Confirm the booking with incorrect values")
    public void confirmBookingWithTheIncorrectValues() {


    }

    @Test(dataProvider = "getTheDetailsOfEvent", description = "extract the details of event ")
    public void extractTheDetailsOfEvent() {


    }

    @Test(description = "verify The total of event ticket booking")
    public void verifyTheTotalOfEventTicketBooking() {


    }

}
