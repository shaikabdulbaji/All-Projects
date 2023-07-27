package aJSONtoPOJO_Jackson;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class cUpdateJSONWithoutAddressclassPOJO {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		/*
		 * Creating lengthy request payload for an API multiple timesusing POJO or Map or List may
		   not be a good idea. We can have a sample payload and just update what we required at that
		   run ime. 
		 * To overcome the above method we go for "TypeReference" method
		 * "TypeReference" is a abstraact class.
		 * from this what we learn means, we can create & remove & change the parameters without 
		   pojo(Address class).
		 * why we use "Map<String, Object>" is that payload is looks like key value pair, to change
		   value we use Map.	 
		 */
		
		ObjectMapper obmap = new ObjectMapper();
		Map<String, Object> address = obmap.readValue(
				new File("C:\\Users\\Asus\\OneDrive\\Desktop\\Ecli[pse workspace\\RestAssured\\src\\test\\resource\\aPayloads\\address.json"), 
				new TypeReference<Map<String, Object>>(){});
	
		System.out.println(address.get("city"));
		
		//This below line will "change" the parameter of city in json
		address.put("city", "Delhi");
		
		//This below line will "add" the parameter in json
		address.put("pin", "12345");
		
		//This below line will "remove" the parameter in json
		address.remove("houseNo");
		
		System.out.println(obmap.writerWithDefaultPrettyPrinter().writeValueAsString(address));
		
	}

}
