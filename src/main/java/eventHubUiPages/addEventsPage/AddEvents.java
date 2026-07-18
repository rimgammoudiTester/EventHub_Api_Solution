package eventHubUiPages.addEventsPage;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import genericUiKeywords.GenericUiKeyWords;

public class AddEvents extends GenericUiKeyWords
{
public AddEvents (Page page)
{
    super(page);
}

    private final Locator eventName = page.locator("#customerName");
    private final Locator eventEmail = page.locator("#customer-email");
    private final Locator eventPhoneNumber = page.locator("#phone");
    private final Locator eventConfirmBooking = page.locator("#confirm-booking");
    private final Locator eventTicketPrice = page.locator("//span[@class=\"text-2xl font-bold text-indigo-700\"]");
    private final Locator eventDetail = page.locator("//p[@class=\"text-gray-600 leading-relaxed whitespace-pre-wrap\"]");
    private final Locator eventDate = page.locator("//p[@class=\"text-gray-600 leading-relaxed whitespace-pre-wrap\"]");
    private final Locator eventTime = page.locator("//p[@class=\"text-gray-600 leading-relaxed whitespace-pre-wrap\"]");
    private final Locator eventVenue = page.locator("//p[@class=\"text-gray-600 leading-relaxed whitespace-pre-wrap\"]");
    private final Locator eventCity = page.locator("//p[@class=\"text-gray-600 leading-relaxed whitespace-pre-wrap\"]");
    private final Locator eventAvailable = page.locator("//p[@class=\"text-gray-600 leading-relaxed whitespace-pre-wrap\"]");
    private final Locator eventPricePerTicket = page.locator("//p[@class=\"text-gray-600 leading-relaxed whitespace-pre-wrap\"]");
    private final Locator eventAddQuantity = page.locator("//p[@class=\"text-gray-600 leading-relaxed whitespace-pre-wrap\"]");
    private final Locator eventMinusQuantity = page.locator("//p[@class=\"text-gray-600 leading-relaxed whitespace-pre-wrap\"]");


    //Methods for Add event

    //Method useful for booking a ticket

    public void bookingTicketOfAnEvent()
    {


    }

    //Methods extract details of the event
    public String extractDetailsOfEvent()
    {

        return "";
    }



}
