import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.junit.Test;

import aiss.model.TicketMaster.Event;
import aiss.model.TicketMaster.TicketMaster;
import aiss.model.resources.GoogleCalendarResource;
import aiss.model.resources.TicketMasterResource;

public class TestTicketMaster {
	static String access_token;
	static GoogleCalendarResource calendar = new GoogleCalendarResource(access_token);
	static TicketMasterResource ticketMaster = new TicketMasterResource();
	@Test
	public void getEventTest() throws UnsupportedEncodingException {
		String city = "Sevilla";
		TicketMaster eventsResult = ticketMaster.gettTicketMaster(city);
		assertNotNull("There aren't events in this city ", eventsResult);
		
		List<Event> events = eventsResult.getEmbedded().getEvents();
		
		for (int i=0; i<events.size(); i++) {
			System.out.println("Event " + (i+1) + " : " + events.get(i).getName() + " ( ID: " + events.get(i).getId() +") will take place in " + events.get(i).getEmbedded().getVenues().get(0).getAddress().getLine1() + " (" + events.get(i).getDates().getStart().getLocalDate() + " at " + events.get(i).getDates().getStart().getLocalTime()+")");
			
			
		}
		
		//Show event given an identifier
		TicketMaster eventById=ticketMaster.getEvent("Z698xZ2qZa795");  //ID from Event 1
		System.out.println(eventById.getEmbedded().getEvents().get(0).getName());
	}
}
	
