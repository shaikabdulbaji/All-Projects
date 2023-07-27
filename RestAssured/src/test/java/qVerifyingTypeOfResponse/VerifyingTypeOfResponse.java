package qVerifyingTypeOfResponse;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;

public class VerifyingTypeOfResponse {

	public static void main(String[] args) {
		
		// To verify response is a json object i.e "Map"
		RestAssured
			.get("https://run.mocky.io/v3/6ee7201e-2ff7-460c-8d1a-ee0208d379ad")
			.then()
			.body("", Matchers.instanceOf(Map.class));
		
		// To verify response is a json Array i.e "List"
		RestAssured
			.get("https://run.mocky.io/v3/1dbe476a-2e5d-45bf-a02b-1c74d781bc88")
			.then()
			.body("", Matchers.instanceOf(List.class));
		
		// To verify part of response is a json Array i.e "List"
		RestAssured
			.get("https://run.mocky.io/v3/6ee7201e-2ff7-460c-8d1a-ee0208d379ad")
			.then()
			.body("mobile", Matchers.instanceOf(List.class));
		
	}
	
	
	
}
