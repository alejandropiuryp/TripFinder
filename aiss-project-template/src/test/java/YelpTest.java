

import static org.junit.Assert.assertNotNull;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.junit.Test;

import aiss.model.resources.YelpResources;
import aiss.model.yelp.Business;
import aiss.model.yelp.Business_;


public class YelpTest {
	
	static YelpResources yelp= new YelpResources();
	@Test
	public void getBusinessTest() throws UnsupportedEncodingException{
		String location = "San Francisco";
		Business businessResult = yelp.getBusiness(location);
		
		assertNotNull("There aren't businesses in this location ", businessResult);
		List<Business_> businesses = businessResult.getBusinesses();
		//Show result
		System.out.println("Listing all businesses: ");
		for (int i=0; i< businesses.size() ; i++ ) {
			System.out.println("Business " + (i+1) + ": " +  businesses.get(i).getName() + " (" + businesses.get(i).getPhone() +")");
		}
		
	
		
		
	}
	

}
