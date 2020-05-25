package aiss.model.resources;

import java.io.UnsupportedEncodingException;

import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.restlet.data.ChallengeResponse;
import org.restlet.data.ChallengeScheme;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import aiss.model.yelp.Business;
public class YelpResources {

	private static final String API_KEY ="FszpBR5tvoKFjhXroZeOhuGIGOezmlx5s17vQZvxu_a4hg0EvMyXnTDm967N"
			+ "dQl0muw5aWGwHRHQbIjA3p6yQwo6BYWjOKGKcobxgj7rQn9_Ovx4rHulw5OB0AmfXnYx"; 
			
	private static Logger log = Logger.getLogger(YelpResources.class.getName());
	

	public Business getBusiness (String location) throws UnsupportedEncodingException{
		
		String queryformatted = URLEncoder.encode(location, "UTF-8");
		String uri = "https://api.yelp.com/v3/businesses/search?location=" + queryformatted;
		
		Business businessSearch=null;
		ClientResource cr = null;
		try {
			cr = new ClientResource(uri);
			ChallengeResponse chr = new ChallengeResponse(ChallengeScheme.HTTP_OAUTH_BEARER);
			chr.setRawValue(API_KEY);
			cr.setChallengeResponse(chr);
			log.log(Level.FINE, "Yelp URL: " + uri);
			businessSearch = cr.get(Business.class);
		}catch(ResourceException re){
			log.warning("Error when bussiness" + cr.getResponse().getStatus());
		}
		return businessSearch;
		
	}	
}
