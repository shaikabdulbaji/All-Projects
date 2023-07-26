package lPOJOPlainOldJavaObject;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class gDummyApiForStudentTwoSetsofDataForJSONArray {

	public static void main(String[] args) {
	
	/*
	 * In old videos we learn to creat the JSON using Java List and Map, in that we can create
	   creafully without anymistake this POJO concept is so "easy to create Single JSON and
	   Array JSON".
	   
	 * In real time we will not get this much of simple payloads we get mostly nested payloads only
	   
	   	[
		  {
		    "accountnum": 111,
		    "balance": 11.12,
		    "first_name": "Abdul",
		    "last_name": "Shaik",
		    "email": "sk@gmail.com",
		    "gender": "male"
		  },
		  {
		    "accountnum": 222,
		    "balance": 12.13,
		    "first_name": "Rasool",
		    "last_name": "Kareem",
		    "email": "rk@gmail.com",
		    "gender": "male"
		  }
		]
		
	  * In last video we learned to create single json using pojo now in this video we learn to 
	    create two sets of data json array payload.
		
	 */
	
	// To access the details of Student we can create Object for that class and create JSON
	eStudent s1  = new eStudent();
	s1.setAccountnum(111);
	s1.setBalance(11.12);
	s1.setFirst_name("Abdul");
	s1.setLast_name("Shaik");
	s1.setEmail("sk@gmail.com");
	s1.setGender("male");
	
	eStudent s2  = new eStudent();
	s2.setAccountnum(222);
	s2.setBalance(12.13);
	s2.setFirst_name("Rasool");
	s2.setLast_name("Kareem");
	s2.setEmail("rk@gmail.com");
	s2.setGender("male");
	
	List<eStudent> jsonArrayStudent = new ArrayList<>();
	jsonArrayStudent.add(s1);
	jsonArrayStudent.add(s2);
	
	RestAssured
		.given()
		.log()
		.all()
		.body(jsonArrayStudent)
		.when()
		.get();
	
	
	}
}
