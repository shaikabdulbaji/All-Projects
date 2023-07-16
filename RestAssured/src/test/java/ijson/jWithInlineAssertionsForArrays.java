package ijson;

import org.hamcrest.Matchers;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

public class jWithInlineAssertionsForArrays {
	
	public static void main(String[] args) {
		
		
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com/booking")
			.when()
				.get()
			.then()
				.log()
				.all()
		//		.body("bookingid", Matchers.hasItems(8,9));
				.body("bookingid", Matchers.hasItems(1041,10));
				
	}

}
