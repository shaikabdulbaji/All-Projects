package bInclude;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class bEmployeeWithAllDataWithAllNONAnnotations {

	public static void main(String[] args) throws JsonProcessingException {

		/*
		 * From this class we learn, if we know all fields of json it is fine and it will print
		   in console, if we dont know any parameter value then it will print null(default value
		   of String) or 0(default value of int).
		 * That 0 or null will print in json, to overcome this problem we go the jsoninclude 
		   annotation.
		 * "@JsonInclude(JsonInclude.Include.NON_DEFAULT)" this is line we can eliminate the unknown
		   values in json and print the json.
		   
		   ---------------------------------------------------------------------------------------
		 * For new born kids age is "0" and some non married persons value is "false", if we put the
		   age as "0" and married as "false" the age and married parameters are skipped by 
		   "@JsonInclude(JsonInclude.Include.NON_DEFAULT)" annotation while printing the json.
		   To overcome this problem we go to "@JsonInclude(JsonInclude.Include.NON_NULL)" method.
		 * "@JsonInclude(JsonInclude.Include.NON_NULL)" by using this annotation it will only skip
		   the "null" return types parameters only.
	
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
		
			----------------------------------------------------------------------------------------
		 * If we keep skillset and familymembers as empty then it will print as empty by giving this
		   "@JsonInclude(JsonInclude.Include.NON_NULL)" annotation while printing the json.
		   To overcome this problem we go to "@JsonInclude(JsonInclude.Include.NON_EMPTY)" method. 
		 * "@JsonInclude(JsonInclude.Include.NON_EMPTY)" by using this annotation it will only skip
		   the "empty" return types parameters only.
		 * If we want to exclude "empty" values use "@JsonInclude(JsonInclude.Include.NON_EMPTY)"
		   annotation.
		   -----------------------------------------------------------------------------------------
		    
		 * If we want to add more than one "JsonInclude" annotations we get are getting the error.
		 * To overcome this problem we use that "JsonInclude" with class level and property level
		   also.
		   
		   -----------------------------------------------------------------------------------------
		 * This "@JsonIncludeProperties(value = {" ", " "})" annotation is used when we want to print
		   particular fields then only we use this annotation, if give any value as spelling mistake
		   it will not through any error.
		 */
		
		cEmployeeSkills emp1 = new cEmployeeSkills();
		emp1.setName("Abdul");
		emp1.setAge(10);
		emp1.setMarried(false);
		emp1.setAddress("BLR");
		emp1.setMobileNo("123456789");
		
		emp1.setSkills("java");
		
		emp1.setSkillset(new ArrayList<String>());
		emp1.setFamilymembers(new HashMap<String,String>());
		
		ObjectMapper obmap = new ObjectMapper();
		String json = obmap.writerWithDefaultPrettyPrinter().writeValueAsString(emp1);
		System.out.println(json);
	}

}
