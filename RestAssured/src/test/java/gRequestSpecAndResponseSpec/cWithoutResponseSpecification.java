package gRequestSpecAndResponseSpec;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class cWithoutResponseSpecification {

	ResponseSpecification res;
	
	@BeforeClass
	public void setUpException()
	{
		
		ResponseSpecification res = RestAssured.expect();
		res.statusCode(200);
		res.contentType(ContentType.JSON);
		res.time(Matchers.lessThan(5000L));
	
	}
	
	
	
	@Test
	public void creatBooking() {
		
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
				.post()
		//Validate response
		  .then()
				.log()
				.all()
				.spec(res);
		
	}
	
	
	@Test
	public void creatBooking1() {
		
		RestAssured
		//Build Request
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking")
				.body("{\r\n"
						+ "    \"firstname\" : \"Kareem\",\r\n"
						+ "    \"lastname\" : \"Rasool\",\r\n"
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
				.post()
		//Validate response
			.then()
				.log()
				.all()
				.spec(res);
		
	}

}
