package com.ip.httpclient.geocoding1;

import org.junit.Test;

import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;
import static com.jayway.restassured.matcher.ResponseAwareMatcher.*;
import static org.hamcrest.Matcher.*;
import static org.junit.Assert.*;

public class AppTest{
	
	String baseURL="https://stage-web.core.merrillcorp.com";
	String path="/api/tokens/login";
	
	@Test
	public void testStatus()
	{
		String url= baseURL + path;
		int statuscode=given()
		.param("password", "Collaboration!")
		.param("username", "coolmohit3021@gmail.com")
		.get(url).statusCode();
		System.out.println(statuscode);
		assertTrue(statuscode == 405);
		
	}
	
	@Test
	public void testStatus2()
	{
		String url= baseURL + path;
		Response response=given()
		.param("password", "Collaboration!")
		.param("username", "coolmohit3021@gmail.com")
		.get(url)
		.then()
		.extract()
		.response();
		String status=response.path("Status");
		System.out.println(status);
		
		
	}
}
