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
		RequestDispatcher rd = null;
		Business result = null;
		
		//Buscar negocios por localizacion
		log.log(Level.FINE, "Buscar negocios: " + query);
		YelpResources ylp = new YelpResources();
		if(query!=null) {
			result = ylp.getBusiness(query);
			if(result.getBusinesses() == null) {
				request.setAttribute("message", "Business no encontrados");
				log.log(Level.FINE, "Business no encontrados");
				rd = request.getRequestDispatcher("/error.jsp");
			}else {
				log.log(Level.FINE, "Business encontrados");
				request.setAttribute("message", result.getBusinesses());
				rd = request.getRequestDispatcher("/Businessview.jsp");
				
			}
		}else {
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
