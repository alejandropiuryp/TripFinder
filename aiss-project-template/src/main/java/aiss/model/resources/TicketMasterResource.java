package aiss.model.resources;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.TicketMaster.Embedded;
import aiss.model.TicketMaster.TicketMaster;

public class TicketMasterResource {
	private String uri = "https://app.ticketmaster.com/discovery/v2/events";
	private static final String TICKET_MASTER = "AF1OieAXQLAMfXfzFTvQkQ1pfCmwssY7";
	
	public  TicketMaster gettTicketMaster(String city){
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
}
