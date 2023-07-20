package jJsonSchema;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class eCreateNestedJsonObjects {
	
	public static void main(String[] args) {
		
		// Simply a JSON is a Java Map
		
		
		Map<String, Object> payload = new LinkedHashMap<>();
		payload.put("id", 1);
		payload.put("firstname", "shaik");
		payload.put("lastname", "abdul");
		payload.put("age", 28);
		payload.put("married", false);
		payload.put("salary", 123.45);
		
		Map<String, Object> addressmappayload = new LinkedHashMap<String, Object>();
		addressmappayload.put("no", "#81");
		addressmappayload.put("street name", "ABC line");
		addressmappayload.put("city", "bengaluru");
		addressmappayload.put("state", "ka");
		
		payload.put("adress", addressmappayload);
		
		RestAssured
			.given()
			.log()
			.all()
			.body(payload)
			.get();
	}

}
