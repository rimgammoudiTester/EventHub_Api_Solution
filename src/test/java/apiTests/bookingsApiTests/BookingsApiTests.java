/*package apiTests.bookingsApiTests;
import bases.apiBasePage.ApiBasePage;
import dataBaseUtility.sqlReader.SqlReader;
import eventHubApiPages.bookingApis.BookingApis;
import io.restassured.response.Response;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Map;

import static dataBaseQueries.bookingQueries.BookingQueries.BOOKING_QUERY;
import static dataBaseQueries.bookingQueries.BookingQueries.EXTRACT_QUANTITY_QUERY;
import static utility.UtilityClass.extractRowsFromDataBaseTable;
import static utility.constants.apiConstants.ApiConstants.HEALTH_ENDPOINT;
import static utility.constants.apiConstants.ApiConstants.SUCCESS_CODE;

public class BookingsApiTests extends ApiBasePage {
    /**Author
     * Rim Gammoudi
     *
     */

    /* BookingApis bookingApis;
    @BeforeClass()
    public void intializeClasses()
    {
        bookingApis=new BookingApis();

    }

    @DataProvider
    public Object[][] getTheErrorMessageForBookingFields()
    {
        return new Object[][]{
                {}

        };
    }


    @DataProvider
    public Object[][] getTheDetailsOfEvent()
    {

        return new Object[][]{
                {}

        };
    }




    @Test(description ="")
    public void verifyThatTheQuantityGivenIsAcceptableAgainstTheExpectedQuantityRange()
    {
       List<Map<String,Object>>listOfBookingRows =extractRowsFromDataBaseTable(BOOKING_QUERY);
       System.out.println(listOfBookingRows.get(1));
        getBookingList("",listOfBookingRows.get(1));

        /*List<Map<String, Object>> listOfBooking;
        listOfBooking = sqlExecutionAndMapResultToHashMap(BOOKING_QUERY);
       // listOfBooking=sqlExecutionAndMapResultToHashMap(EXTRACT_QUANTITY_QUERY);

        //System.out.println("the data is :"+sqlExecutionAndMapResultToHashMap(EXTRACT_QUANTITY_QUERY));

        //System.out.println("the second object of bookings :"+listOfBooking.get(1));
        System.out.println(listOfBooking.get(1).get("quantity"));
        System.out.println(listOfBooking.get(1).get("eventid"));*/



  /*  }

    @Test(description ="")
    public void confirmBookingWithTheCorrectValues()
    {


    }

    @Test(dataProvider ="getTheErrorMessageForBookingFields",description ="")
    public void confirmBookingWithTheIncorrectValues()
    {


    }

    @Test(dataProvider ="getTheDetailsOfEvent",description ="")
    public void extractTheDetailsOfEvent()
    {


    }

    @Test(description ="")
    public void verifyTheTotalOfEventTicketBooking()
    {


    }
    // extract the health check
    @Test(description ="getHealthCheck")
    public void extractHealthCheck()
    {
        Response res=bookingApis.getBooking(HEALTH_ENDPOINT);
        Assertions.assertThat(res.getStatusCode()).isEqualTo(SUCCESS_CODE);
        Assertions.assertThat(res
    }




}*/
