package kDataShare;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class jTestModuleTwo {
	
	/*
	 * In this iTestModuleOne and jTestModuleTwo we combile and create Testng.xml file by this 
	 * we go and run that testng.xml file that xml file will run the test cases in parallel 
	 * in that cases there is override of data is possible.
	 
	 * To overcome this problem we want to go to thread local concept 
	 */
	
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
		
	 eDatastoreAsMap.setValue(gConstants.Booking_ID, id);
	 
	 System.out.println("Thread ID is -----> "+Thread.currentThread().getId()+
			 "Create Booking ID -----> "+eDatastoreAsMap.getValue(gConstants.Booking_ID));
	 
	}
	
	@Test(priority = 2)
	public void retrieveBooking() throws InterruptedException
	{
		Thread.sleep(10000);
		System.out.println("Thread ID is -----> "+Thread.currentThread().getId()+
				 "Retrieve Booking ID -----> "+eDatastoreAsMap.getValue(gConstants.Booking_ID));
		
		int id = (int) eDatastoreAsMap.getValue(gConstants.Booking_ID);
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
