package jJsonSchema;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class lHandlingDynamicJsonResponse {

	public static void main(String[] args) {
		
		/* 
		 
		 [
		  {
		    "accountnum": 111,
		    "balance": 20.3,
		    "first_name": "Ira",
		    "last_name": "Chung",
		    "email": "ichung0@scientificamerican.com",
		    "gender": "Female"
		  },
		  {
		    "accountnum": 222,
		    "balance": 200.3,
		    "first_name": "Ira",
		    "last_name": "Chung",
		    "email": "ichung0@scientificamerican.com",
		    "gender": "Female"
		  }
		]
		
		* In the above JSON we have same details but the program is related to "Dynamic JSON"
		* That dynamic is the one person have 2 bank accounts in same bank with different acc.no and bal 
		  that is dynamic
		 
		 */
		
		
		

//		Response res = RestAssured
//			.get("https://run.mocky.io/v3/1c86e76e-5a46-483c-962d-ffe2ee7e2b3b");
//		
//		Map responseasmap = res.as(Map.class);
//		System.out.println(responseasmap.keySet());	
		
		/*
		 * Exception in thread "main" 
		   com.fasterxml.jackson.databind.exc.MismatchedInputException: 
		   Cannot deserialize instance of `java.util.LinkedHashMap<java.lang.Object,java.lang.Object>` 
		   out of START_ARRAY token
		 */
		
		Response res1 = RestAssured
			.get("https://run.mocky.io/v3/d35bb226-d0cd-4b0a-b4f9-b93fad189860");
		
		List responseasList = res1.as(List.class);
		System.out.println(responseasList.size());
		
		/*
		Exception in thread "main" 
		com.fasterxml.jackson.databind.exc.MismatchedInputException: 
		Cannot deserialize instance of `java.util.ArrayList<java.lang.Object>` 
		out of START_OBJECT token
		*/
		
		// To Overcome the above problem we want look into "instance of" method.
		
		
		
	}

}
