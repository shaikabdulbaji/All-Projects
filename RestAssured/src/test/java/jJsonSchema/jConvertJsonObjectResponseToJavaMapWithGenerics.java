package jJsonSchema;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class jConvertJsonObjectResponseToJavaMapWithGenerics {

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
		
		
		
		Map<String, Object> JsonResponseAsMap = RestAssured
			.get("https://run.mocky.io/v3/b2f3caed-e3f2-4e62-8a96-f94868723a2a")
		//	.as(Map<String, Object>.class);
			// To make the above line as generic we are getting error, to overcome this there is one method "TypeRef"
			.as(new TypeRef<Map<String, Object>>() {});
		
		System.out.println("---------------");
		
		String fname = (String) JsonResponseAsMap.get("first_name");
		System.out.println(fname);
		
		System.out.println("---------------");
		
		//If we want to print only keys, there is one method
		JsonResponseAsMap.keySet().forEach(k -> System.out.println(k));
		
		
		
	}

}
