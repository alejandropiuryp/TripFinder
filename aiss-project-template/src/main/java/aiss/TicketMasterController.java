package aiss;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.TicketMaster.Embedded;
import aiss.model.TicketMaster.TicketMaster;
import aiss.model.resources.TicketMasterResource;

/**
 * Servlet implementation class TicketMasterController
 */
public class TicketMasterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final Logger log = Logger.getLogger(TicketMasterController.class.getName());
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TicketMasterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String query = request.getParameter("searchQuery");
		RequestDispatcher rd = null;
		TicketMaster results = null;
		//Search events in TicketMaster
		log.log(Level.FINE, "Searching for TicketMasters events that contain" + query);
		TicketMasterResource tmr = new TicketMasterResource();
		if(query != null) {
			results = tmr.gettTicketMaster(query);
			if(results.getEmbedded()==null) {
				request.setAttribute("message", "Eventos no encontrados");
				log.log(Level.FINE, "Eventos no encontrados");
				rd = request.getRequestDispatcher("/eventsNotFoundView.jsp");
			}else {
				log.log(Level.FINE, "Eventos encontrados");
				request.setAttribute("events", results.getEmbedded().getEvents());
				rd = request.getRequestDispatcher("/eventsView.jsp");
			}
		}else {
			results = tmr.gettTicketMaster("Sevilla");
			request.setAttribute("events", results.getEmbedded().getEvents());
			rd = request.getRequestDispatcher("/eventsView.jsp");
			
		}
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
