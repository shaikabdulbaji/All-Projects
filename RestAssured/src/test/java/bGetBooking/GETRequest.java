package bGetBooking;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GETRequest {

	public static void main(String[] args) {

		/*
		//Build Request
		RequestSpecification rs = RestAssured.given().log().all();
		rs.baseUri("https://restful-booker.herokuapp.com");
		rs.basePath("booking/{id}");
		
		rs.pathParam("id", 589);
		
		//Hit Request & get response
		Response res = rs.get();
		
		//Validate response
		ValidatableResponse vrs = res.then().log().all();
		vrs.statusCode(200);
		*/
		
		
		
		//Build Request
			RestAssured
				.given()
					.log()
					.all()
					.baseUri("https://restful-booker.herokuapp.com")
					.basePath("booking/{id}")
					
					.pathParam("id", 589)
				
		//Hit Request & get response
					.get()
				
		//Validate response
				.then()
					.log()
					.all()
					.statusCode(200);
		
	}

}
