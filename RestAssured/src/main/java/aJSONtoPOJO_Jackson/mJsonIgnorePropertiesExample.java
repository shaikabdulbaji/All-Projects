package aJSONtoPOJO_Jackson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class mJsonIgnorePropertiesExample {
	
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
	
	/*
	 * Serialization - This is the process in which a Java Object is converted to JSON Object means
	   we are creating the object of POJO class and setting the values and then we are converting to 
	   JSON Object.
	 * Reverse of it is call Deserialization.
	 * Deserialization - This is the process in which we have String of JSON Object and that will 
	   pass to a POJO class and then we get the values and fetch the values out of that JSON.
	  
	 * Sometime in POJO class for married we put "string"s and call setter and getter methods it was 
	   get like isMarried.
	 * Sometime in POJO class for married we put "boolean" and call setter and getter methods it was 
	   get like getMarried.
	   
	 */
		/*
		String json = "{\r\n"
				+ "  \"name\": \"Abdul\",\r\n"
				+ "  \"age\": 30,\r\n"
				+ "  \"married\": true,\r\n"
				+ "  \"address\": \"BLR\",\r\n"
				+ "  \"mobileNo\": \"123456789\"\r\n"
				+ "}";
		
		
		String json = "{\r\n"
				+ "  \"name\": \"Abdul\",\r\n"
				+ "  \"age\": 30,\r\n"
				+ "  \"married\": true\r\n"
				+ "}";
	// In above "json" we miss some fields then also it not through any error returns default values.
		*/
		
		String json = "{\r\n"
				+ "  \"name\": \"Abdul\",\r\n"
				+ "  \"age\": 30,\r\n"
				+ "  \"married\": true,\r\n"
				+ "  \"skills\": \"java\"\r\n"
				+ "}";
//		In above "json" we add some fields then it through some exception. exception is shown below
//		Exception in thread "main" com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException:
//		Unrecognized field "skills" (class aJSONtoPOJO_Jackson.lEmployee), not marked as ignorable 
//		(5 known properties: "name", "married", "age", "mobileNo", "address"])
		
// To overcome the above exception, we use "@JsonIgnoreProperties(ignoreUnknown=true)" above the POJO class		

		
		ObjectMapper obmap = new ObjectMapper();
		lEmployee emp = obmap.readValue(json, lEmployee.class);
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getAddress());
		System.out.println(emp.getMobileNo());
		System.out.println(emp.getMarried());
	}
}
