package apiTests.authentificationApiTests;
import dataBaseUtility.sqlReader.SqlReader;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static dataBaseQueries.bookingQueries.BookingQueries.BOOKING_QUERY;
public class AuthentificationApiTests extends SqlReader {

    /**
     * @Author Rim Gammoudi
     */

    @DataProvider
    public Object[][] getTheLinks() {

        return new Object[][]{
                {}

        };
    }


    @DataProvider
    public Object[][] getAuthentificationParams() {

        return new Object[][]
                {
                        {}
                };
    }

    //Method useful to verify that the api is succesfully returning 200 while authetificateing the user
    @Test(description = "Test for verifying the login functionnality with correct data")
    public void authentifyUser() {
       /*int responseCode;
        //Response res;
        LOG.info("Feature of verifying that the login api with the correct user and correct password work as expected and return token");
        //Response res =createAuthetif();
        responseCode = res.getStatusCode();
        LOG.info("Verifiying the code status of  ");
        if (responseCode == SUCCESS_CODE) {
            LOG.info("The api is successfully returning 200" + responseCode);
            Assertions.assertThat(res.getStatusCode() == SUCCESS_CODE);

        } else {
            LOG.error("The api is not returning 400 check you're api  " + responseCode);
            Assertions.assertThat(res.getStatusCode() == BAD_REQUEST_CODE);

        }*/
    }


    @Test(dataProvider = "getTheLinksOfLoginPage", description = "")
    public void verifyLinksAcccessTheAdequatePage() {

        //log.info("Verifying that the links are sucessfullt directing to the correct page");

    }


    @Test()
    public void testTry()
    {
       // System.out.println("db query Execution is  !!"+sqlExecutionAndMapResultToHashMap(BOOKING_QUERY));

        List<Map<String,Object>>listOfBooking;
        listOfBooking=sqlExecutionAndMapResultToHashMap(BOOKING_QUERY);
        // System.out.println("the second object of bookings :"+listOfBooking.get(1));
          System.out.println(listOfBooking.get(1).get("quantity"));
    }

}



