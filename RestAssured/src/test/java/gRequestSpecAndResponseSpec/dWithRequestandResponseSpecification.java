package gRequestSpecAndResponseSpec;

import org.hamcrest.Matchers;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class dWithRequestandResponseSpecification {
	
	public static void main(String[] args) {
		
		RequestSpecification rs = RestAssured.given();
					rs
					 .given()
					 .log()
					 .all()
					 .baseUri("https://restful-booker.herokuapp.com/")
					 .basePath("booking")
					 .body("{\r\n"
								+ "    \"firstname\" : \"Shaik\",\r\n"
								+ "    \"lastname\" : \"Abdul\",\r\n"
								+ "    \"totalprice\" : 16,\r\n"
								+ "    \"depositpaid\" : false,\r\n"
								+ "    \"bookingdates\" : {\r\n"
								+ "        \"checkin\" : \"2024-01-01\",\r\n"
								+ "        \"checkout\" : \"2024-01-01\"\r\n"
								+ "    },\r\n"
								+ "    \"additionalneeds\" : \"Lunch\"\r\n"
								+ "}")
					 .contentType(ContentType.JSON);
					
		ResponseSpecification res = RestAssured.expect();
					res.statusCode(200);
					res.contentType(ContentType.JSON);
					res.time(Matchers.lessThan(5000L));
		
		RestAssured
				//Build Request
			//	.given()
				.given(rs, res)
			//	.given(rs) //To overcome this line also we have one special given method which accept both reqspe 
		                   //and resspec is above line
			//	.spec(rs)	//This spec method is used to call both reqspe and resspec
							//To overcome this line also we have one special given method which is above line
				
				//Hit Request & get response
				.post()
				//Validate response
				.then()
				.log()
				.all();
				//.spec(res);

	}
	

}
