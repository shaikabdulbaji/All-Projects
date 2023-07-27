package sRetry;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class aCreateBooking {

	// If we put "static" to method while calling time we won't create object
	public static int createBooking()
	{
		int randomNumber = (int)((Math.random() * (50-1))+1);
		System.out.println(randomNumber);
		
		if(randomNumber % 2 == 0)
		{
			System.out.println("Booking Creating..........");
			return RestAssured
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
			.post("https://restful-booker.herokuapp.com/booking")
			.statusCode();
		}
		else 
		{
			System.out.println("Booking Creation Failed");
			return 0;
		}
	}
	
	
	
	public static int createBooking(String url)
	{
		int randomNumber = (int)((Math.random() * (50-1))+1);
		System.out.println(randomNumber);
		
		if(randomNumber % 2 == 0)
		{
			System.out.println("Booking Creating..........");
			return RestAssured
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
			.post(url)
			.statusCode();
		}
		else 
		{
			System.out.println("Booking Creation Failed");
			return 0;
		}
	}
	
	
	public static Response createBooking(String url, String body)
	{
		int randomNumber = (int)((Math.random() * (50-1))+1);
		System.out.println(randomNumber);
		
		if(randomNumber % 2 == 0)
		{
			System.out.println("Booking Creating..........");
			return RestAssured
			.given()
			.body(body)
			.contentType(ContentType.JSON)
			.post(url);
		}
		else 
		{
			System.out.println("Booking Creation Failed");
			return null;
		}
	}

}
