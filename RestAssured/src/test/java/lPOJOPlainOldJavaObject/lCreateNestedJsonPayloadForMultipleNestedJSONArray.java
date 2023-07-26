package lPOJOPlainOldJavaObject;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class lCreateNestedJsonPayloadForMultipleNestedJSONArray {

	public static void main(String[] args) {

		/*
		 * In last video we learn to create nested json payload now in this video we learn abot how 
		   create Create Nested Json Payload For Multiple Nested JSON Array
		  
		  	{
			  "first_name": "shaik",
			  "last_name": "abdul",
			  "proffesion": "software tester",
			  "address": [
			    {
			      "house.no": 404,
			      "streetName": "Not Found",
			      "city": "Bengaluru",
			      "state": "KA",
			      "country": "INDIA"
			    },
			    {
			      "house.no": 204,
			      "streetName": "Not Found",
			      "city": "guntur",
			      "state": "AP",
			      "country": "INDIA"
			    }
			  ]
			}
 
		 */
		
		
		
		
		kEmployeeWithMultipleNestedJSONArrays employee = new kEmployeeWithMultipleNestedJSONArrays();
		employee.setFirst_name("shaik");
		employee.setLast_name("Abdul");
		employee.setProffesion("Software Tester");
		
		// For adding address details we want to create the object of address class like below
		iAddressForEmployee address = new iAddressForEmployee();
		address.setHousNo(404);
		address.setStreetName("Not Found");
		address.setCity("Bengaluru");
		address.setState("KA");
		address.setCountry("INDIA");
		
		iAddressForEmployee address1 = new iAddressForEmployee();
		address1.setHousNo(204);
		address1.setStreetName("Not Found");
		address1.setCity("Guntur");
		address1.setState("AP");
		address1.setCountry("INDIA");
		
		List<iAddressForEmployee> alladdress = new ArrayList<>();
		alladdress.add(address);
		alladdress.add(address1);
		
		employee.setAddress(alladdress);
		
		RestAssured
			.given()
			.log()
			.all()
			.body(employee)
			.post();
		
	}

}
