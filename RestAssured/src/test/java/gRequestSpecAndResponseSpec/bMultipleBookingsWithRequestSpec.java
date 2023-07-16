package gRequestSpecAndResponseSpec;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class bMultipleBookingsWithRequestSpec {
	
	RequestSpecification rs;
	
	@BeforeClass
	public void setupRequestSpec()
	{
		rs = RestAssured.given();
		rs
		 .given()
		 .log()
		 .all()
		 .baseUri("https://restful-booker.herokuapp.com/")
		 .contentType(ContentType.JSON);
		
	}

	@Test
	public void createBooking1()
	{
		
		RestAssured
			.given()
			.spec(rs)
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
			.when()
				.post()
			.then()
				.log()
				.all()
				.statusCode(200);
	
	}
	
	@Test
	public void updateBooking()
	{
		
		RestAssured
			.given()
				.spec(rs)
				.header("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
				.basePath("booking/1")
				.body("{\r\n"
						+ "    \"firstname\" : \"Shaik\",\r\n"
						+ "    \"lastname\" : \"Abdul\",\r\n"
						+ "    \"totalprice\" : 111,\r\n"
						+ "    \"depositpaid\" : true,\r\n"
						+ "    \"bookingdates\" : {\r\n"
						+ "        \"checkin\" : \"2018-01-01\",\r\n"
						+ "        \"checkout\" : \"2019-01-01\"\r\n"
						+ "    },\r\n"
						+ "    \"additionalneeds\" : \"Breakfast\"\r\n"
						+ "}")
			.when()
				.put()
			.then()
				.statusCode(200);
		
	}

}
