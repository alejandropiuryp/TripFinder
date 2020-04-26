package aiss.model.resources;

import java.io.UnsupportedEncodingException;

import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;

import aiss.model.yelp.Business;
public class YelpResources {

	private static final String API_KEY ="FszpBR5tvoKFjhXroZeOhuGIGOezmlx5s17vQZvxu_a4hg0EvMyXnTDm967N"
			+ "dQl0muw5aWGwHRHQbIjA3p6yQwo6BYWjOKGKcobxgj7rQn9_Ovx4rHulw5OB0AmfXnYx"; 
			
	private static Logger log = Logger.getLogger(YelpResources.class.getName());
	

	public Business getBusiness (String location) throws UnsupportedEncodingException{
		String queryformatted = URLEncoder.encode(location, "UTF-8");
		String url = "https://api.yelp.com/v3/businesses/search?location=" + queryformatted;
		ClientResource cr = new ClientResource(url);
		ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
		chr.setRawValue(API_KEY);
		cr.setChallengeResponse(chr);
		response.setHeader("Set-Cookie", "HttpOnly;Secure;SameSite=Strict");
		
		log.log(Level.FINE, "Yelp URL: " + url);
		Business result = cr.get(Business.class);
		return result;
				
	
	}
	
	
	
	
	
	
}
