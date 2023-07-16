package hHeader;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;

public class aHeadersExample {
	
	
	@Test
	public void passHeader()
	{
		
		RestAssured
				.given()
				.log()
				.all()
				.header("header1", "value1")
				.header("header2", "value2", "value3", "value4")
				// we usally pass the headers like above lines to overcome this we go to object creation method
				.when()
				.get();	
	}
	
	@Test
	public void passHeader2()
	{
		Header header = new Header("header1", "value1");
		// After creation of object for each different headers we go for "headers" method
		
		RestAssured
				.given()
				.log()
				.all()
				.header(header)
				.header("header1", "value2")
				.when()
				.get();	
	}

	@Test
	public void passHeader3()
	{
		
		
		RestAssured
				.given()
				.log()
				.all()
				.headers("h1","v1","h2","v2","h3","v3") //To pass multiple headers to over come this we go for
				// map and hashmap in collection
				.when()
				.get();	
	}
	
	@Test
	public void passHeader4()
	{
		
		Map<String,String> headermap = new HashMap<>();
		headermap.put("h1", "v1");
		headermap.put("h2", "v2");
		headermap.put("h3", "v3");
		headermap.put("h4", "v4");
		
		RestAssured
				.given()
				.log()
				.all()
				.headers(headermap) //To pass multiple headers
				.when()
				.get();	
	}
}
