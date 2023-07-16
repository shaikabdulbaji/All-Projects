package hHeader;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class dcDefaultValue1 {
	
	@BeforeTest
	public void setUp()
	{
		RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
		RestAssured.basePath = "booking";
		System.out.println("In setUp");
		RequestSpecification reqspec = RestAssured.given().log().all();
		ResponseSpecification resspec = RestAssured.expect().statusCode(200);
	}
	
	
	
	@Test
	public void createBooking1()
	{
		RestAssured
				.given()
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
				.log()
				.all();
	}
	
	@Test
	public void createBooking2()
	{
		RestAssured
				.given()
				.body("{\r\n"
						+ "    \"firstname\" : \"Shaik1\",\r\n"
						+ "    \"lastname\" : \"Abdul1\",\r\n"
						+ "    \"totalprice\" : 20,\r\n"
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
				.log()
				.all();
	}

}
