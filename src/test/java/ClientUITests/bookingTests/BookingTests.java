package ClientUITests.bookingTests;

import bases.uiBase.UiBase;
import eventHubUiPages.authentificationPages.Authentifications;
import org.assertj.core.api.Assert;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import static utility.constants.uiConstants.loginConstants.USER_EMAIL;
import static utility.constants.uiConstants.loginConstants.USER_PASSWORD;

public class BookingTests extends UiBase {

    /**
     * @Author Rim Gammoudi
     */

    @Test(description = "cancel the booking feature")
    public void cancelTheBooking() throws InterruptedException {
        Authentifications authentificationtest = new Authentifications(page);
        authentificationtest.login(getPropertyFromConfigFile(USER_EMAIL), getPropertyFromConfigFile(USER_PASSWORD));
        Assertions.assertThat(page.url()).isEqualTo("https://eventhub.rahulshettyacademy.com/");
        //loginAndAccessEspace(USER_EMAIL,USER_PASSWORD);
        log.info("you're sucessfullly logged in");


    }

    @Test(description = "view the details of booking")
    public void viewDetailsOfBooking() {


    }

    @Test(description = "extract the details of event")
    public void getTheDetailsOfEvent() {


    }

    @Test(description = " verify the total of my booking list feature")
    public void verifyTheTotalOfMyBookingsList() {


    }

    @Test(description = "Browse the Events Of Booking")
    public void browseEventsOfBooking() {


    }

    @Test(description = "Clear all the booking feature")
    public void clearAllBookings() {


    }

}
