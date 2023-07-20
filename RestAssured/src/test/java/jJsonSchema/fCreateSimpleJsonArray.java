package jJsonSchema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;

public class fCreateSimpleJsonArray {
	
	public static void main(String[] args) {
		
		/*
		{
			  "id": 1,
			  "first_name": "Ira",
			  "last_name": "Chung",
			  "email": "ichung0@scientificamerican.com",
			  "gender": "Female"
		}
		*/
		
		
		
		Map<String, Object> empDetails = new HashMap<String, Object>();
		empDetails.put("id", 1);
		empDetails.put("first_name", "Ira");
		empDetails.put("last_name", "Chung");
		empDetails.put("email", "ichung0@scientificamerican.com");
		empDetails.put("gender", "Female");
		
		Map<String, Object> empDetails2 = new HashMap<String, Object>();
		empDetails2.put("id", 2);
		empDetails2.put("first_name", "Kristy");
		empDetails2.put("last_name", "Yersin");
		empDetails2.put("email", "kyersin1@com.com");
		empDetails2.put("gender", "Female");
		
		List<Map<String, Object>> allemp = new ArrayList<>();
		allemp.add(empDetails);
		allemp.add(empDetails2);
		
		RestAssured
		.given()
		.log()
		.all()
		.body(allemp)
		.get();
		
	
	}

}
