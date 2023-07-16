package gRequestSpecAndResponseSpec;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class eExtractResponseAsString {

	public static void main(String[] args) {

		
		String ResponseBody = 
			RestAssured
				.given()
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
				.post()
				.then()
				.extract()
				.body()   // optional
				//.asString() This will print the result in single line we want proper formate we use prettyString()
				.asPrettyString();
			System.out.println(ResponseBody);
		
	}

}
