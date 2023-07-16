package bGetBooking;

import io.restassured.RestAssured;

public class GETRequestInBDDFormat {

	public static void main(String[] args) {
		
		
		//Build Request
		RestAssured
		  .given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com")
			.basePath("booking/{id}")
			
			.pathParam("id", 589)
			
		//Hit Request & get response
		  .when()
			.get()
			
	   //Validate response
		  .then()
		    .log()
		    .all()
			.statusCode(200);

	}

}
