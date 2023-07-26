package mConverstionFromPOJOtoJSONandJSONtoPOJO;

import javax.mail.Address;

import io.restassured.RestAssured;

public class fConvertaSomePortionOfNestedJsonObjectToPojo {

	public static void main(String[] args) {

		/*
		 * This is the important interview question, in the we are giving "dAddressOfEmployee" this
		   is the class name of the address where we initilize the address.
		 */
		
		
		
		dAddressOfEmployee address = RestAssured
				.get("https://run.mocky.io/v3/ea8892e0-1050-4130-893b-c3b134baea26")
				.jsonPath()
				.getObject("address", dAddressOfEmployee.class);
		
	   System.out.println(address.getState());
		
		
	}

}
