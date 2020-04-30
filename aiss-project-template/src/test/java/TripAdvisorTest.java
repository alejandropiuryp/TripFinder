

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import aiss.model.TripAdvisor.AirportSearch;
import aiss.model.TripAdvisor.FlightCreateSession;
import aiss.model.TripAdvisor.FlightGetBookingUrl;
import aiss.model.TripAdvisor.FlightPoll;
import aiss.model.TripAdvisor.L;
import aiss.model.resources.TripAdvisorResource;

public class TripAdvisorTest {

		static TripAdvisorResource tripAdvisor=  new TripAdvisorResource();
		static String city= "new york";
		
		@Test
		public void getAirportTest() throws UnsupportedEncodingException {
			AirportSearch[] TripAdvisorResults = tripAdvisor.getAirport(city);
			
			assertNotNull("There aren't airports in this city ", TripAdvisorResults);
			
			for (int i=0; i<TripAdvisorResults.length; i++ ) {
					System.out.println("Airport nº"+(i+1)+": " + TripAdvisorResults[i].getDisplayName());
			}
		}
			
			 
			
		//Ya que se requieren unos a otros, realizo los 3 test juntos para emplear menos llamadas a la API (250 de 500 empleadas)
		/*@Test
		public void createFlightSessionPollAndURLTest() throws UnsupportedEncodingException {
			AirportSearch[] TripAdvisorResults = tripAdvisor.getAirport(city);
			String departureDate="2020-05-05";
			String returnDate="";
			String destinationCode="LON";
			String childrenAge="12,7";
			String originCode=TripAdvisorResults[0].getCode();  //NYC code
			Number adultos=1;
			Number seniors=1;
			Number clase=0;
	
			FlightCreateSession flightSessionResults= tripAdvisor.createFlightSession(destinationCode, originCode, departureDate, returnDate , adultos, childrenAge, seniors, clase);
			assertNotNull("Can't create flight session ", flightSessionResults);
			String searchID=flightSessionResults.getSearchParams().getSid();			
			String searchHash=flightSessionResults.getSummary().getSh();
			assertNotNull("No searchID ", searchID);
			assertNotNull("No searchHash ", searchHash);
			
			System.out.println("The searchID of this session is " + searchID);
			System.out.println("The searchHash of this session is " + searchHash);
			String[] itinerarieId = new String[8];
			try { //Al ser en tiempo real tiene que haber cierto delay obligatoriamente dado que el ID tarda un tiempo en generarse en el servidor
			    TimeUnit.SECONDS.sleep(5);	
				FlightPoll pollResults=tripAdvisor.poll(searchID);
				assertNotNull("Can't create poll ", pollResults);
				for (int i=0; i<pollResults.getRecommendedItins().getBESTVALUE1().getL().size() ; i++) {
					itinerarieId[i] = pollResults.getRecommendedItins().getBESTVALUE1().getL().get(i).getId();
					System.out.println("Itinerarie nº " + (i+1)+ " id is " + itinerarieId[i]);
				}

			} catch (InterruptedException ie) {
			    Thread.currentThread().interrupt();
			}
			
			String firstItinerarieId=itinerarieId[0];
			FlightGetBookingUrl bookingResults= tripAdvisor.getBookingURL(searchHash, destinationCode, firstItinerarieId, originCode, searchID);
			assertNotNull("Can't get booking ", bookingResults);
			System.out.println("The partner url is " + bookingResults.getPartnerUrl());
		}*/

}
