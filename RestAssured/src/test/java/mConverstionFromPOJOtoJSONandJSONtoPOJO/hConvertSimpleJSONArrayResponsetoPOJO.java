package mConverstionFromPOJOtoJSONandJSONtoPOJO;

import io.restassured.RestAssured;

public class hConvertSimpleJSONArrayResponsetoPOJO {

	public static void main(String[] args) {

		gAddressOfEmployee[] addresses = 
				RestAssured
					.get("https://run.mocky.io/v3/25ae98e0-a04a-4b65-b415-eb37502baa42")
					.as(gAddressOfEmployee[].class);
		
		System.out.println("No of Addresses :" +addresses.length);
		System.out.println(addresses[0].getCity());
		System.out.println(addresses[1].getCity());
		
		
		
	}

}
