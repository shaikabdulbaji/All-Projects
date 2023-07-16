package eDeleteBooking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DELETERequest {

	public static void main(String[] args) {

		//Construct Request
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking/{bookingId}")
				.pathParam("bookingId", 5)
				.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
				.header("ContentType", "application/json")
			
			//Hit the Request
			.when()
				.delete()
				
			//Validate Response
			.then()
				.log()
				.all()
				.assertThat()
				.statusCode(201);
		
		
	}

}
