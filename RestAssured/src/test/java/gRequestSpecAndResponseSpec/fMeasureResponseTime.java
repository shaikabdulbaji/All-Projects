package gRequestSpecAndResponseSpec;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class fMeasureResponseTime {
	
	
	public static void main(String[] args) {
		
	
	
			Response res = RestAssured
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
					.post();
					
					 // Response in milliseconds "time()"
					 long responsetimeinmilliseconds = res.time();
					 System.out.println("Response Time in Milliseconds : " +responsetimeinmilliseconds);
					 
					// Response in Seconds "timeIn(TimeUnit.SECONDS)"
					 long responsetimeinsecconds = res.timeIn(TimeUnit.SECONDS);
					 System.out.println("Response Time in Seconds : " +responsetimeinsecconds);
					 
					// Response in milliseconds "getTime()"
					 long responsetimeinmilliseconds1 = res.getTime();
					 System.out.println("Response Time in Milliseconds 1 : " +responsetimeinmilliseconds1);
					 
					// Response in Seconds "getTimeIn(TimeUnit.SECONDS)"
					 long responsetimeinsecconds1 = res.getTimeIn(TimeUnit.SECONDS);
					 System.out.println("Response Time in Seconds 1 : " +responsetimeinsecconds1);
					 
					 // Response time inbetween less than and greater than
					 res.then().time(Matchers.lessThan(5000L));
					 res.then().time(Matchers.lessThan(4000L));
					 
					 // Response time inbetween both less than and greater than
					 res.then()
					 	.time(Matchers.both(Matchers.lessThan(5000L))
					 			.and(Matchers.greaterThan(2000L)));
					 
					 res.then().time(Matchers.lessThan(4L), TimeUnit.SECONDS);
					
			
	}

}
