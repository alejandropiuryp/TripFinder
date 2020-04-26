package aiss.model.resources;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import com.google.appengine.repackaged.com.google.common.base.Ticker;

import aiss.model.TicketMaster.Embedded;
import aiss.model.TicketMaster.TicketMaster;

public class TicketMasterResource {
	private String uri = "https://app.ticketmaster.com/discovery/v2/events";
	private static final String TICKET_MASTER = "AF1OieAXQLAMfXfzFTvQkQ1pfCmwssY7";
	
	public TicketMaster gettTicketMaster(String city){
		ClientResource cr = null;
		TicketMaster tm = null;
		try {
			cr = new ClientResource(uri + "?apikey=" + TICKET_MASTER + "&city=" + city + "&sort=date,asc");
			tm = cr.get(TicketMaster.class);
		}catch(ResourceException re){
			System.out.println("Error when retrieving the events of TicketMaster: " + cr.getResponse().getStatus() );
		}
		return tm;
	}
	
	public TicketMaster getEvent(String id) {
		ClientResource cr = null;
		TicketMaster tm = null;
		try {
			cr = new ClientResource(uri + "?apikey=" + TICKET_MASTER + "&id=" + id);
			tm = cr.get(TicketMaster.class);
		}catch(ResourceException re){
			System.out.println("Error when retrieving the event of TicketMaster: " + cr.getResponse().getStatus() );
		}
		return tm;
	}
}
