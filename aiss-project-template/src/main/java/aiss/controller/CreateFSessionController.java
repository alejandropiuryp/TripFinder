package aiss.controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import aiss.model.TripAdvisor.FlightCreateSession;
import aiss.model.TripAdvisor.FlightGetBookingUrl;
import aiss.model.TripAdvisor.FlightPoll;
import aiss.model.resources.TripAdvisorResource;



/**
 * Servlet implementation class SearchController
 */
public class CreateFSessionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final Logger log = Logger.getLogger(CreateFSessionController.class.getName());
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateFSessionController() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		//Obtenemos los títulos dinámicos para la página de error
		String getDepTitle=request.getParameter("depTitle");
		String getDestTitle=request.getParameter("destTitle");
		
		//Obtiene el resto de parametros necesarios para completar la búsqueda
		String departureDate=request.getParameter("departureDate");
		String returnDate=request.getParameter("returnDate");
		System.out.println("Fecha de salida es " + departureDate);
		System.out.println("Fecha de retorno es " + returnDate);
		Number adults=Integer.parseInt(request.getParameter("adults"));
		Number seniors=Integer.parseInt(request.getParameter("seniors"));
		String childrenAge=request.getParameter("childrenAge");
		Number clase=Integer.parseInt(request.getParameter("travelerClass"));

		String depSelected= request.getParameter("departureSelectedValue");
		String destSelected= request.getParameter("destinationSelectedValue");
		RequestDispatcher rd = null;
		
		//Obtiene el nombre completo de los aeropuertos partiendo del displayName para mostrarlos en la última vista como títulos dinámicos
		String depTitle= depSelected.substring(0, depSelected.length()-6);
		String destTitle = destSelected.substring(0, destSelected.length()-6);
		
		//Obtiene el código identificador de los aeropuertos partiendo del displayName  
		String depCode = depSelected.substring(depSelected.length()-4, depSelected.length()-1);
		System.out.println("depCode is " + depCode);
		String destCode = destSelected.substring(destSelected.length()-4, destSelected.length()-1);
		System.out.println("destCode is " + destCode);
		
		
		log.log(Level.FINE, "Creating Flight Session ");
		TripAdvisorResource tripAdvisor = new TripAdvisorResource();

		//Crea una sesión de la búsqueda realizada
		FlightCreateSession flightSessionResults= tripAdvisor.createFlightSession(destCode, depCode, departureDate, returnDate, adults, childrenAge, seniors, clase);
		String searchID = null;
		String searchHash = null;
		
		//Revisar condiciones para que funcione
		if(flightSessionResults!=null) {
			

			searchID=flightSessionResults.getSearchParams().getSid();
			log.log(Level.FINE, "SearchID value is " + searchID);
			searchHash=flightSessionResults.getSummary().getSh();
			log.log(Level.FINE, "SearchHash value is " + searchHash);
			
			log.log(Level.FINE, "Creating poll and getting url ");
			
			if (searchID !=null && searchHash !=null) {
				try {
					TimeUnit.SECONDS.sleep(5);		
				} catch (InterruptedException ie) {
					Thread.currentThread().interrupt();
				}
				FlightPoll flightPollResults= tripAdvisor.poll(searchID);
				String[] itinerarieId= new String[flightPollResults.getRecommendedItins().getBESTVALUE1().getL().size()];
				for (int i=0 ; i<flightPollResults.getRecommendedItins().getBESTVALUE1().getL().size(); i++) {
					itinerarieId[i]=flightPollResults.getRecommendedItins().getBESTVALUE1().getL().get(i).getId();
				}
				
				List<String> possiblesId= Arrays.asList(itinerarieId);
				String[] finalURL=new String[possiblesId.size()];
				
				for (int e=0 ; e<possiblesId.size(); e++) {
					FlightGetBookingUrl bookingResults = tripAdvisor.getBookingURL(searchHash, destCode, possiblesId.get(e), depCode, searchID);
					finalURL[e] = bookingResults.getPartnerUrl();
				}
				
				
				List<String> partnersFinalURL=Arrays.asList(finalURL);
				
				//Asigna los atributos a ser usados por la vista que mostrará los resultados
				request.setAttribute("partnersURL", partnersFinalURL);
				request.setAttribute("departureAirportTitle", depTitle);
				request.setAttribute("destinationAirportTitle", destTitle);
				log.log(Level.FINE, "Partners url are " + partnersFinalURL);
				rd=request.getRequestDispatcher("/FlightURL.jsp");
			
			
			
					
		}else {
			log.log(Level.FINE, "Error when creating FlightSession ");
			request.setAttribute("departureQueryTitle", getDepTitle);
			request.setAttribute("destinationQueryTitle", getDestTitle);
			rd=request.getRequestDispatcher("/FlightNotFound.jsp");
		}
		
		
		
		rd.forward(request, response);
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
	
}
