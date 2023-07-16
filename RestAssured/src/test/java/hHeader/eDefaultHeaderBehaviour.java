package hHeader;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.Header;

public class eDefaultHeaderBehaviour {

	/*
	@Test
	public void passHeader()
	{
		
		RestAssured
				.given()
				.log()
				.all()
				.header("header1", "value1","value2")
				//.header("header2", "value2")
				//.header("header1", "value1")
				.when()
				.get();	
	}
	*/
	
	@Test
	public void overwriteHeaderValues()
	{
		RestAssured
			.given()
				.config(RestAssuredConfig.config()
						.headerConfig(HeaderConfig
								.headerConfig()
								.overwriteHeadersWithName("header1", "header2"))) 
				// This above method will override the duplicate values
				.config(RestAssuredConfig.config()
						.headerConfig(HeaderConfig
								.headerConfig()
								.mergeHeadersWithName("header1")))
				.header("header1", "value1")
				.header("header1", "value2")
				.header("header2", "value3")
				.header("header2", "value4")
				.header("header3", "value5")
				.header("header3", "value6")
				.log()
				.all()
			.when()
				.get();
		
		
	}
	
	
	
}
