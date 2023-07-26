package lPOJOPlainOldJavaObject;

import io.restassured.RestAssured;

public class jCreateNestedJsonPayload {

	public static void main(String[] args) {

		/*
		 * In last video we learned to create two sets of data json array now in this video we learn 
		   to create nested json payload
		   
		   {
			  "first_name": "shaik",
			  "last_name": "abdul",
			  "proffesion": "software tester",
			  "address": {
			    "house.no": 404,
			    "streetName": "Not Found",
			    "city": "Bengaluru",
			    "state": "KA",
			    "country": "INDIA"
			  }
			}
 
		 */
		
		
		
		
		hEmployee employee = new hEmployee();
		employee.setFirst_name("shaik");
		employee.setLast_name("Abdul");
		employee.setProffesion("Software Tester");
		
		// For adding address details we want to create the object of address class like below
		iAddressForEmployee address = new iAddressForEmployee();
		address.setHousNo(404);
		address.setStreetName("Not Found");
		address.setCity("Bengaluru");
		address.setState("KA");
		address.setCity("INDIA");
		
		employee.setAddress(address);
		
		RestAssured
			.given()
			.log()
			.all()
			.body(employee)
			.post();
		
	}

}
