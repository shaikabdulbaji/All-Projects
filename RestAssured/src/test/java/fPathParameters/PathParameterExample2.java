package fPathParameters;

import io.restassured.RestAssured;

public class PathParameterExample2 {

	public static void main(String[] args) {

		
		RestAssured
			.given()
				.log()
				.all()
	        .when()
	        	//If we give get() like this it will take in sequence but if we give get() like below line it give error
	        	//https://restful-booker.herokuapp.com/{basePath}/{bookingId}", 2, "booking"  it will 404 Not Found error.
	        	.get("https://restful-booker.herokuapp.com/{basePath}/{bookingId}", "booking", 2)
	        .then()
	        	.log()
	        	.all();
		
		
		
		
	}

}
