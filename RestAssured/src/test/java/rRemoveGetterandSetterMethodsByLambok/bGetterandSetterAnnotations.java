package rRemoveGetterandSetterMethodsByLambok;

import rRemoveGetterandSetterMethodsByLambok.aEmployee;

public class bGetterandSetterAnnotations {

	public static void main(String[] args) {

		aEmployee emp = new aEmployee();
		emp.setName("Abdul");
		emp.setAge(31);
		emp.setSalary(32);
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getSalary());
		
		
		
	}

}
