package pSerializationAndDeseraialization;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pSerializationAndDeseraialization.aPerson;

public class cDeserialization_JsonObjectToPojoObject {

	public static void main(String[] args) throws JsonProcessingException {

		
		// Below line is the JSON Object
		String jsonResponse = "{\r\n"
				+ "  \"name\": \"Abdul\",\r\n"
				+ "  \"age\": 30\r\n"
				+ "}";
		
		// Now we can converting above JSON Object to Java Objecct
		ObjectMapper obmap = new ObjectMapper();
		aPerson javaObject = obmap.readValue(jsonResponse, aPerson.class);
		System.out.println(javaObject.getName());
		System.out.println(javaObject.getAge());
		
		// In java a Map can be represent the JSON Object, instead of converting like above we convert in
		// different way (or) insterd of converting to POJO remember "keys" only.
		Map<String, Object> map = obmap.readValue(jsonResponse, Map.class);
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));

		System.out.println("Both above process are Deserialization only");
		
		
		
	}

}
