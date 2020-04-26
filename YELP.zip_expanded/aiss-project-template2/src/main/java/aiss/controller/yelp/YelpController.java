package aiss.controller.yelp;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.resources.YelpResources;
import aiss.model.yelp.Business;


public class YelpController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
    
	private static final Logger log = Logger.getLogger(YelpController.class.getName());
	 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public YelpController() {
        super();
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    	String query = request.getParameter("searchQuery");
    	syso
		RequestDispatcher rd = null;
		Business result = null;
		
		//Buscar negocios por localizacion
		log.log(Level.FINE, "Buscar negocios: " + query);
		YelpResources ylp = new YelpResources();
		System.out.println("Hola");
		if(query!=null) {
			System.out.println("Hola  2");
			result = ylp.getBusiness(query);
			
			
			
			
			
			if(result.getBusinesses() == null) {
				System.out.println("Hola 3");
				request.setAttribute("message", "Business no encontrados");
				log.log(Level.FINE, "Business no encontrados");
				result.
				rd = request.getRequestDispatcher("/error.jsp");
			}else {
				System.out.println("Hola 4");
				log.log(Level.FINE, "Business encontrados");
				request.setAttribute("message", result.getBusinesses());
				rd = request.getRequestDispatcher("/Businessview.jsp");
				
			}
		}else {
			System.out.println("Hola 5");
			result = ylp.getBusiness("Sevilla");
			request.setAttribute("message", result.getBusinesses());
			rd = request.getRequestDispatcher("/Businessview.jsp");
			
			
		}
		rd.forward(request, response);
		
		
		
    }
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
	
	doGet(request, response);
}


}
