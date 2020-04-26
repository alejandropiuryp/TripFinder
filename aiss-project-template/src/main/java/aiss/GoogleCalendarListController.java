package aiss;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import aiss.model.Calendar.Calendar;
import aiss.model.Calendar.Eventos;
import aiss.model.Calendar.Item;
import aiss.model.Calendar.Item_;
import aiss.model.TicketMaster.TicketMaster;
import aiss.model.resources.GoogleCalendarResource;
import aiss.model.resources.TicketMasterResource;
/**
 * Servlet implementation class GoogleCalendarListController
 */
public class GoogleCalendarListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final Logger log = Logger.getLogger(GoogleCalendarListController.class.getName());
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GoogleCalendarListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accesToken = (String) request.getSession().getAttribute("GoogleCalendar-token");
		String id = null;
		if(accesToken != null && !"".equals(accesToken)) {
			GoogleCalendarResource g = new GoogleCalendarResource(accesToken);
			Calendar c = g.getCalendars();
			List<Item> list = c.getItems();
			for(int i = 0; i<list.size();i++) {
				if(list.get(i).getSummary().equals("Eventos")) {
					id = list.get(i).getId();
					break;
				}
			}
			if(id == null){
				id = g.insertCalendar();
			}
			TicketMasterResource tmr = new TicketMasterResource();
			TicketMaster evento = tmr.getEvent((String)request.getParameter("id"));
			Eventos eventos = g.getEventos(id);
			List<Item_> listEventos = eventos.getItems();
			for(int i = 0; i<listEventos.size();i++) {
				if(listEventos.get(i).getSummary().equals(evento.getEmbedded().getEvents().get(0).getName())) {
					request.getRequestDispatcher("/googleCalendarEventoExiste.jsp").forward(request, response);
					break;
				}
			}
			g.insertEvent(id, evento.getEmbedded().getEvents().get(0).getSales().getPublic().getStartDateTime(),evento.getEmbedded().getEvents().get(0).getSales().getPublic().getEndDateTime() , evento.getEmbedded().getEvents().get(0).getName());
			request.setAttribute("idCalendario", id);
			request.getRequestDispatcher("/googleCalendar.jsp").forward(request, response);
		}else {
			log.info("Trying to access Google Calendar without an access token, redirecting to OAuth servlet");
			request.getRequestDispatcher("/AuthController/GoogleCalendar").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
