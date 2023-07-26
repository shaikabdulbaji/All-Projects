package aJSONtoPOJO_Jackson;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class eEmployeeWithAllDataNON_DEFAULT {

	public static void main(String[] args) throws JsonProcessingException {

		/*
		 * From this class we learn, if we know all fields of json it is fine and it will print
		   in console, if we dont know any parameter value then it will print null(default value
		   of String) or 0(default value of int).
		 * That 0 or null will print in json, to overcome this problem we go the jsoninclude 
		   annotation.
		 * "@JsonInclude(JsonInclude.Include.NON_DEFAULT)" this is line we can eliminate the unknown
		   values in json and print the json. 
		 * If we want to exclude "default" values use "@JsonInclude(JsonInclude.Include.NON_DEFAULT)"
		   annotation.
		   
		    DataType	Default Value (for fields)
			byte				0
			short				0
			int					0
			long				0L
			float				0.0f
			double				0.0d
			char				'\u0000'
			String(or any object) null
			boolean				  false
		 */
		
		dEmployee emp1 = new dEmployee();
		emp1.setName("Abdul");
		emp1.setAge(28);
		//emp1.setMarried(true);
		//emp1.setAddress("BLR");
		emp1.setMobileNo("123456789");
		
		ObjectMapper obmap = new ObjectMapper();
		String json = obmap.writerWithDefaultPrettyPrinter().writeValueAsString(emp1);
		System.out.println(json);
	}

}
