package jJsonSchema;

import java.util.Map;

import io.restassured.RestAssured;

public class iConvertNestedJsonObjectResponseToJavaMap {

	public static void main(String[] args) {

		/*
		 {
		  "id": 1,
		  "first_name": "Ira",
		  "last_name": "Chung",
		  "email": "ichung0@scientificamerican.com",
		  "gender": "Female",
		  "skills": {
		    "name": "testing",
		    "proficiency": "medium"
		  }
		}
		 
		  * We can mock this data by using "designer.mocky.io" site.
		  * How can we mock the data, we can jack a normal json and put that json in mocky.io site and click on 
		  	generate button we can an "api" link.
		  * By using that link we get the response as below program.
		 
		 */
		
		
		
		Map JsonResponseAsMap = RestAssured
			.get("https://run.mocky.io/v3/82308ee1-a66e-4a39-a324-6ad3fa8461f8")
			.as(Map.class);
		
		//If we want to get the "first_name" as response (or) If we want to get the any key as response we give 
		// "first_name"
		String fname = (String) JsonResponseAsMap.get("first_name");
		System.out.println(fname);
		
		System.out.println("-------------------");
		
		//If we want to print only keys, there is one method
		JsonResponseAsMap.keySet().forEach(k -> System.out.println(k));
		
		System.out.println("-------------------");
		
		//for nested json If we want to get the keys as response under skills
		Map<String, String> skills = (Map<String, String>) JsonResponseAsMap.get("skills");
		System.out.println(skills.get("name"));
		System.out.println(skills.get("proficiency"));
		
		
		
	}

}
