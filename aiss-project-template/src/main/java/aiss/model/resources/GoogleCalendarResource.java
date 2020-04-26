package aiss.model.resources;

import java.util.logging.Logger;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.Calendar.Calendar;
import aiss.model.Calendar.End;
import aiss.model.Calendar.Evento;
import aiss.model.Calendar.Eventos;
import aiss.model.Calendar.Item;
import aiss.model.Calendar.NewCalendar;
import aiss.model.Calendar.NewEvent;
import aiss.model.Calendar.Start;

public class GoogleCalendarResource {
	private static final Logger log = Logger.getLogger(GoogleCalendarResource.class.getName());
	
    private final String access_token;
    private final String uri = "https://www.googleapis.com/calendar/v3/users/me/calendarList";
    private final String uriInsert = "https://www.googleapis.com/calendar/v3/calendars";
    
    public GoogleCalendarResource(String access_token) {
    	this.access_token = access_token;
    }
    
    public Calendar getCalendars() {
    	ClientResource cr = null;
    	Calendar calendars = null;
    	try {
    		cr = new ClientResource(uri + "?access_token=" + access_token);
    		calendars = cr.get(Calendar.class);
    	}catch(ResourceException re) {
    		log.warning("Error when retrieving all calendars" + cr.getResponse().getStatus());
    	}
    	return calendars;
    }
    
    public String insertCalendar() {
    	ClientResource cr = null;
    	Item calendario = null;
    	String newId = null;
    	NewCalendar newCalendar = new NewCalendar();
    	try {
    		cr = new ClientResource(uriInsert + "?access_token=" + access_token);	
    		calendario = cr.post(newCalendar, Item.class);
    		newId = calendario.getId();
    	}	catch(ResourceException re) {
    		log.warning("Error when inserting calendar" + cr.getResponse().getStatus());
    	}
    	return newId;
    }
    
    public void insertEvent(String idCalendario, String startDate, String endDate,String summary) {
    	ClientResource cr = null;
    	Evento evento = null;
    	Start start = new Start();
    	start.setDateTime(startDate);
    	End end = new End();
    	end.setDateTime(endDate);
    	NewEvent newEvent = new NewEvent(end, start, summary);
    	try {
    		cr = new ClientResource(uriInsert + "/" + idCalendario + "/events" +"?access_token=" + access_token);	
    		evento = cr.post(newEvent, Evento.class);
    	}	catch(ResourceException re) {
    		log.warning("Error when inserting event" + cr.getResponse().getStatus());
    	}
 
    }
    public Eventos getEventos(String id) {
    	ClientResource cr = null;
    	Eventos eventos = null;
    	try {
    		cr = new ClientResource(uriInsert + "/" + id + "/events" +"?access_token=" + access_token);	
    		eventos = cr.get(Eventos.class);
    	}catch(ResourceException re) {
    		log.warning("Error when retrieving all events" + cr.getResponse().getStatus());
    	}
    	return eventos;
    }
}
