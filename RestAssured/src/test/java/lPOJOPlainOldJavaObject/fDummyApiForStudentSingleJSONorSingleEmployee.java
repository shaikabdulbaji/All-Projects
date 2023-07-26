package lPOJOPlainOldJavaObject;

import io.restassured.RestAssured;

public class fDummyApiForStudentSingleJSONorSingleEmployee {

	public static void main(String[] args) {
	
	/*
	 * In old videos we learn to creat the JSON using Java List and Map, in that we can create
	   creafully without anymistake this POJO concept is so easy to create JSON.
	   
	   	{
		  "accountnum": 111,
		  "balance": 11.12,
		  "first_name": "Abdul",
		  "last_name": "Shaik",
		  "email": "sk@gmail.com",
		  "gender": "male"
		}
		
	 * In this video we learned to create single json using pojo 
	 */
	
	// To access the details of Student we can create Object for that class and create JSON
	eStudent s1  = new eStudent();
	s1.setAccountnum(111);
	s1.setBalance(11.12);
	s1.setFirst_name("Abdul");
	s1.setLast_name("Shaik");
	s1.setEmail("sk@gmail.com");
	s1.setGender("male");
	
	RestAssured
		.given()
		.log()
		.all()
		.body(s1)
		.when()
		.get();
	
	
	}
}
