package kDataShare;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class sGetBookingDetailsUsingITestContext2bygetsuite {
	
	@Test
	public void getBooking(ITestContext context)
	{ 
				RestAssured
				.given()
				.log()
				.all()
				.get("https://restful-booker.herokuapp.com/booking/"+context.getSuite().getAttribute("bookingid"))
				.then()
				.log()
				.all()
				.extract()
				.response();
	}
	
}
