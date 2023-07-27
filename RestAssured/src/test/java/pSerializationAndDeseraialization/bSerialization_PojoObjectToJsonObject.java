package pSerializationAndDeseraialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pSerializationAndDeseraialization.aPerson;

public class bSerialization_PojoObjectToJsonObject {

	public static void main(String[] args) throws JsonProcessingException {

		// Below line is the Java Objecct
		aPerson per = new aPerson();
		per.setName("Shaik");
		per.setAge(28);
		
		// Now we can converting above Java Object to JSON Object
		ObjectMapper obmap = new ObjectMapper();
		String jsonObject = obmap.writerWithDefaultPrettyPrinter().writeValueAsString(per);
		System.out.println(jsonObject);
		// without this "writerWithDefaultPrettyPrinter()" json will print in single line 
		// with this "writerWithDefaultPrettyPrinter()" json will print in payload or readable format
		
		System.out.println("The above all process is called as Serialization");
		
		
		
	}

}
