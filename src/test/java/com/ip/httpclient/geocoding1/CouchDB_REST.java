package com.ip.httpclient.geocoding1;

import org.junit.Test;
import org.junit.Before;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.expect;
import static org.hamcrest.Matchers.equalTo;
public class CouchDB_REST {
	
	
	@Test
	public void postExample1()
	{
	String myJson = "{\"password\": \"Collaboration!\", \"username\": \"coolmohit3021@gmail.com\"}";
	
    	RestAssured.baseURI  = "https://stage-web.core.merrillcorp.com";	

    	Response r=RestAssured.given().contentType("application/json").body("{\"password\": \"Collaboration!\", \"username\": \"coolmohit3021@gmail.com\"}")
    	.when().post("/api/tokens/login");
    	
    	

    	String body = r.getBody().asString();
    	System.out.println(body);
    	
    	int statuscode=r.getStatusCode();
    	System.out.println(statuscode);
    	String contentType= r.getContentType();
    	System.out.println(contentType);
    	
    	

	}

}
