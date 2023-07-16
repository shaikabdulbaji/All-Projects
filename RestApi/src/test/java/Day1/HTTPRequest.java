package Day1;

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

public class HTTPRequest 
{
	
	int id;
	
	// Get Request
	@Test(priority=1, enabled=true )
	void getUsers()
	{
		given() 
		
		.when()
			.get("https://reqres.in/api/users?page=2")
			
		.then()
			.statusCode(200)
			.body("page",equalTo(2))
			.log().all();
		
	}
	
	// Post Request
	@Test(priority=2, enabled=true)
	void createUser()
	{
	  /* 
	   * We used HashMap because in POST Request we have to pass JSON, in JSON there are key value pairs that's why we 
	     use HahshMap.
	   */
		   
		HashMap data = new HashMap();
		data.put("name", "abdul");
		data.put("job", "QA");
		
		id=given()
			.contentType("application/json")
			.body(data)
		
		.when()
			.post("https://reqres.in/api/users")
			.jsonPath().getInt("id");
		
//		.then()
//			.statusCode(201)
//			.log().all();
		
	}
	
	
	@Test(priority=3, enabled=true, dependsOnMethods= {"createUser"})
	void updateUser()
	{
		HashMap data = new HashMap();
		data.put("name", "baji");
		data.put("job", "ITBT");
		
		given()
			.contentType("application/json")
			.body(data)
		
		.when()
			.put("https://reqres.in/api/users/"+id)
		
		.then()
			.statusCode(200)
			.log().all();
		
	}
	
	@Test(priority=4, enabled=true)
	void deleteUser()
	{
		
		given()
			
		
		.when()
			.delete("https://reqres.in/api/users/"+id)
		
		.then()
			.statusCode(204)
			.log().all();
	}
}
