package fPathParameters;

import io.restassured.RestAssured;

public class PathParameterExample3 {

	public static void main(String[] args) {

		
		RestAssured
			.given()
				.log()
				.all()
				.pathParam("basePath", "booking")
	        .when()
	        	/*
	        		* If we give get() like this it will take basePath as booking and remaining value or inline parameters
	        		  as bookingId.
	        	*/
	        	.get("https://restful-booker.herokuapp.com/{basePath}/{bookingId}", 2)
	        .then()
	        	.log()
	        	.all();
		
		
		
		
	}

}
