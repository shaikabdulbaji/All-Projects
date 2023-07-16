package aCreateBooking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class POSTRequestInBDDFormat {

	public static void main(String[] args) {

		RestAssured
		//Build Request
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com/")
			.basePath("booking")
			.body("{\r\n"
					+ "    \"firstname\" : \"Shaik\",\r\n"
					+ "    \"lastname\" : \"Abdul\",\r\n"
					+ "    \"totalprice\" : 16,\r\n"
					+ "    \"depositpaid\" : false,\r\n"
					+ "    \"bookingdates\" : {\r\n"
					+ "        \"checkin\" : \"2024-01-01\",\r\n"
					+ "        \"checkout\" : \"2024-01-01\"\r\n"
					+ "    },\r\n"
					+ "    \"additionalneeds\" : \"Lunch\"\r\n"
					+ "}")
			.contentType(ContentType.JSON)
		//Hit Request & get response
		.when()
			.post()
		//Validate response
		.then()
			.log()
			.all()
			.statusCode(200);
		
		
	}

}
