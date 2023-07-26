package mConverstionFromPOJOtoJSONandJSONtoPOJO;

import java.util.List;
import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class iConvertSimpleJSONArrayResponsetoPOJOUsingJavaList {

	public static void main(String[] args) {
		
		/*
		 * If we have one single json data then we mock that to api and we intilize somewhere with 
		   class name as "gAddressOfEmployee".
		  
		 * if we want to call that address class for parameters we use only "gAddressOfEmployee" like 
		   this.
		   
		 * if we have dual data then we want to call that address class for parameters we use 
		   only "gAddressOfEmployee[]"(array) like this.
		   
		 * if we have dual data then we want to call that address class for parameters we use 
		   only "TypeRef<List<gAddressOfEmployee>>(){}" like below program.
		 * if we use "List<gAddressOfEmployee>" like this we get error, then we go to "TypeRef<>" method
		 * "new TypeRef<List<gAddressOfEmployee>>(){}" this is anonyomous inner class and this is
		    abstract class
		 */
		
		

		List<gAddressOfEmployee> addresses = 
				RestAssured
					.get("https://run.mocky.io/v3/25ae98e0-a04a-4b65-b415-eb37502baa42")
					.as(new TypeRef<List<gAddressOfEmployee>>(){});
		
		System.out.println("No of Addresses :" +addresses.size());
		System.out.println(addresses.get(0).getCity());
		System.out.println(addresses.get(1).getCity());
		
		
		
	}

}
