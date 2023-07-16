package dPartialUpdateBooking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class PATCHRequest {

	public static void main(String[] args) {

		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking/1")
				.body("{\r\n"
						+ "    \"firstname\" : \"Shaik\",\r\n"
						+ "    \"lastname\" : \"Abdul\"\r\n"
						+ "}")
				.contentType(ContentType.JSON)
				.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
			.when()
				.patch()
			.then()
				.log()
				.all()
				.assertThat()
				.statusCode(200);
		
		
	}

}
