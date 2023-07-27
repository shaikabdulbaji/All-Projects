package sRetry;

import java.time.Duration;

import org.awaitility.Awaitility;

import io.restassured.response.Response;

public class aCreateBookingTests {

	public static Response response;
	
	public static void main(String[] args) {
		/*
		for(int i=0; i<5; i++)
		{
			if(aCreateBooking.createBooking() == 200)
				break;
		}
		*/
		
		/*
		Awaitility
			.await()
			.atMost(Duration.ofSeconds(30))
			.pollInterval(Duration.ofSeconds(2))
			.until(() -> aCreateBooking.createBooking() == 200);
		*/
		
		/*
		String url ="https://restful-booker.herokuapp.com/booking";
		Awaitility
			.await()
			.atMost(Duration.ofSeconds(30))
			.pollInterval(Duration.ofSeconds(2))
			.until(() -> aCreateBooking.createBooking() == 200);
		*/
		
		String url ="https://restful-booker.herokuapp.com/booking";
		String body = "{\r\n"
				+ "    \"firstname\" : \"Shaik\",\r\n"
				+ "    \"lastname\" : \"Abdul\",\r\n"
				+ "    \"totalprice\" : 16,\r\n"
				+ "    \"depositpaid\" : false,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2024-01-01\",\r\n"
				+ "        \"checkout\" : \"2024-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Lunch\"\r\n"
				+ "}";
		Awaitility
			.await()
			.atMost(Duration.ofSeconds(30))
			.pollInterval(Duration.ofSeconds(2))
			.until(() -> {
				response = aCreateBooking.createBooking(url,body);
				if(response != null)
					return true;
				else
					return false;
				});
		System.out.println(response.prettyPrint().toString());
	}

}
