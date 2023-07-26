package mConverstionFromPOJOtoJSONandJSONtoPOJO;

import io.restassured.RestAssured;

public class bJsonObjectResponseToPojo {

	public static void main(String[] args) {

		/*
		 * Till now we do "serialization" means mock the api and hit that api we get then json payload for that 
		   getting json payload we creat pojo class and the creat object of it and we need to set the 
		   values.
		   
		 * From now onwards we do "deserialization" we get the particular json as response now this 
		   response i want to convert to pojo. 
		   
		 * since we are converting to aEmployee POJO so return typewill be same as POJO class
		  
		 * Sometimes you get "UnrecognigedException" to overcome that exception we use 
		   "@JsonIgnoreProperties(ignoreUnknown = true)" this annotaion on the above of class.
		 */
		
		
		aEmployee emp = RestAssured
			.get("https://run.mocky.io/v3/3900565f-7ca9-4bc6-a882-d04bf21170b7")
			.as(aEmployee.class);

		int agee = emp.getAge();
		System.out.println(agee);
		
		System.out.println(emp.getFirstName());
		
		
	}

}
