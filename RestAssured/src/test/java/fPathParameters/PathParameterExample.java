package fPathParameters;

import io.restassured.RestAssured;

public class PathParameterExample {

	public static void main(String[] args) {

		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com")
				// PathParameter Example
				.basePath("{basePath}/{bookingId}")
				// give the value to basePath as booking 
				.pathParam("basePath", "booking")
				// give the value to bookingId as id number
				.pathParam("bookingId", 2)
	        .when()
	        	.get()
	        .then()
	        	.log()
	        	.all();
		
		
		
		
	}

}
