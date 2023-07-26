package mConverstionFromPOJOtoJSONandJSONtoPOJO;

import io.restassured.RestAssured;

public class eNestedJsonObjectToPojo {

	public static void main(String[] args) {

		cEmployeeWithAddress employee = RestAssured
				.get("https://run.mocky.io/v3/ea8892e0-1050-4130-893b-c3b134baea26")
			.as(cEmployeeWithAddress.class);
		
		String fn = employee.getFirstName();
		System.out.println(fn);
		
		System.out.println(employee.getAddress().getCity());
		System.out.println(employee.getAddress().getCountry());
		System.out.println(employee.getAddress().getHousNo());
		System.out.println(employee.getAddress().getState());
		System.out.println(employee.getAddress().getStreetName());
		
	}

}
