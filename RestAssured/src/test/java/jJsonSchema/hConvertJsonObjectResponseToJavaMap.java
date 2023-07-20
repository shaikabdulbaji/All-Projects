package jJsonSchema;

import java.util.Map;

import io.restassured.RestAssured;

public class hConvertJsonObjectResponseToJavaMap {

	public static void main(String[] args) {

		/*
		 {
			  "id": 1,
			  "first_name": "Ira",
			  "last_name": "Chung",
			  "email": "ichung0@scientificamerican.com",
			  "gender": "Female"
		 }
		 
		  * We can mock this data by using "designer.mocky.io" site.
		  * How can we mock the data, we can jack a normal json and put that json in mocky.io site and click on 
		  	generate button we can an "api" link.
		  * By using that link we get the response as below program.
		 
		 */
		
		
		
		Map JsonResponseAsMap = RestAssured
			.get("https://run.mocky.io/v3/b2f3caed-e3f2-4e62-8a96-f94868723a2a")
			.as(Map.class);
		
		String fname = (String) JsonResponseAsMap.get("first_name");
		System.out.println(fname);
		
		//If we want to print only keys, there is one method
		JsonResponseAsMap.keySet().forEach(k -> System.out.println(k));
		
		
		
	}

}
