package kDataShare;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class fShareDataAmongMethodsWithCommonDataClassWithMap {
	
	@Test(priority = 1)
	public void CreateAndRetriveBooking()
	{
	 int id = RestAssured
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
		.post()
		.then()
		.log()
		.all()
		.statusCode(200)
		.extract()
		.jsonPath()
		.getInt("bookingid");
		
	 eDatastoreAsMap.setValue("bookingid", id);
	 
	}
	
	@Test(priority = 2)
	public void retrieveBooking()
	{
		int id = (int) eDatastoreAsMap.getValue("bookingid");
		Response response = 
				RestAssured
				.given()
				.log()
				.all()
				.get("https://restful-booker.herokuapp.com/booking/"+id)
				.then()
				.log()
				.all()
				.extract()
				.response();
	}

}
