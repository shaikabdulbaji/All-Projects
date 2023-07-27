package nJSONtoPOJO_Jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import nJSONtoPOJO_Jackson.aAddress;



public class bJSONtoPOJOAddress {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {

		/*
		 * Class Object Mapper helps to convert a JSON to POJO and viceversa.
		 * Class Object Mapper is helps in many ways as of now we are using it for reading and 
		   writing the data from file.
		 */
		
		ObjectMapper obmap = new ObjectMapper();
		aAddress address = obmap.readValue(
				new File("C:\\Users\\Asus\\OneDrive\\Desktop\\Ecli[pse workspace\\RestAssured\\src\\test\\resource\\aPayloads\\address.json"), 
				aAddress.class);
		
		System.out.println(address.getCity());
		System.out.println(address.getState());
		
		/*
		 * Below line is the good option if we want to change any parameter in JSON we can change
		   it by using set method.
		 * It will change temporarly but not it will change permanently in JSON file.
		 */
		
		address.setCity("Guntur");
		System.out.println(address.getCity());
		
		//This below two lines will print the JSON in single line, but it was not in readable format
		String updatedjson = obmap.writeValueAsString(address);
		System.out.println(updatedjson);
		
		//This below line will print the JSON in Readable format like normal JSON
		System.out.println(obmap.writerWithDefaultPrettyPrinter().writeValueAsString(address));
		
		
	}

}
