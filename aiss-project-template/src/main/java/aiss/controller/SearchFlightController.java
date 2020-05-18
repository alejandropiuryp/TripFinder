package aiss.controller;

import java.io.IOException;
import java.text.Normalizer;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.TripAdvisor.AirportSearch;
import java.util.Arrays;
import java.util.List;

import aiss.model.resources.TripAdvisorResource;

public class SearchFlightController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
    
	private static final Logger log = Logger.getLogger( SearchFlightController.class.getName());
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public  SearchFlightController() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		String departureQuery =request.getParameter("searchDepartureQuery");
		String destinationQuery = request.getParameter("searchDestinationQuery");
		RequestDispatcher rd = null;
		
		

		// Search for airports' information in TripAdvisor given a departureCity and a destination
		log.log(Level.FINE, "Searching for airports from " + departureQuery + " to " + destinationQuery);
		TripAdvisorResource tripAdvisor = new TripAdvisorResource();
		request.setAttribute("departureQueryTitle", departureQuery);
		request.setAttribute("destinationQueryTitle", destinationQuery);

		
		//Shows possible airports related to queries' search
		if (departureQuery !=null && destinationQuery !=null){
		
			AirportSearch[] airportsDepRes = tripAdvisor.getAirport(departureQuery);
			AirportSearch[] airportsDestRes = tripAdvisor.getAirport(destinationQuery);
		 
		 if (airportsDepRes !=null && airportsDestRes !=null) {

			 String[] possibleDepartureAirports=new String[airportsDepRes.length];
			 	for (int i = 0; i < airportsDepRes.length; i++) {
					possibleDepartureAirports[i] = airportsDepRes[i].getDisplayName();
				
			 	}
			 	List<String> depAirportsList= Arrays.asList(possibleDepartureAirports);
			
			 String[] possibleDestinationAirports= new String[airportsDestRes.length];
			 	for (int i = 0; i < airportsDestRes.length; i++) {
			 		possibleDestinationAirports[i] = airportsDestRes[i].getDisplayName();
			 	}
			 	List<String> destAirportsList= Arrays.asList(possibleDestinationAirports);
			
			 	request.setAttribute("airportSelectDep", depAirportsList);
			 	request.setAttribute("airportSelectDest", destAirportsList);
			
			 	rd = request.getRequestDispatcher("/FlightSelection.jsp");  
		 } else {
				log.log(Level.FINE, "Airports object are null");
				request.setAttribute("message", "There aren't airports related to query's search");
				rd=request.getRequestDispatcher("/FlightNotFound.jsp");

			}
			
			
		} else {
			log.log(Level.FINE, "Queries are null");
			request.setAttribute("message", "There aren't places related to query's search");
			rd=request.getRequestDispatcher("/FlightNotFound.jsp");

		}
		
		rd.forward(request, response);
		
	}
		
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
}




