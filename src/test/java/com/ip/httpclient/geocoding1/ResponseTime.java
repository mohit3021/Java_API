package com.ip.httpclient.geocoding1;

import org.junit.Test;
import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class ResponseTime {

	@Test
	public void resTime(){
	
	String json = get("volumes?q=turing").asString();
	
	System.out.println(json);
					
	RestAssured.given().
	parameters("q","turing").
	when().
	get("volumes").
	then().
	body("items.volumeInfo.title[1]", equalTo("Alan Turing") ).
	and().time(lessThan(1000L));
	
	
	}
	
}
