package aiss.model.resources;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;



import org.restlet.Request;
import org.restlet.data.Header;
import org.restlet.engine.header.HeaderConstants;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;
import org.restlet.util.Series;

import aiss.model.TripAdvisor.AirportSearch;
import aiss.model.TripAdvisor.FlightCreateSession;
import aiss.model.TripAdvisor.FlightGetBookingUrl;
import aiss.model.TripAdvisor.FlightPoll;

public class TripAdvisorResource {
		
		private static final String RAPID_API_KEY = "f8faa56634mshc9c704e88938915p1df50ejsne81b35de0056";		// TODO: Change this API KEY for your personal Key
		private static final Logger log = Logger.getLogger(TripAdvisorResource.class.getName());
		
		public AirportSearch[] getAirport(String query) throws UnsupportedEncodingException{
			String queryParsed=URLEncoder.encode(query, "UTF-8"); 
			String uri= "https://tripadvisor1.p.rapidapi.com/airports/search?locale=en_US&query=" + queryParsed;
			
			log.log(Level.FINE, "TripAdvisor URI " + uri);
			
			ClientResource cr = null;
	
			AirportSearch[] airportSearch = null;
			
			try {
				cr=new ClientResource(uri);

				Series<Header> headerValue = new Series<>(Header.class);
				Request request = cr.getRequest();
				headerValue.add("x-rapidapi-key", RAPID_API_KEY);
				request.getAttributes().put(HeaderConstants.ATTRIBUTE_HEADERS, headerValue);
				airportSearch=cr.get(AirportSearch[].class);
				
			}catch(ResourceException re){
				System.out.println("Retrieving the flights of TripAdvisor: " + cr.getResponse().getStatus() );
			}
				return airportSearch;
		
	
		
	}

	public FlightCreateSession createFlightSession(String destinationCode, String departureCode, String departureDate, String returnDate, Number adults, String childrenAge , Number seniors, Number clase) throws UnsupportedEncodingException {
		
		String uri= "https://tripadvisor1.p.rapidapi.com/flights/create-session?dd2=" + returnDate + "&currency=USD&o2="+ destinationCode +"&d2="+ departureCode +"&ta=" + adults +"&ts=" + seniors + "&c=" + clase + "&d1="+ 
						destinationCode +"&o1=" + departureCode + "&dd1=" + departureDate;
	

		
		log.log(Level.FINE, "TripAdvisor URI " + uri);
		
	    ClientResource cr = new ClientResource(uri);

	    Series<Header> headerValue = new Series<>(Header.class);
	    Request request = cr.getRequest();
	    headerValue.add("x-rapidapi-key", RAPID_API_KEY);
	    request.getAttributes().put(HeaderConstants.ATTRIBUTE_HEADERS, headerValue);
		
	    FlightCreateSession flightCSession=cr.get(FlightCreateSession.class);
		return flightCSession;
	}
	
	public FlightPoll poll(String searchId) {
		String uri="https://tripadvisor1.p.rapidapi.com/flights/poll?currency=USD&n=15&ns=NON_STOP%252CONE_STOP&so=PRICE&o=0&sid=" + searchId;
		
		log.log(Level.FINE, "TripAdvisor URI " + uri);
	    ClientResource cr = new ClientResource(uri);

	    Series<Header> headerValue = new Series<>(Header.class);
	    Request request = cr.getRequest();
	    headerValue.add("x-rapidapi-key", RAPID_API_KEY);
	    request.getAttributes().put(HeaderConstants.ATTRIBUTE_HEADERS, headerValue);
		
	    FlightPoll poll=cr.get(FlightPoll.class);
		return poll;
	}
	
	public FlightGetBookingUrl getBookingURL(String searchHash, String destinationCode, String itinerarieId, String departureCode, String searchId) throws UnsupportedEncodingException {
		
		String itinerarieIdFormatted=URLEncoder.encode(itinerarieId, "UTF-8");
		String uri="https://tripadvisor1.p.rapidapi.com/flights/get-booking-url?currency=USD&searchHash=" + searchHash + "&Dest=" + destinationCode + "&id=" + itinerarieIdFormatted + "&Orig=" + departureCode +"&searchId=" + searchId;
		
		log.log(Level.FINE, "TripAdvisor URI " + uri);
	    ClientResource cr = new ClientResource(uri);

	    Series<Header> headerValue = new Series<>(Header.class);
	    Request request = cr.getRequest();
	    headerValue.add("x-rapidapi-key", RAPID_API_KEY);
	    request.getAttributes().put(HeaderConstants.ATTRIBUTE_HEADERS, headerValue);
		
	    FlightGetBookingUrl bookingURL=cr.get(FlightGetBookingUrl.class);
		return bookingURL;
		
	}
}
	



