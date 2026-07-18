/*package eventHubApiPages.bookingApis;

import genericApiKeywords.GenericApiKeyWords;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class BookingApis extends GenericApiKeyWords {

    public Response getBookingList(String bookingEndpoint, Map<String, Object> bookingQuery) {
        return extractObjectByQueryParam(bookingQuery, bookingEndpoint);
    }

    public Response createBooking(String bookingEndpoint, Object bookingPayload) {
        return createObject(bookingPayload, bookingEndpoint);
    }

    public Response extractBookingByPathParameter(String bookingEndpoint, String pathParameterName, Object pathParameter) {
        return extractObjectByPathParameter(pathParameterName, pathParameter, bookingEndpoint);
    }

    public Response deleteBooking(String bookingEndpoint, String pathParameterName, Object pathParameter) {
        return deleteObjectByPathParameter(pathParameterName, pathParameter, bookingEndpoint);
    }
    public Response getBooking(String bookingEndpoint) {
        return extractObject(bookingEndpoint);
    }
}*/
