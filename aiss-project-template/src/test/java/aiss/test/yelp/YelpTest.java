package aiss.test.yelp;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

import aiss.model.resources.YelpResources;
import aiss.model.yelp.Business;


public class YelpTest {
	@Test
	@SuppressWarnings("null")
	public void getBusinessTest() throws UnsupportedEncodingException{
		String location = "San Francisco";
		YelpResources yelp = new YelpResources();
		Business BusinessResult = yelp.getBusiness(location);
		String prepe = "hola";
	
		
		
	}
	

}
