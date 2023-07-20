package jJsonSchema;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class dCreateSimpleJsonObjectUsingMap {
	
	public static void main(String[] args) {
		
		Map<String, String> jsonobjectpayload = new HashMap<>();
		jsonobjectpayload.put("put", "1");
		jsonobjectpayload.put("firstname", "shaik");
		jsonobjectpayload.put("lastname", "abdul");
		jsonobjectpayload.put("age", "28");
		jsonobjectpayload.put("married", "false");
		jsonobjectpayload.put("salary", "123.45");
		
		RestAssured
			.given()
			.log()
			.all()
			.body(jsonobjectpayload)
			.get();
		
	}
	

}
