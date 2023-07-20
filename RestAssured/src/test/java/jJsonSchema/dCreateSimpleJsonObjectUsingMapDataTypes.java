package jJsonSchema;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class dCreateSimpleJsonObjectUsingMapDataTypes {
	
	public static void main(String[] args) {
		
//		Map<String, Object> jsonobjectpayload = new HashMap<>();
		Map<String, Object> jsonobjectpayload = new LinkedHashMap<>();
		jsonobjectpayload.put("put", 1);
		jsonobjectpayload.put("firstname", "shaik");
		jsonobjectpayload.put("lastname", "abdul");
		jsonobjectpayload.put("age", 28);
		jsonobjectpayload.put("married", false);
		jsonobjectpayload.put("salary", 123.45);
		
		RestAssured
			.given()
			.log()
			.all()
			.body(jsonobjectpayload)
			.get();
		
		/*
		 * We get the response like this(below), while giving json we follow some pattern but it was given the 
		   response in random order to get that json in sequential order we overwrite the object with LinkedHashMap. 
		 * {"firstname":"shaik","salary":123.45,"married":false,"put":1,"age":28,"lastname":"abdul"} 
		 */
		
		
	}
	

}
