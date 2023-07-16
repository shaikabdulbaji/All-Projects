package fPathParameters;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class PathParameterExample4 {

	public static void main(String[] args) {

		Map<String, Object> pathparameters = new HashMap<>();
		pathparameters.put("basePath", "booking");
		pathparameters.put("bookingId", 2);
		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com")
				.basePath("{basePath}/{bookingId}")
				.pathParams(pathparameters)
	        .when()
	        	.get()
	        .then()
	        	.log()
	        	.all();
		
		
		
		
	}

}
