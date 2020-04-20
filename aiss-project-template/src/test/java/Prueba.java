import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.TicketMaster.TicketMaster;
import aiss.model.TicketMaster.Venue;
import aiss.model.resources.TicketMasterResource;

public class Prueba {

	@Test
	public void test() throws UnsupportedEncodingException {
		String city = "Huelva";
		TicketMasterResource tmr = new TicketMasterResource();
		TicketMaster result = tmr.gettTicketMaster(city);
		
		String v = result.getEmbedded().getEvents().get(0).getEmbedded().getVenues().get(0).getAddress().getLine1();
		System.out.println("hola");
	}

}
