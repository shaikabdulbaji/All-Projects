package mConverstionFromPOJOtoJSONandJSONtoPOJO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class cEmployeeWithAddress {
	
	private String firstName;
	private String lastName;
	private String profession;
	private int age;
	private double salary;
	private dAddressOfEmployee address;
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public dAddressOfEmployee getAddress() {
		return address;
	}
	public void setAddress(dAddressOfEmployee address) {
		this.address = address;
	}
}