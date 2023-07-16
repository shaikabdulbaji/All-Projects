package aCreateBooking;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.Validatable;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class POSTRequest {
	
	public static void main(String[] args) {
		
		/*
		//Build Request
		RequestSpecification rs = RestAssured.given();
		RequestSpecification RequestSpecification = rs.log().all();
		rs.baseUri("https://restful-booker.herokuapp.com/");
		rs.basePath("booking");
		
		rs.body("{\r\n"
				+ "    \"firstname\" : \"Shaik\",\r\n"
				+ "    \"lastname\" : \"Abdul\",\r\n"
				+ "    \"totalprice\" : 16,\r\n"
				+ "    \"depositpaid\" : false,\r\n"
				+ "    \"bookingdates\" : {\r\n"
				+ "        \"checkin\" : \"2024-01-01\",\r\n"
				+ "        \"checkout\" : \"2024-01-01\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\" : \"Lunch\"\r\n"
				+ "}");
		
		rs.contentType(ContentType.JSON);
		
		
		//Hit Request & get response
		Response res = rs.post();
		

   	   //Validate response
	     ValidatableResponse valres = res.then().log().all(); 
	   valres.statusCode(200);
	   */
		
		RestAssured
				//Build Request
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
				.contentType(ContentType.JSON)
				//Hit Request & get response
				.post()
				//Validate response
				.then()
				.log()
				.all()
				.statusCode(200);

	}
	

}
