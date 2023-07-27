package rRemoveGetterandSetterMethodsByLambok;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import rRemoveGetterandSetterMethodsByLambok.cEmployee;

public class dBuilderAnnotation {

	public static void main(String[] args) throws JsonProcessingException {

		cEmployee employee = cEmployee.builder()
				.name("shaik")
				.age(30)
				.salary(32).build();
					
		
		ObjectMapper obmap = new ObjectMapper();
		System.out.println(obmap.writerWithDefaultPrettyPrinter().writeValueAsString(employee));
		
		cEmployee employee1 = employee.toBuilder()
				.name("abdul")
				.age(32).build();
		System.out.println(obmap.writerWithDefaultPrettyPrinter().writeValueAsString(employee1));

		
		
	}

}
