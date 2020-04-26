package aiss.model.resources;

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

public class TripAdvisorTest {

	
		@Test
		public void pollTest() throws UnsupportedEncodingException {
			String city= "new york";
			TripAdvisorResource airport = new TripAdvisorResource();
			AirportSearch[] TripAdvisorResults = airport.getAirport(city);
			
			String departureDate="2020-05-03";
			String destinationCode="LGW";
			String originCode=TripAdvisorResults[0].getCode();
			Number adults=1;
			String childrenAge="12,5,7";
			Number seniors=3;
			Number clase=0;
			
			//FlightCreateSession FlightSessionResults= airport.createFlightSession(city, destinationCode, originCode, departureDate, adults, childrenAge, seniors, clase);
			//String searchID=FlightSessionResults.getSearchParams().getSid();
			//String searchHash=FlightSessionResults.getSummary().getSh();
			//System.out.println("El searchID es " +  searchID);
			//System.out.println("El searchID es " +  searchHash);
			
		}
		

}
