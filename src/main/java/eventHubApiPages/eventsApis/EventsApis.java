/*package eventHubApiPages.eventsApis;

import genericApiKeywords.GenericApiKeyWords;
import io.restassured.response.Response;

import java.util.HashMap;

public class EventsApis extends GenericApiKeyWords {

    public Response getEventsList(String eventEndpoint, HashMap<String, Object> eventsQuery) {
        return extractObjectByQueryParam(eventsQuery, eventEndpoint);
    }

    public Response createEvents(String eventsEndpoint, Object eventsPayload) {
        return createObject(eventsPayload, eventsEndpoint);
    }

    public Response extractEventsByPathParameter(String eventsEndpoint, String pathParameterName, Object pathParameter) {
        return extractObjectByPathParameter(pathParameterName, pathParameter, eventsEndpoint);
    }

    public Response updateEventsByPathParameter(String eventsEndpoint, String pathParameterName, Object pathParameter) {
        return updateObjectByPathParameter(pathParameterName, pathParameter, eventsEndpoint);
    }


    public Response deleteEvents(String eventsEndpoint, String pathParameterName, Object pathParameter) {

        return deleteObjectByPathParameter(pathParameterName, pathParameter, eventsEndpoint);
    }
}
*/
