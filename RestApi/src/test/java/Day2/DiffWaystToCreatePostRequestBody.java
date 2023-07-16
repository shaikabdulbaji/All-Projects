package Day2;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

/*
 
 given()
 	we use all prerequisistes in given() like content type, set cookies, add auth, add parm, set headers info etc.....
 
 when()
 	we use all requests in when() like get, post, put, delete 
 
 then()
 	we use all validations in then() like validate status code, extract response, extract headers cookies & response body...

	To identify the given(), when(), then() we suppose use three static packages

 */


/*
 
 Different ways to Create POST Request Body ?
 * POST Request body Creation Using HashMap
 * POST Request body Creation Using Org.json
 * POST Request body Creation Using POJO (Plain Old Java Object)
 * POST Request body Creation Using external json file
  
 */

public class DiffWaystToCreatePostRequestBody {
	
	
	// 1. POST Request body Creation Using HashMap
	@Test(priority=1)
	void testPostusingHashmap()
	{
		
		HashMap data = new HashMap();
		
		data.put("name", "Scott");
		data.put("phone", "987654321");
		data.put("Location", "France");
		
		String courseArr[] = {"C", "C++"};
		data.put("courses", courseArr);
		
		
		given()
			  .contentType("application/json")
			  .body(data)
			  
		.when()
			  .post("http://localhost:3000/students")
		
	    .then()
	    	  .statusCode(201)
	    	  .body("name",equalTo("Scott"))
	    	  .body("phone",equalTo("987654321"))
	    	  .body("Location",equalTo("France"))
	    	  .body("courses[0]", equalTo("C"))
	    	  .body("courses[1]", equalTo("C++"))
	    	  .header("Content-Type", "application/json; charset=utf-8")
	    	  .log().all();
		
	}
	
	// Deleteing student record
	@Test(priority=2)
	void testDelete()
	{
		
		given()
		
		.when()
		      .delete("http://localhost:3000/students/4")
		
		.then()
			  .statusCode(200);
	}

}
